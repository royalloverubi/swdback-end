package com.example.demo.api;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@RequestMapping("/game")
public interface GameApi {

    @ApiOperation(tags = {"Game",}, notes = "", value = "Get All Game")
    @GetMapping("/getAll")
    ResponseEntity<Void> getAll();

    @ApiOperation(tags = {"Game",}, notes = "", value = "Get All Game")
    @GetMapping("/getById")
    ResponseEntity<Void> getById();

    @ApiOperation(tags = {"Game",}, notes = "", value = "Create Game")
    @PostMapping("/create")
    ResponseEntity<Void> create();

    @ApiOperation(tags = {"Game",}, notes = "", value = "Update Game")
    @PutMapping("/update")
    ResponseEntity<Void> update();

    @ApiOperation(tags = {"Game",}, notes = "", value = "Delete Game")
    @DeleteMapping("/delete/{id}")
    ResponseEntity<Void> delete(@PathVariable("id") Long id);
}
