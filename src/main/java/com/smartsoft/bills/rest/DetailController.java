package com.smartsoft.bills.rest;

import com.smartsoft.bills.dao.DetailReopository;
import com.smartsoft.bills.model.Detail;
import com.smartsoft.bills.model.Product;
import com.smartsoft.bills.service.DetailInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("details")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
public class DetailController implements DetailInterface {

    @Autowired
    private DetailReopository detailReopository;

    @Override
    @GetMapping("")
    public ResponseEntity<List<Detail>> list() {
        return new ResponseEntity<>(detailReopository.findAll(), HttpStatus.OK) ;
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Detail> find(@PathVariable("id") Integer detailId) {
        return detailReopository.findById(detailId)
                .map(invoice -> new ResponseEntity<>(invoice,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @Override
    @PostMapping("")
    public ResponseEntity<Detail> save(@RequestBody Detail detail) {
        return new ResponseEntity<>(detailReopository.save(detail), HttpStatus.CREATED);
    }

    @Override
    @PutMapping("")
    public ResponseEntity<Detail> update(@RequestBody Detail detail) {
        return new ResponseEntity<>(detailReopository.save(detail), HttpStatus.OK);
    }

    @Override
    public void remove(Integer detailId) {

    }
}
