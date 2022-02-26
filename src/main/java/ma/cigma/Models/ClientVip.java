package ma.cigma.Models;


import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@Data
@DiscriminatorValue("vip")

public class ClientVip extends Client{
    private String preferences;

    public ClientVip() {
    }

    public ClientVip(String name, String preferences) {
        super(name);
        this.preferences = preferences;
    }

}


