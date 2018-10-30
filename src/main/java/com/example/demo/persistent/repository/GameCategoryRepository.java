package com.example.demo.persistent.repository;

import com.example.demo.persistent.entity.GameCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GameCategoryRepository extends JpaRepository<GameCategory, Integer> {

    @Query("SELECT g FROM GameCategory g WHERE g.idDeleted = false ")
    List<GameCategory> getAll();

    @Query("SELECT g FROM GameCategory g WHERE g.id = :id")
    GameCategory getByID(@Param("id") Integer id);

    @Query("UPDATE GameCategory g SET g.idDeleted = true WHERE g.id = :id")
    @Modifying
    void deleteByID(@Param("id") Integer id);
}
