package com.example.demo.persistent.repository;

import com.example.demo.persistent.entity.Beverage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BeverageRepository extends JpaRepository<Beverage, Long> {

    List<Beverage> findAllByName(String name);

}
