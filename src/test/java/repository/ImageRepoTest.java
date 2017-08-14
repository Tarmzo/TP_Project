package repository;


/**
 * Created by SQIM-User on 2017/08/14.
 */

import eventX.Factory.ActivityFactory;
import eventX.Factory.ImageFactory;
import eventX.domain.Activity;
import eventX.domain.Image;
import eventX.repository.ActivityRepository;
import eventX.repository.ImageRepository;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class ImageRepoTest {
    ImageRepository repository;

    @Test
    public void create()  throws Exception {
        Image image = ImageFactory.getImage();
        image.setDataLength(15);
        image.setHash("avig#");
        image.setHeight(15);
        image.setOriginalFilename("Lupho");
        repository.create(image);
        Assert.assertEquals("Lupho",image.getOriginalFilename());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Image readImage = repository.read("1");
        Assert.assertEquals("Lupho",readImage.getOriginalFilename());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        Image image = repository.read("1");
        Image newImage = new Image();
              newImage.setDataLength(35);
              newImage.setHash("test@#");
              newImage.setHeight(145);
              newImage.setWidth(75);
        repository.update(newImage);
        Image updateImage = repository.read("1");
        Assert.assertEquals("test@#",updateImage.getHash());
    }

    @Test (dependsOnMethods = "update")
    public void delete() throws Exception {
        repository.delete("1");
        Image image = repository.read("1");
        Assert.assertNull(image);
    }
}