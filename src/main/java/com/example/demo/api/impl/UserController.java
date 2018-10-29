package com.example.demo.api.impl;

import com.example.demo.api.UserApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserApi {
    @Override
    public ResponseEntity<Void> getByAccountId() {
        return null;
    }

    @Override
    public ResponseEntity<Void> update() {
        return null;
    }

    @Override
    public ResponseEntity<Void> create() {
        return null;
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        return null;
    }
}
