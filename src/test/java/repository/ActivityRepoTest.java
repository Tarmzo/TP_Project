package repository;


/**
 * Created by SQIM-User on 2017/08/14.
 */

import eventX.Factory.ActivityFactory;
import eventX.domain.Activity;
import eventX.repository.ActivityRepository;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class ActivityRepoTest {
    Map<String,String> values;
    ActivityRepository repository;

    @BeforeClass
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        values.put("id","1");
        values.put("name","Daily Stand Up");
        values.put("activityDescription","Stand up Meeting");
    }

    @Test
    public void create()  throws Exception {
        Activity activity = ActivityFactory.getActivity(values,25);
        repository.create(activity);
        Assert.assertEquals("name",activity.getName());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Activity readActivity = repository.read("1");
        Assert.assertEquals("name",readActivity.getName());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        Activity activity = repository.read("1");
        Activity newActivity = new Activity.Builder()
                .points(50)
                .name(values.get("name7"))
                .activityDescription(values.get("activity-Description"))
                .id(values.get("id"))
                .build();
        repository.update(newActivity);
        Activity UpdateActivity = repository.read("1");
        Assert.assertEquals(50,UpdateActivity.getPoints());
    }

    @Test (dependsOnMethods = "update")
    public void delete() throws Exception {
        repository.delete("1");
        Activity activity = repository.read("1");
        Assert.assertNull(activity);
    }
}