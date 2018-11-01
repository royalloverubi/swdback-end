package com.example.demo.service.impl;

import com.example.demo.persistent.entity.Game;
import com.example.demo.persistent.repository.GameRepository;
import com.example.demo.service.GameService;
import com.example.demo.service.dto.GameDTO;
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
public class GameServiceImpl implements GameService {

    private final GameRepository gameRepository;

    public GameServiceImpl(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Override
    public List<GameDTO> getAll() {
        List<Game> games = gameRepository.getAll();
        if(ObjectUtils.isEmpty(games)) {
            return null;
        }
        ModelMapper modelMapper = new ModelMapper();
        List<GameDTO> gameDTOS = new ArrayList<>();
        for (Game gam : games) {
            gameDTOS.add(modelMapper.map(gam, GameDTO.class));
        }
        return gameDTOS;
    }

    @Override
    public GameDTO getById(Integer id) {
        Game game = gameRepository.findByID(id);
        if(ObjectUtils.isEmpty(game)) {
            return null;
        }
        ModelMapper modelMapper = new ModelMapper();
        GameDTO gameDTO = modelMapper.map(game, GameDTO.class);
        return gameDTO;
    }

    @Override
    public GameDTO create(GameDTO gameDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Game game = modelMapper.map(gameDTO, Game.class);
        game = gameRepository.save(game);
        GameDTO dto = modelMapper.map(game, GameDTO.class);
        return dto;
    }

    @Override
    public GameDTO update(GameDTO gameDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Game game = modelMapper.map(gameDTO, Game.class);
        game = gameRepository.saveAndFlush(game);
        GameDTO dto = modelMapper.map(game, GameDTO.class);
        return dto;
    }

    @Override
    public Boolean delete(Integer id) {
        Optional.ofNullable(gameRepository.findById(id)).orElseThrow(() -> new EntityNotFoundException());
        gameRepository.deleteByID(id);
        return true;
    }
}
