package com.example.demo.api;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@RequestMapping("/user")
public interface UserApi {

    @GetMapping("/getByAccountId")
    ResponseEntity<Void> getByAccountId();

    @PostMapping("/update")
    ResponseEntity<Void> update();

    @PutMapping("/create")
    ResponseEntity<Void> create();

    @DeleteMapping("/delete/{id}")
    ResponseEntity<Void> delete(@PathVariable("id") Long id);
}
