package ma.cigma.Models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
//@IdClass(CompanyId.class)
public class Company {


    @EmbeddedId
    private CompanyId id;

    private String name;
    private String address;
    private String phone;
    private String contactFirstName;
    private String contactLastName;
    private String contactPhone;



        @Embedded
        @AttributeOverride(name = "phone", column = @Column(name = "PHONE_PERSON"))
        private ContactPerson contactPerson;
    }





