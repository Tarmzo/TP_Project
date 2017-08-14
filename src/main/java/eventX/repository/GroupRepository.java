package eventX.repository;

import eventX.domain.Group;

/**
 * Created by SQIM-User on 2017/08/14.
 */
public interface GroupRepository {
    Group create(Group group);
    Group read(String id);
    Group update(Group group);
    void delete(String id);
}
