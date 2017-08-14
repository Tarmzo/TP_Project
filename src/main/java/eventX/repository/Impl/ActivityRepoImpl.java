package eventX.repository.Impl;

import eventX.domain.Activity;
import eventX.repository.ActivityRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by SQIM-User on 2017/08/14.
 */
public class ActivityRepoImpl implements ActivityRepository {

    private static ActivityRepoImpl respository = null;

    private Map<String, Activity> activityTable;

    private ActivityRepoImpl() {
        activityTable = new HashMap<String, Activity>();
    }

    public static ActivityRepoImpl getInstance(){
        if(respository==null)
            respository = new ActivityRepoImpl();
        return respository;
    }

    public Activity create(Activity activity) {
        activityTable.put(activity.getID(),activity);
        Activity savedActivity = activityTable.get(activity.getID());
        return savedActivity;
    }


    public Activity read(String id) {
        Activity activity = activityTable.get(id);
        return activity;
    }


    public Activity update(Activity activity) {
        activityTable.put(activity.getID(),activity);
        Activity savedActivity = activityTable.get(activity.getID());
        return savedActivity;
    }


    public void delete(String id) {
        activityTable.remove(id);
    }
}
