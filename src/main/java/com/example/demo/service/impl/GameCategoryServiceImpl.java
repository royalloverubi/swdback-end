package com.example.demo.service.impl;

import com.example.demo.persistent.entity.GameCategory;
import com.example.demo.persistent.repository.GameCategoryRepository;
import com.example.demo.service.GameCategoryService;
import com.example.demo.service.dto.GameCategoryDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class GameCategoryServiceImpl implements GameCategoryService {

    private final GameCategoryRepository gameCategoryRepository;

    public GameCategoryServiceImpl(GameCategoryRepository gameCategoryRepository) {
        this.gameCategoryRepository = gameCategoryRepository;
    }

    @Override
    public List<GameCategoryDTO> getAll() {
        List<GameCategory> gameCategories = gameCategoryRepository.getAll();
        if(ObjectUtils.isEmpty(gameCategories)) {
            return null;
        }
        List<GameCategoryDTO> gameCategoryDTOS = new ArrayList<>();
        ModelMapper modelMapper = new ModelMapper();
        for (GameCategory gam: gameCategories) {
            gameCategoryDTOS.add(modelMapper.map(gam, GameCategoryDTO.class));
        }
        return gameCategoryDTOS;
    }

    @Override
    public GameCategoryDTO getById(Integer id) {
        GameCategory gameCategory = gameCategoryRepository.getByID(id);
        if(ObjectUtils.isEmpty(gameCategory)) {
            return null;
        }
        ModelMapper modelMapper = new ModelMapper();
        GameCategoryDTO gameCategoryDTO = modelMapper.map(gameCategory, GameCategoryDTO.class);
        return gameCategoryDTO;
    }

    @Override
    public GameCategoryDTO create(GameCategoryDTO gameCategoryDTO) {
        ModelMapper modelMapper = new ModelMapper();
        GameCategory gameCategory = modelMapper.map(gameCategoryDTO, GameCategory.class);
        gameCategory = gameCategoryRepository.save(gameCategory);
        GameCategoryDTO dto = modelMapper.map(gameCategory, GameCategoryDTO.class);
        return dto;
    }

    @Override
    public GameCategoryDTO update(GameCategoryDTO gameCategoryDTO) {
        ModelMapper modelMapper = new ModelMapper();
        GameCategory gameCategory = modelMapper.map(gameCategoryDTO, GameCategory.class);
        gameCategory = gameCategoryRepository.saveAndFlush(gameCategory);
        GameCategoryDTO dto = modelMapper.map(gameCategory, GameCategoryDTO.class);
        return dto;
    }

    @Override
    public Boolean delete(Integer id) {
        Optional.ofNullable(gameCategoryRepository.findById(id)).orElseThrow(() -> new EntityNotFoundException());
        gameCategoryRepository.deleteByID(id);
        return true;
    }
}
