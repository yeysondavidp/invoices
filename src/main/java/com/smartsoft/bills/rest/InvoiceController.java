package com.smartsoft.bills.rest;

import com.smartsoft.bills.dao.InvoiceRepository;
import com.smartsoft.bills.model.Invoice;
import com.smartsoft.bills.service.InvoiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("invoices")
public class InvoiceController implements InvoiceInterface {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Override
    @GetMapping("")
    @CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
    public ResponseEntity<List<Invoice>> list() {
        return new ResponseEntity<>(invoiceRepository.findAll(), HttpStatus.OK) ;
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Invoice> find(@PathVariable("id") Integer invoiceId) {
        return invoiceRepository.findById(invoiceId)
                .map(invoice -> new ResponseEntity<>(invoice,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @Override
    @PostMapping("")
    public ResponseEntity<Invoice> save(@RequestBody Invoice invoice) {
        return new ResponseEntity<>(invoiceRepository.save(invoice),HttpStatus.CREATED);
    }

    @Override
    @PutMapping("")
    public ResponseEntity<Invoice> update(@RequestBody Invoice invoice) {
        return new ResponseEntity<>(invoiceRepository.save(invoice),HttpStatus.OK);
    }

    @Override
    @DeleteMapping("/{id}")
    public void remove(Integer invoiceId) {

    }
}
