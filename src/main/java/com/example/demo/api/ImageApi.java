package com.example.demo.api;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@RequestMapping("/image")
public interface ImageApi {

    @ApiOperation(tags = {"Image",}, notes = "", value = "Get Image By Cyber Id")
    @GetMapping("/getByCyberId")
    ResponseEntity<Void> getByCyberId();

    @ApiOperation(tags = {"Image",}, notes = "", value = "Update Image")
    @PutMapping("/update")
    ResponseEntity<Void> update();

    @ApiOperation(tags = {"Image",}, notes = "", value = "Create Image")
    @PostMapping("/create")
    ResponseEntity<Void> create();

    @ApiOperation(tags = {"Image",}, notes = "", value = "Delete Image")
    @DeleteMapping("/delete/{id}")
    ResponseEntity<Void> delete(@PathVariable("id") Long id);
}
