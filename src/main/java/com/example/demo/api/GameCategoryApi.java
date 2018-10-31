package com.example.demo.api;


import com.example.demo.service.dto.GameCategoryDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Component
@RequestMapping("/gameCategory")
public interface GameCategoryApi {

    @ApiOperation(tags = {"GameCategory",}, notes = "", value = "Get All GameCategory")
    @GetMapping("/getAll")
    ResponseEntity<List<GameCategoryDTO>> getAll();

    @ApiOperation(tags = {"GameCategory",}, notes = "", value = "Get GameCategory By Id")
    @GetMapping("/getById")
    ResponseEntity<GameCategoryDTO> getById(@RequestParam("id") Integer id);

    @ApiOperation(tags = {"GameCategory",}, notes = "", value = "Create GameCategory")
    @PostMapping("/create")
    ResponseEntity<GameCategoryDTO> create(@RequestBody GameCategoryDTO gameCategoryDTO);

    @ApiOperation(tags = {"GameCategory",}, notes = "", value = "Update GameCategory")
    @PutMapping("/update")
    ResponseEntity<GameCategoryDTO> update(@RequestBody GameCategoryDTO gameCategoryDTO);

    @ApiOperation(tags = {"GameCategory",}, notes = "", value = "Delete GameCategory")
    @DeleteMapping("/delete/{id}")
    ResponseEntity<Map<String, Boolean>> delete(@PathVariable("id") Integer id);
}
