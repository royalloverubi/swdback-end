package com.example.demo.persistent.entity;

import javax.persistence.*;

@Entity
@Table(name = "room_request")
public class RoomRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "service_request_id")
    private Integer serviceRequestId;

    @Column(name = "room_id")
    private Integer roomId;

    @Column(name = "is_active")
    private Boolean isActive;

    @Column(name = "id_deleted")
    private Boolean idDeleted;
}
