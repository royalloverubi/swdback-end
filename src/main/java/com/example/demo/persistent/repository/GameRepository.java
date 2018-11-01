package com.example.demo.persistent.repository;

import com.example.demo.persistent.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {

    @Query("SELECT g FROM Game g WHERE g.idDeleted = false ")
    List<Game> getAll();

    @Query("SELECT g FROM Game g WHERE g.id = :id")
    Game findByID(@Param("id") Integer id);

    @Query("update Game g SET g.idDeleted = true WHERE g.id = :id")
    @Modifying
    void deleteByID(@Param("id") Integer id);

}
