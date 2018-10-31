package com.example.demo.api;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@RequestMapping("/room")
public interface RoomApi {

    @ApiOperation(tags = {"Room",}, notes = "", value = "Get All Room")
    @GetMapping("/getAll")
    ResponseEntity<Void> getAll();

    @ApiOperation(tags = {"Room",}, notes = "", value = "Create Room")
    @PostMapping("/create")
    ResponseEntity<Void> create();

    @ApiOperation(tags = {"Room",}, notes = "", value = "Update Room")
    @PutMapping("/update")
    ResponseEntity<Void> update();

    @ApiOperation(tags = {"Room",}, notes = "", value = "Get Room By Id")
    @GetMapping("/getById")
    ResponseEntity<Void> getById();

    @ApiOperation(tags = {"Room",}, notes = "", value = "Delete Room")
    @DeleteMapping("/delete/{id}")
    ResponseEntity<Void> delete(@PathVariable("id") Long id);
}
