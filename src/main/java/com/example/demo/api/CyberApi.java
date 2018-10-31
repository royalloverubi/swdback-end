package com.example.demo.api;


import com.example.demo.service.dto.CyberGamingDTO;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Component
@RequestMapping("/cyber")
public interface CyberApi {

    @ApiOperation(tags = {"Cyber",}, notes = "", value = "Get Cyber By Id")
    @GetMapping("/getById")
    ResponseEntity<CyberGamingDTO> getById(@RequestParam("id") Integer id);

    @ApiOperation(tags = {"Cyber",}, notes = "", value = "Create new Cyber")
    @PostMapping("/create")
    ResponseEntity<CyberGamingDTO> create(@RequestBody CyberGamingDTO cyberGamingDTO);

    @ApiOperation(tags = {"Cyber",}, notes = "", value = "Update Cyber")
    @PutMapping("/update")
    ResponseEntity<CyberGamingDTO> update(@RequestBody CyberGamingDTO cyberGamingDTO);

    @ApiOperation(tags = {"Cyber",}, notes = "", value = "Delete Cyber")
    @DeleteMapping("/delete/{id}")
    ResponseEntity<Map<String, Boolean>> delete(@PathVariable("id") Integer id);

    @ApiOperation(tags = {"Cyber",}, notes = "", value = "Get Cyber By AccountId")
    @GetMapping("/getByAccountId")
    ResponseEntity<CyberGamingDTO> getByAccountId(@RequestParam("id") Integer accountId);

    @ApiOperation(tags = {"Cyber",}, notes = "", value = "Get All Cyber")
    @GetMapping("/getAll")
    ResponseEntity<List<CyberGamingDTO>> getAll();
}
