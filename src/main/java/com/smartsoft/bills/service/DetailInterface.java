package com.smartsoft.bills.service;

import com.smartsoft.bills.model.Detail;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DetailInterface {

    public ResponseEntity<List<Detail>> list();

    public ResponseEntity<Detail> find(Integer detailId);

    public ResponseEntity<Detail> save (Detail detail);

    public ResponseEntity<Detail> update (Detail product);

    public void remove(Integer detailId);

}
