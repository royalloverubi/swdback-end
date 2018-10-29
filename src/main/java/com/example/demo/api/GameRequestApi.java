package com.example.demo.api;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@RequestMapping("/gameRequest")
public interface GameRequestApi {

    @GetMapping("/getById")
    ResponseEntity<Void> getById();

    @PostMapping("/create")
    ResponseEntity<Void> create();

    @PutMapping("/update")
    ResponseEntity<Void> update();

    @DeleteMapping("/delete/{id}")
    ResponseEntity<Void> delete(@PathVariable("id") Long id);

    @GetMapping("/getByServiceRequestId")
    ResponseEntity<Void> getByServiceRequestId();

}
