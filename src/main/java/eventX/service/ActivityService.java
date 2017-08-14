package eventX.service;

import eventX.domain.Activity;

/**
 * Created by SQIM-User on 2017/08/14.
 */
public interface ActivityService {
    Activity create(Activity activity);
    Activity read(String id);
    Activity update(Activity activity);
    void delete(String id);
}
