package com.example.backend.service;

import com.example.backend.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    List<ProductDTO> getAllProduct();
    ProductDTO getProductById(Integer id);
    ProductDTO addProduct(ProductDTO newProduct);
    ProductDTO updateProduct(ProductDTO updateProduct, Integer id);
    Boolean deleteProduct(Integer id);
}
