package com.example.demo.api.impl;


import com.example.demo.api.GameCategoryApi;
import com.example.demo.persistent.entity.GameCategory;
import com.example.demo.service.GameCategoryService;
import com.example.demo.service.dto.GameCategoryDTO;
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
public class GameCategoryController implements GameCategoryApi {

    @Autowired
    GameCategoryService gameCategoryService;

    @Override
    public ResponseEntity<List<GameCategoryDTO>> getAll() {
        List<GameCategoryDTO> gameCategoryDTOS = gameCategoryService.getAll();
        return ResponseEntity.ok(gameCategoryDTOS);
    }

    @Override
    public ResponseEntity<GameCategoryDTO> getById(@RequestParam("id") Integer id) {
        GameCategoryDTO gameCategoryDTO = gameCategoryService.getById(id);
        return ResponseEntity.ok(gameCategoryDTO);
    }

    @Override
    public ResponseEntity<GameCategoryDTO> create(@RequestBody GameCategoryDTO gameCategoryDTO) {
        GameCategoryDTO dto = gameCategoryService.create(gameCategoryDTO);
        return ResponseEntity.ok(dto);
    }

    @Override
    public ResponseEntity<GameCategoryDTO> update(@RequestBody GameCategoryDTO gameCategoryDTO) {
        GameCategoryDTO dto = gameCategoryService.update(gameCategoryDTO);
        return ResponseEntity.ok(dto);
    }

    @Override
    public ResponseEntity<Map<String, Boolean>> delete(@PathVariable("id") Integer id) {
        Boolean result = gameCategoryService.delete(id);
        Map<String, Boolean> resul = new HashMap<>();
        resul.put("Content", result);
        return ResponseEntity.ok(resul);
    }
}
