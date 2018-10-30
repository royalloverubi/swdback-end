package com.example.demo.api;


import com.example.demo.service.dto.GameCategoryDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Component
@RequestMapping("/gameCategory")
public interface GameCategoryApi {

    @GetMapping("/getAll")
    ResponseEntity<List<GameCategoryDTO>> getAll();

    @GetMapping("/getById")
    ResponseEntity<GameCategoryDTO> getById(@RequestParam("id") Integer id);

    @PostMapping("/create")
    ResponseEntity<GameCategoryDTO> create(@RequestBody GameCategoryDTO gameCategoryDTO);

    @PutMapping("/update")
    ResponseEntity<GameCategoryDTO> update(@RequestBody GameCategoryDTO gameCategoryDTO);

    @DeleteMapping("/delete/{id}")
    ResponseEntity<Map<String, Boolean>> delete(@PathVariable("id") Integer id);
}
