package com.smartsoft.bills.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "product")
public class Product {
    @Id
    @Getter @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productId;

    @Getter @Setter
    private String name;

    @Getter @Setter
    private Double price;

    @Getter @Setter
    private Integer stock;

}
