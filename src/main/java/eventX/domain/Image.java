package eventX.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by SQIM-User on 2017/08/11.
 */

@Embeddable
@Data
@ToString(exclude = { "data" })
public class Image
{
    public enum Type {

        JPEG("image/jpeg", "jpg"), PNG("image/png", "png"), BMP("image/bmp",
                "bmp"), WBMP("image/vnd.wap.wbmp", "wbmp"), GIF("image/gif", "gif");

        protected final String mime;

        protected final String ext;

        private Type(String mime, String ext) {
            this.mime = mime;
            this.ext = ext;
        }

        public String getMime() {
            return mime;
        }

        public String getExt() {
            return ext;
        }

        public static Type fromString(String str) {
            if (str == null)
                return null;
            str = str.toUpperCase().trim();
            if (str.equals("JPG") || str.equals("JPEG"))
                return JPEG;
            if (str.equals("PNG"))
                return PNG;
            if (str.equals("BMP"))
                return BMP;
            if (str.equals("GIF"))
                return GIF;
            return null;
        }
    }

    @Column(name = "IMAGE_WIDTH")
    @Min(1)
    protected int width = 0;

    @Column(name = "IMAGE_HEIGHT")
    @Min(1)
    protected int height = 0;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "IMAGE_TYPE")
    @NotNull
    protected Type type = null;

    @Lob()
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "IMAGE_DATA")
    @NotNull
    protected byte[] data = null;

    @Column(name = "IMAGE_DATA_LENGTH")
    protected int dataLength = 0;

    @Column(name = "IMAGE_ORIGINAL_FILENAME")
    protected String originalFilename;

    @Column(name = "IMAGE_HASH")
    @NotNull
    protected String hash = null;

    @Transient
    public boolean isPortrait() {
        return height > width;
    }

    @Transient
    public boolean isLandscape() {
        return width > height;
    }

    @Transient
    public boolean isSquare() {
        return width == height;
    }

    @Transient
    public double getRatio() {
        return (double) width / (double) height;
    }
}