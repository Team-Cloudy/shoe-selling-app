package com.example.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BillDetailDTO {
    private Integer id;
    private Integer id_bill;
    private Integer id_user;
    private int amount;
}
