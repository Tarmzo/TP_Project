package factory;


/**
 * Created by SQIM-User on 2017/08/14.
 */

import eventX.Factory.ActivityFactory;
import eventX.Factory.EmailAddressFactory;
import eventX.domain.Activity;
import eventX.domain.EmailAddress;
import eventX.repository.EmailAddressRepository;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class EmailAddressFactoryTest {

    @Test
    public void getEmailAddress() throws Exception {
        EmailAddress emailAddress = EmailAddressFactory.getEmailAddress();
        emailAddress.getOriginalValue();
        Assert.assertEquals("210088931@cput.com",emailAddress.getOriginalValue());
    }

}
