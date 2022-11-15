package com.example.backend.controller;

import com.example.backend.dto.BillDetailDTO;
import com.example.backend.service.BillDetailServiceImpl;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bill-detail")
public class BillDetailController {

    @Autowired
    private BillDetailServiceImpl service;

    @GetMapping("/{id}")
    private ResponseEntity<BillDetailDTO> getBillDetailById(@PathVariable(name = "id") Integer id) {
        return new ResponseEntity(service.getBillDetailById(id), HttpStatus.OK);
    }
}
