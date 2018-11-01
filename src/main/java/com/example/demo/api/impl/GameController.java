package com.example.demo.api.impl;


import com.example.demo.api.GameApi;
import com.example.demo.service.GameService;
import com.example.demo.service.dto.GameDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class GameController implements GameApi {

    @Autowired
    GameService gameService;

    @Override
    public ResponseEntity<List<GameDTO>> getAll() {
        List<GameDTO> gameDTOS = gameService.getAll();
        return ResponseEntity.ok(gameDTOS);
    }

    @Override
    public ResponseEntity<GameDTO> getById(@RequestParam("id") Integer id) {
        GameDTO gameDTO = gameService.getById(id);
        return ResponseEntity.ok(gameDTO);
    }

    @Override
    public ResponseEntity<GameDTO> create(@RequestBody GameDTO gameDTO) {
        GameDTO dto = gameService.create(gameDTO);
        return ResponseEntity.ok(dto);
    }

    @Override
    public ResponseEntity<GameDTO> update(@RequestBody GameDTO gameDTO) {
        GameDTO dto = gameService.create(gameDTO);
        return ResponseEntity.ok(dto);
    }

    @Override
    public ResponseEntity<Map<String, Boolean>> delete(@PathVariable("id") Integer id) {
        Boolean result = gameService.delete(id);
        Map<String, Boolean> resul = new HashMap<>();
        resul.put("Content", result);
        return ResponseEntity.ok(resul);
    }
}
