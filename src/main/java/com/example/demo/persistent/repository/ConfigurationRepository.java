package com.example.demo.persistent.repository;

import com.example.demo.persistent.entity.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConfigurationRepository extends JpaRepository<Configuration, Integer> {

    @Query("SELECT c FROM Configuration c WHERE c.cyberGamingId = :cyberId AND c.idDeleted = false")
    List<Configuration> findAllByCyberGamingId(@Param("cyberId") Integer cyberId);

    @Query("UPDATE Configuration c SET c.idDeleted = true WHERE c.id = :id")
    @Modifying
    void deleteByID(@Param("id") Integer id);

    @Query("SELECT c FROM Configuration c WHERE c.id = :conId")
    Configuration findByConId(@Param("conId") Integer conId);
}
