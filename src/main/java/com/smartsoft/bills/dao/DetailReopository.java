package com.smartsoft.bills.dao;

import com.smartsoft.bills.model.Detail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailReopository extends JpaRepository<Detail,Integer> {
}
