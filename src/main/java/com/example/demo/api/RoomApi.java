package com.example.demo.api;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@RequestMapping("/room")
public interface RoomApi {

    @GetMapping("/getAll")
    ResponseEntity<Void> getAll();

    @PostMapping("/create")
    ResponseEntity<Void> create();

    @PutMapping("/update")
    ResponseEntity<Void> update();

    @GetMapping("/getById")
    ResponseEntity<Void> getById();

    @DeleteMapping("/delete/{id}")
    ResponseEntity<Void> delete(@PathVariable("id") Long id);
}
