package com.example.demo.persistent.repository;

import com.example.demo.persistent.entity.Beverage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeverageRepository extends JpaRepository<Beverage, Long> {
    Beverage findAllByName(String name);
}
