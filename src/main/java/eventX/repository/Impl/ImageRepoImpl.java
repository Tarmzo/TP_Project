package eventX.repository.Impl;

import eventX.domain.Image;
import eventX.repository.ImageRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by SQIM-User on 2017/08/14.
 */
public class ImageRepoImpl implements ImageRepository {

    private static ImageRepoImpl respository = null;

    private Map<String, Image> imageTable;

    private ImageRepoImpl() {
        imageTable = new HashMap<String, Image>();
    }

    public static ImageRepoImpl getInstance(){
        if(respository==null)
            respository = new ImageRepoImpl();
        return respository;
    }

    public Image create(Image image) {
        return null;
    }


    public Image read(String id) {
        Image image = imageTable.get(id);
        return image;
    }


    public Image update(Image image) {
        return null;
    }


    public void delete(String id) {
        imageTable.remove(id);
    }
}
