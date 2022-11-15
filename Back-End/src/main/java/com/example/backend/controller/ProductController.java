package com.example.backend.controller;

import com.example.backend.dto.ProductDTO;
import com.example.backend.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductServiceImpl service;

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAllProduct() {
        return new ResponseEntity(service.getAllProduct(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable(name = "id") Integer id) {
        return new ResponseEntity(service.getProductById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ProductDTO> addProduct(@RequestBody ProductDTO newProduct) {
        return new ResponseEntity(service.addProduct(newProduct), HttpStatus.OK);
    }

    @PostMapping("/{id}")
    public ResponseEntity<ProductDTO> updateProduct(
                        @RequestBody ProductDTO updateProduct,
                        @PathVariable(name = "id") Integer id) {
        return new ResponseEntity(service.updateProduct(updateProduct, id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteProduct(@PathVariable(name = "id") Integer id) {
        return new ResponseEntity(service.deleteProduct(id), HttpStatus.OK);
    }
}
