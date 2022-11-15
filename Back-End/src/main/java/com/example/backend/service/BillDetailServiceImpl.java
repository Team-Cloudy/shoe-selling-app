package com.example.backend.service;

import com.example.backend.dto.BillDetailDTO;
import com.example.backend.repository.BillDetailRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillDetailServiceImpl implements BillDetailService{
    @Autowired
    private BillDetailRepository repository;

    ModelMapper mapper = new ModelMapper();

    @Override
    public BillDetailDTO getBillDetailById(Integer id) {
        return mapper.map( repository.findById(id), BillDetailDTO.class);
    }
}
