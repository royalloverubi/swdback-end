package com.example.demo.api;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@RequestMapping("/serviceRequest")
public interface ServiceRequestApi {

    @GetMapping("/getById")
    ResponseEntity<Void> getById();

    @PutMapping("/update")
    ResponseEntity<Void> update();

    @PostMapping("/create")
    ResponseEntity<Void> create();

    @DeleteMapping("/delete/{id}")
    ResponseEntity<Void> delete(@PathVariable("id") Long id);

    @GetMapping("/getByUserId")
    ResponseEntity<Void> getByUserId();
}
