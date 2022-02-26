package ma.cigma.Models;


import lombok.Data;
import lombok.ToString;
import javax.persistence.*;
import java.util.List;


@ToString
@Data
@Entity(name="unit_persone")


@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="client_type")
@DiscriminatorValue("client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column
    private  String name;
    @OneToOne
    @JoinColumn(name = "client_id")

    public static void setPromotions(List<Promotion> promotions){}

    public Client(Long id) {
        this.id = id;

    }

    public Client(){}

    public Client(String name) {
        this.name = name;
    }

    public static void setCarteFidelio(CarteFidelio carteFidelio) {
    }


    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}

