package com.example.demo.persistent.repository;

import com.example.demo.persistent.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("SELECT u FROM Customer u where u.accountId = :accountId")
    Customer getByAccountId(@Param("accountId") Integer accountId);

    @Query("update Customer u SET u.deleted = true WHERE u.id = :id")
    @Modifying
    void deleteByID(@Param("id") Integer id);
}
