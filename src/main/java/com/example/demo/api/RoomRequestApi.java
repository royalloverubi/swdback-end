package com.example.demo.api;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@RequestMapping("/roomRequest")
public interface RoomRequestApi {

    @ApiOperation(tags = {"RoomRequest",}, notes = "", value = "Get RoomRequest By Id")
    @GetMapping("/getById")
    ResponseEntity<Void> getById();

    @ApiOperation(tags = {"RoomRequest",}, notes = "", value = "Create RoomRequest")
    @PostMapping("/create")
    ResponseEntity<Void> create();

    @ApiOperation(tags = {"RoomRequest",}, notes = "", value = "Update RoomRequest")
    @PutMapping("/update")
    ResponseEntity<Void> update();

    @ApiOperation(tags = {"RoomRequest",}, notes = "", value = "Delete RoomRequest")
    @DeleteMapping("/delete/{id}")
    ResponseEntity<Void> delete(@PathVariable("id") Long id);

    @ApiOperation(tags = {"RoomRequest",}, notes = "", value = "Get RoomRequest By Service Request Id")
    @GetMapping("/getByServiceRequestId")
    ResponseEntity<Void> getByServiceRequestId();
}
