package com.example.backend.service;

import com.example.backend.dto.BillDTO;
import com.example.backend.repository.BillRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BillServiceImpl implements BillService{

    @Autowired
    private BillRepository repository;

    ModelMapper mapper = new ModelMapper();

    @Override
    public List<BillDTO> getAllBill() {
        return repository.findAll()
                .stream()
                .map(it -> mapper.map(it, BillDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public BillDTO getBillById(Integer id) {
        return mapper.map(repository.findById(id), BillDTO.class);
    }
}
