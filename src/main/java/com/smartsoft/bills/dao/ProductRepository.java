package com.smartsoft.bills.dao;

import com.smartsoft.bills.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
