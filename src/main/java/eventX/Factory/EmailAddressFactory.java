package eventX.Factory;

import eventX.domain.Activity;
import eventX.domain.EmailAddress;

import java.util.Map;

/**
 * Created by SQIM-User on 2017/08/14.
 */
public class EmailAddressFactory {

    public static EmailAddress getEmailAddress(){
        EmailAddress emailAddress = new EmailAddress();
        emailAddress.setCanonicalValue("12po");
        emailAddress.setOriginalValue("210088931@cput.com");
        return emailAddress;
    }
}
