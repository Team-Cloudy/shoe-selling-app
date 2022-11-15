package com.example.backend.service;

import com.example.backend.dto.DiscountDTO;
import com.example.backend.model.Discount;
import com.example.backend.repository.DiscountRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DiscountServiceImpl implements DiscountService{

    @Autowired
    private DiscountRepository repository;

    ModelMapper mapper = new ModelMapper();

    @Override
    public List<DiscountDTO> getAllDiscount() {
        return
                repository.findAll().stream().map(it -> mapper.map(it, DiscountDTO.class)).collect(Collectors.toList());
    }

    @Override
    public DiscountDTO addDiscount(DiscountDTO newDiscount) {
        repository.save(mapper.map(newDiscount, Discount.class));
        return newDiscount;
    }

    @Override
    public DiscountDTO updateDiscount(DiscountDTO updateDiscount, Integer id) {
        Discount curDiscount = repository.findById(id).orElse(null);
        if (curDiscount != null) {
            curDiscount.setDiscountValue(updateDiscount.getDiscountValue());
            curDiscount.setTimeStart(updateDiscount.getTimeStart());
            curDiscount.setTimeDuring(updateDiscount.getTimeDuring());
            return updateDiscount;
        }
        return null;
    }

    @Override
    public Boolean delelteDiscount(Integer id) {
        if (repository.findById(id) != null) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
