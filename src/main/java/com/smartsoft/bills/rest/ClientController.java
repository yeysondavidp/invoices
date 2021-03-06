package com.smartsoft.bills.rest;

import com.smartsoft.bills.dao.ClientRepository;
import com.smartsoft.bills.model.Client;
import com.smartsoft.bills.service.ClientInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clients")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
public class ClientController implements ClientInterface {
    @Autowired
    private ClientRepository clientRepository;

    @Override
    @GetMapping("")
    public ResponseEntity<List<Client>> list() {
        return new ResponseEntity<>(clientRepository.findAll(), HttpStatus.OK);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Client> find(@PathVariable("id") Integer clientId) {
        return clientRepository.findById(clientId)
                .map(client -> new ResponseEntity<>(client, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


    @Override
    @PostMapping("")
    public ResponseEntity<Client> save(@RequestBody Client client) {
        return new ResponseEntity<>(clientRepository.save(client), HttpStatus.CREATED);
    }

    @Override
    @PutMapping("")
    public ResponseEntity<Client> update(@RequestBody Client client) {
        return new ResponseEntity<>(clientRepository.save(client),HttpStatus.OK);
    }

    @Override
    public void remove(Integer clientId) {

    }
}
