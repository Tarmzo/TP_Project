package eventX.service.Impl;

import eventX.domain.Activity;
import eventX.repository.ActivityRepository;
import eventX.repository.Impl.ActivityRepoImpl;
import eventX.service.ActivityService;

/**
 * Created by SQIM-User on 2017/08/14.
 */
public class ActivityServiceImpl implements ActivityService {

    ActivityRepository repository = ActivityRepoImpl.getInstance();

    @Override
    public Activity create(Activity activity) {
        return repository.create(activity);
    }

    @Override
    public Activity read(String id) {
        return repository.read(id);
    }

    @Override
    public Activity update(Activity activity) {
        return repository.update(activity);
    }

    @Override
    public void delete(String id) {
        repository.delete(id);
    }
}
