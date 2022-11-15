package com.example.backend.service;

import com.example.backend.dto.DiscountDTO;

import java.util.List;

public interface DiscountService {
    List<DiscountDTO> getAllDiscount();
    DiscountDTO addDiscount(DiscountDTO newDiscount);
    DiscountDTO updateDiscount(DiscountDTO updateDiscount, Integer id);
    Boolean delelteDiscount(Integer id);
}
