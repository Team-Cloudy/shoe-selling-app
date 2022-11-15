package com.example.backend.dto;


import com.example.backend.model.BillDetail;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BillDTO {
    private Integer id;
    private Date timeOfOrder;
    private Integer id_user;
    private List<BillDetail> billDetails;
}
