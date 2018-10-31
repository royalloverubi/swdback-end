package com.example.demo.api;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@RequestMapping("/user")
public interface UserApi {

    @ApiOperation(tags = {"User",}, notes = "", value = "Get User By Account Id")
    @GetMapping("/getByAccountId")
    ResponseEntity<Void> getByAccountId();

    @ApiOperation(tags = {"User",}, notes = "", value = "Update User")
    @PostMapping("/update")
    ResponseEntity<Void> update();

    @ApiOperation(tags = {"User",}, notes = "", value = "Create User")
    @PutMapping("/create")
    ResponseEntity<Void> create();

    @ApiOperation(tags = {"User",}, notes = "", value = "Delete User")
    @DeleteMapping("/delete/{id}")
    ResponseEntity<Void> delete(@PathVariable("id") Long id);
}
