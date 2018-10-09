package com.example.demo.api;

import com.example.demo.persistent.entity.Beverage;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@RequestMapping("/api")
public interface BeverageApi {


    @ApiOperation(tags = {"Beverage",}, notes = "", value = "Get All Data of Bverage Table")
    @GetMapping("/")
    ResponseEntity<List<Beverage>> getAll (@RequestParam String name);

    @ApiOperation(tags = {"Beverage",}, value = "update Beverge Table")
    @PutMapping("/{id}")
    ResponseEntity<Beverage> update(@PathVariable Long id, @RequestBody Beverage beverage);

    @ApiOperation(tags = {"Beverage",}, value = "Insert new Beverage")
    @PostMapping("/")
    ResponseEntity<Beverage> insert (@RequestBody Beverage beverage);

    @ApiOperation(tags = {"Beverage",}, value = "Delete Beverage")
    @DeleteMapping("/{id}")
    ResponseEntity<Boolean> delete (@PathVariable Long id);
}
