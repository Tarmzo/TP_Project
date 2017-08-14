package eventX.service.Impl;

import eventX.domain.Image;
import eventX.repository.ImageRepository;
import eventX.repository.Impl.ImageRepoImpl;
import eventX.service.ImageService;

/**
 * Created by SQIM-User on 2017/08/14.
 */
public class ImageServiceImpl implements ImageService{

    ImageRepository repository = ImageRepoImpl.getInstance();


    public Image create(Image image) {
        return repository.create(image);
    }


    public Image read(String id) {
        return repository.read(id);
    }


    public Image update(Image image) {
        return repository.update(image);
    }


    public void delete(String id) {
        repository.delete(id);
    }
}
