package com.example.demo.service;

import com.example.demo.persistent.entity.Beverage;

import java.util.List;

public interface BeverageService {

    List<Beverage> getAll();

    Beverage update (Beverage beverage);

    Beverage insert(Beverage beverage);

    Boolean delete (Long id);
}
