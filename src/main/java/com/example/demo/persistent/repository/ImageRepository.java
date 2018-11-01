package com.example.demo.persistent.repository;

import com.example.demo.persistent.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image, Integer> {

    @Query("SELECT i FROM Image i WHERE i.cyberGamingId = :cyberId AND i.deleted = false ")
    List<Image> getByCyberGamingId(@Param("cyberId") Integer cyberId);
}
