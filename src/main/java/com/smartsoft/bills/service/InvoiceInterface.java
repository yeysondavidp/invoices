package com.smartsoft.bills.service;

import com.smartsoft.bills.model.Invoice;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface InvoiceInterface {

    public ResponseEntity<List<Invoice>>list();

    public ResponseEntity<Invoice> find(Integer invoiceId);

    public ResponseEntity<Invoice> save (Invoice invoice);

    public ResponseEntity<Invoice> update (Invoice invoice);

    public void remove(Integer invoiceId);

}
