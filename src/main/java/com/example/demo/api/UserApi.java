package com.example.demo.api;

import com.example.demo.service.dto.UserDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Component
@RequestMapping("/user")
public interface UserApi {

    @ApiOperation(tags = {"User",}, notes = "", value = "Get User By Account Id")
    @GetMapping("/getByAccountId")
    ResponseEntity<UserDTO> getByAccountId(@RequestParam("accountId") Integer accountId);

    @ApiOperation(tags = {"User",}, notes = "", value = "Update User")
    @PostMapping("/update")
    ResponseEntity<UserDTO> update(@RequestBody UserDTO userDTO);

    @ApiOperation(tags = {"User",}, notes = "", value = "Create User")
    @PutMapping("/create")
    ResponseEntity<UserDTO> create(@RequestBody UserDTO userDTO);

    @ApiOperation(tags = {"User",}, notes = "", value = "Delete User")
    @DeleteMapping("/delete/{id}")
    ResponseEntity<Map<String, Boolean>> delete(@PathVariable("id") Integer id);
}
