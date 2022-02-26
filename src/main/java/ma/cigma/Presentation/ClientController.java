package ma.cigma.Presentation;


import lombok.Data;
import ma.cigma.Models.Client;
import ma.cigma.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Data

@RestController
@RequestMapping("/client")



public class ClientController {
    @Autowired
    private ClientService service;

    @GetMapping("/{id}")
    public Client getOne(@PathVariable("id") long id){
        return service.getOne(id);
    }
    @GetMapping("/all")
    public List<Client> getAll() {
        return service.getAll();
    }

    @PostMapping("/create")
    public Client save(@RequestBody Client clt) {
        return service.save(clt);
    }
    @PutMapping("/update")
    public Client modify(@RequestBody Client clt){
        return service.modify(clt);
    }
@DeleteMapping("/remove/{id}")
    public void remove(@PathVariable long id) {
        service.remove(id);
    }


}

