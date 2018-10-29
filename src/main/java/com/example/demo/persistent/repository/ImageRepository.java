package com.example.demo.persistent.repository;

import com.example.demo.persistent.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Integer> {

}
