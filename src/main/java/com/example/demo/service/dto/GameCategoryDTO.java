package com.example.demo.service.dto;

import java.io.Serializable;

public class GameCategoryDTO implements Serializable {

    private Integer Id;

    private String type;

    private Boolean active;

    private Boolean delete;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        active = active;
    }

    public Boolean getDeleted() {
        return delete;
    }

    public void setDeleted(Boolean deleted) {
        delete = deleted;
    }
}
