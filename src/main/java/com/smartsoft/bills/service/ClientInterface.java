package com.smartsoft.bills.service;

import com.smartsoft.bills.model.Client;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ClientInterface {

    public ResponseEntity<List<Client>> list();

    public ResponseEntity<Client> find(Integer clientId);

    public ResponseEntity<Client> save (Client client);

    public ResponseEntity<Client> update (Client invoice);

    public void remove(Integer clientId);

}
