package repository;


/**
 * Created by SQIM-User on 2017/08/14.
 */

import eventX.Factory.ActivityFactory;
import eventX.Factory.EmailAddressFactory;
import eventX.domain.Activity;
import eventX.domain.EmailAddress;
import eventX.repository.ActivityRepository;
import eventX.repository.EmailAddressRepository;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class EmailAddressRepoTest {
    EmailAddressRepository repository;


    @Test
    public void create()  throws Exception {
        EmailAddress emailAddress = EmailAddressFactory.getEmailAddress();
        emailAddress.setOriginalValue("vlvsmalotana");
        emailAddress.setCanonicalValue("166451e");
        repository.create(emailAddress);
        Assert.assertEquals("166451e",emailAddress.getCanonicalValue());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        EmailAddress readEmailAddress = repository.read("1");
        Assert.assertEquals("name",readEmailAddress.getCanonicalValue());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        EmailAddress emailAddress = repository.read("1");
        EmailAddress newEmailAddress = new EmailAddress();
        newEmailAddress.setOriginalValue("vlvsmaloVuk.org");
        newEmailAddress.setCanonicalValue("46516yu");
        repository.update(newEmailAddress);
        EmailAddress newEmailAddress1 = repository.read("1");
        Assert.assertEquals("vlvsmaloVuk.org",newEmailAddress1.getOriginalValue());
    }

    @Test (dependsOnMethods = "update")
    public void delete() throws Exception {
        repository.delete("1");
        EmailAddress emailAddress = repository.read("1");
        Assert.assertNull(emailAddress);
    }
}