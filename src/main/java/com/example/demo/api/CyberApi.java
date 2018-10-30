package com.example.demo.api;


import com.example.demo.service.dto.CyberGamingDTO;
import io.swagger.models.auth.In;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Component
@RequestMapping("/cyber")
public interface CyberApi {

    @GetMapping("/getById")
    ResponseEntity<CyberGamingDTO> getById(@RequestParam("id") Integer id);

    @PostMapping("/create")
    ResponseEntity<CyberGamingDTO> create(@RequestBody CyberGamingDTO cyberGamingDTO);

    @PutMapping("/update")
    ResponseEntity<CyberGamingDTO> update(@RequestBody CyberGamingDTO cyberGamingDTO);

    @DeleteMapping("/delete/{id}")
    ResponseEntity<Map<String, Boolean>> delete(@PathVariable("id") Integer id);

    @GetMapping("/getByAccountId")
    ResponseEntity<CyberGamingDTO> getByAccountId(@RequestParam("id") Integer accountId);

    @GetMapping("/getAll")
    ResponseEntity<List<CyberGamingDTO>> getAll();
}
