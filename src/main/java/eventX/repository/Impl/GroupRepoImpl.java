package eventX.repository.Impl;

import eventX.domain.Group;
import eventX.repository.GroupRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by SQIM-User on 2017/08/14.
 */
public class GroupRepoImpl implements GroupRepository {

    private static GroupRepoImpl respository = null;

    private Map<String, Group> groupTable;

    private GroupRepoImpl() {
        groupTable = new HashMap<String, Group>();
    }

    public static GroupRepoImpl getInstance(){
        if(respository==null)
            respository = new GroupRepoImpl();
        return respository;
    }

    public Group create(Group group) {
        return null;
    }

    public Group read(String id) {
        Group group = groupTable.get(id);
        return group;
    }

    public Group update(Group group) {
        return null;
    }

    public void delete(String id) {
        groupTable.remove(id);
    }
}
