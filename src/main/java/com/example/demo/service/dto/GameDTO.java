package com.example.demo.service.dto;

import java.io.Serializable;

public class GameDTO implements Serializable {

    private Integer id;

    private String name;

    private Integer gameCategoryId;

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

    public Integer getGameCategoryId() {
        return gameCategoryId;
    }

    public void setGameCategoryId(Integer gameCategoryId) {
        this.gameCategoryId = gameCategoryId;
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
