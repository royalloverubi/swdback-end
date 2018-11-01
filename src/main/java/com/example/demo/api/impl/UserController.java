package com.example.demo.api.impl;

import com.example.demo.api.UserApi;
import com.example.demo.service.UserService;
import com.example.demo.service.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController implements UserApi {

    @Autowired
    UserService userService;

    @Override
    public ResponseEntity<UserDTO> getByAccountId(@RequestParam("accountId") Integer accountId) {
        UserDTO userDTO = userService.getByAccountId(accountId);
        return ResponseEntity.ok(userDTO);
    }

    @Override
    public ResponseEntity<UserDTO> update(@RequestBody UserDTO userDTO) {
        UserDTO dto = userService.update(userDTO);
        return ResponseEntity.ok(dto);
    }

    @Override
    public ResponseEntity<UserDTO> create(@RequestBody UserDTO userDTO) {
        UserDTO dto = userService.create(userDTO);
        return ResponseEntity.ok(dto);
    }

    @Override
    public ResponseEntity<Map<String, Boolean>> delete(@PathVariable("id") Integer id) {
        Boolean result = userService.delete(id);
        Map<String, Boolean> resul = new HashMap<>();
        resul.put("Content", result);
        return ResponseEntity.ok(resul);
    }
}
