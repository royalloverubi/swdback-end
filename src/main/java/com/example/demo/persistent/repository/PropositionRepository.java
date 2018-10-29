package com.example.demo.persistent.repository;

import com.example.demo.persistent.entity.Proposition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropositionRepository extends JpaRepository<Proposition, Integer> {
}
