package com.example.backend.controller;

import com.example.backend.dto.BillDTO;
import com.example.backend.service.BillServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("api/bill")
public class BillController {

    @Autowired
    private BillServiceImpl service;

    @GetMapping
    public ResponseEntity<List<BillDTO>> getAllBill(){
        return new ResponseEntity(service.getAllBill(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BillDTO> getBillById(@PathVariable(name = "id") Integer id) {
        return new ResponseEntity(service.getBillById(id), HttpStatus.OK);
    }
}
