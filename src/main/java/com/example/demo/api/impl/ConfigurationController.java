package com.example.demo.api.impl;

import com.example.demo.api.ConfigurationApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationController implements ConfigurationApi {
    @Override
    public ResponseEntity<Void> getByCyberId() {
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
