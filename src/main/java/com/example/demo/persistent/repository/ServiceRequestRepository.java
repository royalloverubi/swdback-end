package com.example.demo.persistent.repository;

import com.example.demo.persistent.entity.ServiceRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceRequestRepository extends JpaRepository<ServiceRequest, Integer> {

    @Query("SELECT s FROM ServiceRequest s WHERE s.id = :id")
    ServiceRequest getByID(@Param("id") Integer id);

    @Query("UPDATE ServiceRequest s SET s.idDeleted = true WHERE s.id = :id")
    @Modifying
    void deleteByID(@Param("id") Integer id);

    @Query("SELECT s FROM ServiceRequest s WHERE s.accountRequestId = :id")
    List<ServiceRequest> getByAccountRequestId(@Param("id") Integer id);
}
