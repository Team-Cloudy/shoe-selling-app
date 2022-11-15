package com.example.backend.service;

import com.example.backend.dto.ProductDTO;
import com.example.backend.model.Product;
import com.example.backend.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;

    ModelMapper mapper = new ModelMapper();

    @Override
    public List<ProductDTO> getAllProduct() {
        List<ProductDTO> listProduct = repository.findAll().stream()
                                        .map(it -> mapper.map(it, ProductDTO.class))
                                        .collect(Collectors.toList());
        return listProduct;
    }

    @Override
    public ProductDTO getProductById(Integer id) {
        return mapper.map(repository.findById(id).orElse(null), ProductDTO.class);
    }

    @Override
    public ProductDTO addProduct(ProductDTO newProduct) {
        repository.save(mapper.map(newProduct, Product.class));
        return newProduct;
    }

    @Override
    public ProductDTO updateProduct(ProductDTO updateProduct, Integer id) {
        Product curProduct = repository.findById(id).orElse(null);
        if (curProduct != null) {
            curProduct.setNameProduct(updateProduct.getNameProduct());
            curProduct.setDescription(updateProduct.getDescription());
            curProduct.setAmount(updateProduct.getAmount());
            curProduct.setImage(updateProduct.getImage());
            curProduct.setSize(updateProduct.getSize());
            return updateProduct;
        }
        return null;
    }

    @Override
    public Boolean deleteProduct(Integer id) {
        if (repository.findById(id).orElse(null) != null) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
