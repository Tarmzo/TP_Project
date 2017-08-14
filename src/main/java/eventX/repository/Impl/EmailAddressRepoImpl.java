package eventX.repository.Impl;

import eventX.domain.EmailAddress;
import eventX.repository.ActivityRepository;
import eventX.repository.EmailAddressRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by SQIM-User on 2017/08/14.
 */
public class EmailAddressRepoImpl implements EmailAddressRepository {

    private static EmailAddressRepoImpl respository = null;

    private Map<String, EmailAddress> emailTable;

    private EmailAddressRepoImpl() {
        emailTable = new HashMap<String, EmailAddress>();
    }

    public static EmailAddressRepoImpl getInstance(){
        if(respository==null)
            respository = new EmailAddressRepoImpl();
        return respository;
    }



    public EmailAddress create(EmailAddress emailAddress) {
        return null;
    }


    public EmailAddress read(String id) {
        EmailAddress emailAddress = emailTable.get(id);
        return emailAddress;
    }


    public EmailAddress update(EmailAddress emailAddress) {
        return null;
    }


    public void delete(String id) {
        emailTable.remove(id);
    }
}
