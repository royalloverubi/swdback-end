package com.example.demo.persistent.repository;

import com.example.demo.persistent.entity.GameRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRequestRepository extends JpaRepository<GameRequest, Integer> {

}
