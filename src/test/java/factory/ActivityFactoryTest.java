package factory;


/**
 * Created by SQIM-User on 2017/08/14.
 */
import eventX.Factory.ActivityFactory;
import eventX.domain.Activity;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.util.HashMap;
import java.util.Map;

public class ActivityFactoryTest {
    Map<String,String> values;

    @BeforeClass
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        values.put("id","1");
        values.put("name","Daily Stand Up");
        values.put("activityDescription","Stand up Meeting");
    }

    @Test
    public void getPerson() throws Exception {
        Activity activity = ActivityFactory.getActivity(values, 25);
        Assert.assertEquals("name",activity.getName());
    }

}
