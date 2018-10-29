package com.example.demo.api;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@RequestMapping("/configuration")
public interface ConfigurationApi {

    @GetMapping("/getByCyberId")
    ResponseEntity<Void> getByCyberId();

    @PostMapping("/create")
    ResponseEntity<Void> create();

    @PutMapping("/update")
    ResponseEntity<Void> update();

    @DeleteMapping("/delete/{id}")
    ResponseEntity<Void> delete(@PathVariable("id") Long id);
}
