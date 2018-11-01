package com.example.demo.api;

import com.example.demo.service.dto.RoomDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Component
@RequestMapping("/room")
public interface RoomApi {

    @ApiOperation(tags = {"Room",}, notes = "", value = "Get All Room")
    @GetMapping("/getAll")
    ResponseEntity<List<RoomDTO>> getAll();

    @ApiOperation(tags = {"Room",}, notes = "", value = "Create Room")
    @PostMapping("/create")
    ResponseEntity<RoomDTO> create(@RequestBody RoomDTO roomDTO);

    @ApiOperation(tags = {"Room",}, notes = "", value = "Update Room")
    @PutMapping("/update")
    ResponseEntity<RoomDTO> update(@RequestBody RoomDTO roomDTO);

    @ApiOperation(tags = {"Room",}, notes = "", value = "Get Room By Id")
    @GetMapping("/getById")
    ResponseEntity<RoomDTO> getById(@RequestParam("id") Integer id);

    @ApiOperation(tags = {"Room",}, notes = "", value = "Delete Room")
    @DeleteMapping("/delete/{id}")
    ResponseEntity<Map<String, Boolean>> delete(@PathVariable("id") Integer id);
}
