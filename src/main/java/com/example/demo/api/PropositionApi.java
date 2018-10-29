package com.example.demo.api;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@RequestMapping("/proposition")
public interface PropositionApi {

    @GetMapping("/getByRequestId")
    ResponseEntity<Void> getByRequestId();

    @GetMapping("/getById")
    ResponseEntity<Void> getById();

    @PutMapping("/update")
    ResponseEntity<Void> update();

    @DeleteMapping("/delete/{id}")
    ResponseEntity<Void> delete(@PathVariable("id") Long id);

    @PostMapping("/create")
    ResponseEntity<Void> create();


}
