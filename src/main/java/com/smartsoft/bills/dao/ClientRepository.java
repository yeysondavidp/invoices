package com.smartsoft.bills.dao;

import com.smartsoft.bills.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Integer> {
}
