package com.example.demo.service.dto;

import java.io.Serializable;

public class CyberGamingDTO implements Serializable {

    private Integer id;

    private String name;

    private String logo;

    private Integer accountId;

    private String address;

    private Double starAverage;

    private Double logitude;

    private Double latitude;

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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getStarAverage() {
        return starAverage;
    }

    public void setStarAverage(Double starAverage) {
        this.starAverage = starAverage;
    }

    public Double getLogitude() {
        return logitude;
    }

    public void setLogitude(Double logitude) {
        this.logitude = logitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
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
