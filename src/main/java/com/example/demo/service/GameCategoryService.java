package com.example.demo.service;

import com.example.demo.service.dto.GameCategoryDTO;

import java.util.List;

public interface GameCategoryService {

    List<GameCategoryDTO> getAll();

    GameCategoryDTO getById(Integer id);

    GameCategoryDTO create(GameCategoryDTO gameCategoryDTO);

    GameCategoryDTO update(GameCategoryDTO gameCategoryDTO);

    Boolean delete(Integer id);
}
