package com.example.demo.persistent.repository;

import com.example.demo.persistent.entity.GameCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameCategoryRepository extends JpaRepository<GameCategory, Integer> {


}
