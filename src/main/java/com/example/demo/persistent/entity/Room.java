package com.example.demo.persistent.entity;

import javax.persistence.*;

@Entity
@Table(name = "room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "room_type")
    private String roomType;

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

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
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
