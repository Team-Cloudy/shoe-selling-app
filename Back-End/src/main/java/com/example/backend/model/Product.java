package com.example.backend.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name_product")
    private String nameProduct;

    @Column(name = "description")
    private String description;

    @Column(name = "size")
    private int size;

    @Column(name = "amount")
    private int amount;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    @JsonManagedReference
    private Image image;
}