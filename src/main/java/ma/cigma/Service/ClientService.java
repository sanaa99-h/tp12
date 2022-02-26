package ma.cigma.Service;

import ma.cigma.Models.Client;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ClientService {


    Client save(Client clt);
    Client modify(Client clt);
    void remove(long idClt);
    Client getOne(long idClt);
    List<Client> getAll();






}
