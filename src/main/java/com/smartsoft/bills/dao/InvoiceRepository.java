package com.smartsoft.bills.dao;

import com.smartsoft.bills.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice,Integer>{
}
