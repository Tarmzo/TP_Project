package eventX.service;

import eventX.domain.EmailAddress;
import eventX.domain.Image;

/**
 * Created by SQIM-User on 2017/08/14.
 */
public interface EmailRepoService {
    EmailAddress create(EmailAddress emailAddress);
    EmailAddress read(String id);
    EmailAddress update(EmailAddress emailAddress);
    void delete(String id);
}
