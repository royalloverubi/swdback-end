package com.example.demo.service;

import com.example.demo.service.dto.GameDTO;

import java.util.List;

public interface GameService {

    List<GameDTO> getAll();

    GameDTO getById(Integer id);

    GameDTO create(GameDTO gameDTO);

    GameDTO update(GameDTO gameDTO);

    Boolean delete(Integer id);
}
