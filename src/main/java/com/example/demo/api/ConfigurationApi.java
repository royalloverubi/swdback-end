package com.example.demo.api;

import com.example.demo.service.dto.ConfigurationDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Component
@RequestMapping("/configuration")
public interface ConfigurationApi {

    @GetMapping("/getByCyberId")
    ResponseEntity<List<ConfigurationDTO>> getByCyberId(@RequestParam("cyberId") Integer cyberId);

    @PostMapping("/create")
    ResponseEntity<ConfigurationDTO> create(@RequestBody ConfigurationDTO configurationDTO);

    @PutMapping("/update")
    ResponseEntity<ConfigurationDTO> update(@RequestBody ConfigurationDTO configurationDTO);

    @DeleteMapping("/delete/{id}")
    ResponseEntity<Map<String, Boolean>> delete(@PathVariable("id") Integer id);

    @GetMapping("/getById")
    ResponseEntity<ConfigurationDTO> getById(@RequestParam("Id") Integer Id);
}
