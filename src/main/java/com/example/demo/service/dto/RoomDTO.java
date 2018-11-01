package com.example.demo.service.dto;

import java.io.Serializable;

public class RoomDTO implements Serializable {

    private Integer id;

    private String name;

    private String description;

    private Double price;

    private Integer cyber_gaming_id;

    private Boolean isActive;

    private Boolean idDeleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCyber_gaming_id() {
        return cyber_gaming_id;
    }

    public void setCyber_gaming_id(Integer cyber_gaming_id) {
        this.cyber_gaming_id = cyber_gaming_id;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Boolean getIdDeleted() {
        return idDeleted;
    }

    public void setIdDeleted(Boolean idDeleted) {
        this.idDeleted = idDeleted;
    }
}
