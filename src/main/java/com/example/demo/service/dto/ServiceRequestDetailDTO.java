package com.example.demo.service.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ServiceRequestDetailDTO implements Serializable {

    private Integer id;

    private String username;

    private String cyberGamingName;

    private Double duration;

    private Integer numberOfServiceSlot;

    private Boolean isDone;

    private Double isPaid;

    private LocalDateTime paidDate;

    private LocalDateTime dateRequest;

    private LocalDateTime goingDate;

    private String evaluation;

    private Integer star;

    private Double longitude;

    private Double latitude;

    private String code;

    private Double totalPrice;

    private String roomname;

    private String configurationName;

    private Boolean approved;

    private Boolean active;

    private Boolean deleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCyberGamingName() {
        return cyberGamingName;
    }

    public void setCyberGamingName(String cyberGamingName) {
        this.cyberGamingName = cyberGamingName;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public Integer getNumberOfServiceSlot() {
        return numberOfServiceSlot;
    }

    public void setNumberOfServiceSlot(Integer numberOfServiceSlot) {
        this.numberOfServiceSlot = numberOfServiceSlot;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }

    public Double getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(Double isPaid) {
        this.isPaid = isPaid;
    }

    public LocalDateTime getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(LocalDateTime paidDate) {
        this.paidDate = paidDate;
    }

    public LocalDateTime getDateRequest() {
        return dateRequest;
    }

    public void setDateRequest(LocalDateTime dateRequest) {
        this.dateRequest = dateRequest;
    }

    public LocalDateTime getGoingDate() {
        return goingDate;
    }

    public void setGoingDate(LocalDateTime goingDate) {
        this.goingDate = goingDate;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public String getConfigurationName() {
        return configurationName;
    }

    public void setConfigurationName(String configurationName) {
        this.configurationName = configurationName;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
