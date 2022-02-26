package ma.cigma.Models;

import lombok.Data;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data

@AttributeOverride(name = "phone", column = @Column(name ="PHONE_PERSON"))
public class ContactPerson {
    private String firstName;
    private String lastName;
    private String phone;
}