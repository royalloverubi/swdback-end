package com.example.demo.service.dto;

import java.io.Serializable;

public class PropositionDTO implements Serializable {

    private Integer id;

    private Integer serviceRequestId;

    private Integer accountProposeId;

    private Double price;

    private Boolean isActive;

    private Boolean idDeleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getServiceRequestId() {
        return serviceRequestId;
    }

    public void setServiceRequestId(Integer serviceRequestId) {
        this.serviceRequestId = serviceRequestId;
    }

    public Integer getAccountProposeId() {
        return accountProposeId;
    }

    public void setAccountProposeId(Integer accountProposeId) {
        this.accountProposeId = accountProposeId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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
