package com.smartsoft.bills.service;

import com.smartsoft.bills.model.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductInterface {

    public ResponseEntity<List<Product>>list();

    public ResponseEntity<Product> find(Integer productId);

    public ResponseEntity<Product> save (Product product);

    public ResponseEntity<Product> update (Product product);

    public void remove(Integer productId);

}
