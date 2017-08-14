package eventX.Factory;

import eventX.domain.Activity;
import eventX.domain.Image;

import java.util.Map;

/**
 * Created by SQIM-User on 2017/08/14.
 */
public class ImageFactory {
    public static Image getImage() {
        Image image = new Image();
        image.setHeight(15);
        image.setDataLength(10);
        image.setHash("pixel");
        image.setOriginalFilename("photo");

        //toDO

        return image;

    }
}
