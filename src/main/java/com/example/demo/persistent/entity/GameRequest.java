package com.example.demo.persistent.entity;

import javax.persistence.*;

@Entity
@Table(name = "game_request")
public class GameRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "service_request_id")
    private Integer serviceRequestId;

    @Column(name = "game_id")
    private Integer gameId;

    @Column(name = "is_active")
    private Boolean isActive;

    @Column(name = "id_deleted")
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

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
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
