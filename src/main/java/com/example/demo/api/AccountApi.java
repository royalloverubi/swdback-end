package com.example.demo.api;

import com.example.demo.service.dto.AccountDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Component
@RequestMapping("/account")
public interface AccountApi {

    @PostMapping("/create")
    ResponseEntity<AccountDTO> create(@RequestBody AccountDTO accountDTO);

    @PutMapping("/update")
    ResponseEntity<AccountDTO> update(@RequestBody AccountDTO accountDTO);

    @GetMapping("/getAll")
    ResponseEntity<List<AccountDTO>> getAll();

    @DeleteMapping("/delete/{id}")
    ResponseEntity<Map<String, Boolean>> delete(@PathVariable("id") Integer id);

}
