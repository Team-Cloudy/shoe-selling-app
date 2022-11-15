package com.example.backend.dto;

import com.example.backend.model.Image;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private Integer id;
    private String nameProduct;
    private String description;
    private int size;
    private int amount;
    private Image image;
}
