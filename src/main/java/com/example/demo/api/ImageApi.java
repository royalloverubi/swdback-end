package com.example.demo.api;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@RequestMapping("/image")
public interface ImageApi {

    @GetMapping("/getByCyberId")
    ResponseEntity<Void> getByCyberId();

    @PutMapping("/update")
    ResponseEntity<Void> update();

    @PostMapping("/create")
    ResponseEntity<Void> create();

    @DeleteMapping("/delete/{id}")
    ResponseEntity<Void> delete(@PathVariable("id") Long id);
}
