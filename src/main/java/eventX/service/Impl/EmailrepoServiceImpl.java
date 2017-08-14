package eventX.service.Impl;

import eventX.domain.EmailAddress;
import eventX.domain.Image;
import eventX.repository.ActivityRepository;
import eventX.repository.EmailAddressRepository;
import eventX.repository.Impl.ActivityRepoImpl;
import eventX.repository.Impl.EmailAddressRepoImpl;
import eventX.service.EmailRepoService;

/**
 * Created by SQIM-User on 2017/08/14.
 */
public class EmailrepoServiceImpl implements EmailRepoService {

    EmailAddressRepository repository = EmailAddressRepoImpl.getInstance();

    public EmailAddress create(EmailAddress emailAddress) {
        return repository.create(emailAddress);
    }


    public EmailAddress read(String id) {
        return repository.read(id);
    }

    public EmailAddress update(EmailAddress emailAddress) {
        return repository.update(emailAddress);
    }


    public void delete(String id) {
      repository.delete(id);
    }
}
