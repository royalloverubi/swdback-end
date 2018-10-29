package com.example.demo.api.impl;


import com.example.demo.api.GameCategoryApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameCategoryController implements GameCategoryApi {
    @Override
    public ResponseEntity<Void> getAll() {
        return null;
    }

    @Override
    public ResponseEntity<Void> getById() {
        return null;
    }

    @Override
    public ResponseEntity<Void> create() {
        return null;
    }

    @Override
    public ResponseEntity<Void> update() {
        return null;
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        return null;
    }
}
