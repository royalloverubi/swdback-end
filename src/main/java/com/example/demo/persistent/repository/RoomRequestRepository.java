package com.example.demo.persistent.repository;

import com.example.demo.persistent.entity.RoomRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRequestRepository extends JpaRepository<RoomRequest, Integer> {
}
