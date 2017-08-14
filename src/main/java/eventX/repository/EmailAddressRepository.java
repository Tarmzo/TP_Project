package eventX.repository;

import eventX.domain.EmailAddress;

/**
 * Created by SQIM-User on 2017/08/14.
 */
public interface EmailAddressRepository {
    EmailAddress create (EmailAddress emailAddress);
    EmailAddress read(String id);
    EmailAddress update(EmailAddress emailAddress);
    void delete(String id);
}
