package factory;


/**
 * Created by SQIM-User on 2017/08/14.
 */

import eventX.Factory.ActivityFactory;
import eventX.Factory.ImageFactory;
import eventX.domain.Activity;
import eventX.domain.Image;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class ImageFactoryTest {

    @Test
    public void getImage() throws Exception {
        Image image = ImageFactory.getImage();
        Assert.assertEquals("photo",image.getOriginalFilename());
    }

}
