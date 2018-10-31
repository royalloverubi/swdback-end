package com.example.demo.api;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@RequestMapping("/proposition")
public interface PropositionApi {

    @ApiOperation(tags = {"Proposition",}, notes = "", value = "Get Proposition By Request Id")
    @GetMapping("/getByRequestId")
    ResponseEntity<Void> getByRequestId();

    @ApiOperation(tags = {"Proposition",}, notes = "", value = "Get Proposition By Id")
    @GetMapping("/getById")
    ResponseEntity<Void> getById();

    @ApiOperation(tags = {"Proposition",}, notes = "", value = "Update Proposition")
    @PutMapping("/update")
    ResponseEntity<Void> update();

    @ApiOperation(tags = {"Proposition",}, notes = "", value = "Delete Proposition")
    @DeleteMapping("/delete/{id}")
    ResponseEntity<Void> delete(@PathVariable("id") Long id);

    @ApiOperation(tags = {"Proposition",}, notes = "", value = "Create Proposition")
    @PostMapping("/create")
    ResponseEntity<Void> create();


}
