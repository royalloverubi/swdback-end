package com.example.demo.api;

import com.example.demo.persistent.entity.Beverage;
import com.example.demo.service.BeverageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BeverageController implements BeverageApi{

    @Autowired
    BeverageService beverageService;

    public ResponseEntity<List<Beverage>> getAll (@RequestParam String name) {
        List<Beverage> beverages = beverageService.getAll();
        return ResponseEntity.ok(beverages);
    }

        public ResponseEntity<Beverage> update(@PathVariable Long id, @RequestBody Beverage beverage) {
        Beverage beverage1 = beverageService.update(beverage);
        return ResponseEntity.ok(beverage1);
    }

    public ResponseEntity<Beverage> insert (@RequestBody Beverage beverage) {
        Beverage beverage1 = beverageService.insert(beverage);
        return ResponseEntity.ok(beverage1);
    }

    public ResponseEntity<Boolean> delete (@PathVariable Long id) {
        Boolean result = beverageService.delete(id);
        return ResponseEntity.ok(result);
    }


}
