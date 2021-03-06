package com.smartsoft.bills.rest;

import com.smartsoft.bills.dao.ProductRepository;
import com.smartsoft.bills.model.Product;
import com.smartsoft.bills.service.ProductInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController implements ProductInterface {

    @Autowired
    private ProductRepository productRepository;

    @Override
    @GetMapping("")
    @CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
    public ResponseEntity<List<Product>> list() {
        return new ResponseEntity<>(productRepository.findAll(), HttpStatus.OK) ;
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Product> find(@PathVariable("id") Integer productId) {
        return productRepository.findById(productId)
                .map(invoice -> new ResponseEntity<>(invoice,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @Override
    @PostMapping("")
    public ResponseEntity<Product> save(@RequestBody Product product) {
        return new ResponseEntity<>(productRepository.save(product),HttpStatus.CREATED);
    }

    @Override
    @PutMapping("")
    public ResponseEntity<Product> update(@RequestBody Product product) {
        return new ResponseEntity<>(productRepository.save(product), HttpStatus.OK);
    }

    @Override
    public void remove(Integer productId) {

    }
}
