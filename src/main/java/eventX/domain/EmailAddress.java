package eventX.domain;

import javax.persistence.Embeddable;
import org.hibernate.validator.constraints.Email;
import java.io.Serializable;

/**
 * Created by SQIM-User on 2017/08/11.
 */
@Embeddable
public class EmailAddress implements Serializable{

    private String originalValue;

    private String canonicalValue;

    public EmailAddress() {
        super();
    }

    public EmailAddress(String value) {
        super();
        setOriginalValue(value);
    }

    @Email
    public String getOriginalValue() {
        return originalValue;
    }

    public void setOriginalValue(String originalValue) {
        if(originalValue == null) {
            this.canonicalValue = null;
        }
        else {
            this.originalValue = originalValue.trim();
            this.canonicalValue = this.originalValue.toLowerCase();
        }
    }

    public String getCanonicalValue() {
        return canonicalValue;
    }

    public void setCanonicalValue(String canonicalValue) {
        this.canonicalValue = canonicalValue;
    }

}
