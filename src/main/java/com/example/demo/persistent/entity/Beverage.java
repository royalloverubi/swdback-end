package com.example.demo.persistent.entity;

import javax.persistence.*;

@Entity
@Table(name = "beverage")
public class Beverage {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bev_id")
    private Long id;

    @Column(name = "bev_name")
    private String name;

    @Column(name = "bev_price")
    private Double price;

    @Column(name = "tob_id")
    private Long type;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }
}
