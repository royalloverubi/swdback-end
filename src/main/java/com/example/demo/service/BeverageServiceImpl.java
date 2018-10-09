package com.example.demo.service;

import com.example.demo.api.BeverrageDTO;
import com.example.demo.persistent.entity.Beverage;
import com.example.demo.persistent.repository.BeverageRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BeverageServiceImpl implements BeverageService {


    private final BeverageRepository beverageRepository;

    public BeverageServiceImpl(BeverageRepository beverageRepository) {
        this.beverageRepository = beverageRepository;
    }

    @Override
    public List<Beverage> getAll() {
        List<Beverage> beverages = beverageRepository.findAll();
        return beverages;
    }

    @Override
    public Beverage update(Beverage beverage) {
        Beverage beverage1 = beverageRepository.saveAndFlush(beverage);
        return beverage;
    }

    @Override
    public Beverage insert(Beverage beverage) {
        Beverage beverage1 = beverageRepository.save(beverage);
        return beverage1;
    }

    @Override
    public Boolean delete(Long id) {
        Optional.ofNullable(beverageRepository.findById(id)).orElseThrow(() -> new EntityNotFoundException());
        beverageRepository.deleteById(id);
        return true;
    }
}
