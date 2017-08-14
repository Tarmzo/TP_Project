package eventX.repository;

import eventX.domain.Image;

/**
 * Created by SQIM-User on 2017/08/14.
 */
public interface ImageRepository {
    Image create (Image image);
    Image read(String id);
    Image update(Image image);
    void delete(String id);
}
