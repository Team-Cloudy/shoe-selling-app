package com.example.backend.controller;

import com.example.backend.dto.DiscountDTO;
import com.example.backend.service.DiscountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/discount")
public class DiscountController {
    @Autowired
    private DiscountServiceImpl service;

    @GetMapping
    public ResponseEntity<List<DiscountDTO>> getAllDiscount() {
        return new ResponseEntity(service.getAllDiscount(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<DiscountDTO> addDiscount(@RequestBody DiscountDTO newDiscount) {
        return new ResponseEntity(service.addDiscount(newDiscount), HttpStatus.OK);
    }

    @PostMapping("/{id}")
    public ResponseEntity<DiscountDTO> updateDiscount(@RequestBody DiscountDTO updateDiscount,
                                                      @PathVariable(name = "id") Integer id) {
        return new ResponseEntity(service.updateDiscount(updateDiscount, id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteDiscount(@PathVariable(name = "id") Integer id) {
        return new ResponseEntity(service.delelteDiscount(id), HttpStatus.OK);
    }
}
