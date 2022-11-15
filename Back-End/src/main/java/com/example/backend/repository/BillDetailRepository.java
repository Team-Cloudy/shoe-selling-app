package com.example.backend.repository;

import com.example.backend.dto.BillDetailDTO;
import com.example.backend.model.BillDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillDetailRepository extends JpaRepository<BillDetail, Integer> {
}
