package com.example.demo.persistent.repository;

import com.example.demo.persistent.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("SELECT u FROM User u where u.accountId = :accountId")
    User getByAccountId(@Param("accountId") Integer accountId);

    @Query("update User u SET u.deleted = true WHERE u.id = :id")
    @Modifying
    void deleteByID(@Param("id") Integer id);
}
