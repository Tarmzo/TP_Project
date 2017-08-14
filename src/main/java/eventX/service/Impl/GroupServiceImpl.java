package eventX.service.Impl;

import eventX.domain.Activity;
import eventX.domain.Group;
import eventX.repository.GroupRepository;
import eventX.repository.Impl.GroupRepoImpl;
import eventX.service.GroupService;

/**
 * Created by SQIM-User on 2017/08/14.
 */
public class GroupServiceImpl implements GroupService {

    GroupRepository repository = GroupRepoImpl.getInstance();

    public Group create(Group group) {
        return repository.create(group);
    }

    public Group read(String id) {
        return repository.read(id);
    }

    public Group update(Group group) {
        return repository.update(group);
    }

    public void delete(String id) {
        repository.delete(id);
    }
}
