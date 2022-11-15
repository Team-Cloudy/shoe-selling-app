package com.example.backend.service;

import com.example.backend.dto.BillDTO;

import java.util.List;

public interface BillService {
    List<BillDTO> getAllBill();
    BillDTO getBillById(Integer id);
}
