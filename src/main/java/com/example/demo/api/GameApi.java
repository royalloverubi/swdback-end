package com.example.demo.api;

import com.example.demo.service.dto.GameDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Component
@RequestMapping("/game")
public interface GameApi {

    @ApiOperation(tags = {"Game",}, notes = "", value = "Get All Game")
    @GetMapping("/getAll")
    ResponseEntity<List<GameDTO>> getAll();

    @ApiOperation(tags = {"Game",}, notes = "", value = "Get All Game")
    @GetMapping("/getById")
    ResponseEntity<GameDTO> getById(@RequestParam("id") Integer id);

    @ApiOperation(tags = {"Game",}, notes = "", value = "Create Game")
    @PostMapping("/create")
    ResponseEntity<GameDTO> create(@RequestBody GameDTO gameDTO);

    @ApiOperation(tags = {"Game",}, notes = "", value = "Update Game")
    @PutMapping("/update")
    ResponseEntity<GameDTO> update(@RequestBody GameDTO gameDTO);

    @ApiOperation(tags = {"Game",}, notes = "", value = "Delete Game")
    @DeleteMapping("/delete/{id}")
    ResponseEntity<Map<String, Boolean>> delete(@PathVariable("id") Integer id);
}
