package com.example.demo.api;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@RequestMapping("/gameRequest")
public interface GameRequestApi {

    @ApiOperation(tags = {"GameRequest",}, notes = "", value = "Get GameRequest By Id")
    @GetMapping("/getById")
    ResponseEntity<Void> getById();

    @ApiOperation(tags = {"GameRequest",}, notes = "", value = "Create GameRequest")
    @PostMapping("/create")
    ResponseEntity<Void> create();

    @ApiOperation(tags = {"GameRequest",}, notes = "", value = "Update GameRequest")
    @PutMapping("/update")
    ResponseEntity<Void> update();

    @ApiOperation(tags = {"GameRequest",}, notes = "", value = "Delete GameRequest")
    @DeleteMapping("/delete/{id}")
    ResponseEntity<Void> delete(@PathVariable("id") Long id);

    @ApiOperation(tags = {"GameRequest",}, notes = "", value = "Get GameRequest By Service Request Id")
    @GetMapping("/getByServiceRequestId")
    ResponseEntity<Void> getByServiceRequestId();

}
