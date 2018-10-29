package com.example.demo.persistent.repository;

import com.example.demo.persistent.entity.CyberGaming;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CyberGamingRepository extends JpaRepository<CyberGaming, Integer> {

    CyberGaming findByAccountId(Integer id);
}
