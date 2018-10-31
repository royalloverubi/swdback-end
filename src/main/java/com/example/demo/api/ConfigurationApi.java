package com.example.demo.api;

import com.example.demo.service.dto.ConfigurationDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Component
@RequestMapping("/configuration")
public interface ConfigurationApi {

    @ApiOperation(tags = {"Configuration",}, notes = "", value = "Get Configuration By CyberId")
    @GetMapping("/getByCyberId")
    ResponseEntity<List<ConfigurationDTO>> getByCyberId(@RequestParam("cyberId") Integer cyberId);

    @ApiOperation(tags = {"Configuration",}, notes = "", value = "Create new Configuration")
    @PostMapping("/create")
    ResponseEntity<ConfigurationDTO> create(@RequestBody ConfigurationDTO configurationDTO);

    @ApiOperation(tags = {"Configuration",}, notes = "", value = "Update Configuration")
    @PutMapping("/update")
    ResponseEntity<ConfigurationDTO> update(@RequestBody ConfigurationDTO configurationDTO);

    @ApiOperation(tags = {"Configuration",}, notes = "", value = "Delete Configuration")
    @DeleteMapping("/delete/{id}")
    ResponseEntity<Map<String, Boolean>> delete(@PathVariable("id") Integer id);

    @ApiOperation(tags = {"Configuration",}, notes = "", value = "Get Configuration By Id")
    @GetMapping("/getById")
    ResponseEntity<ConfigurationDTO> getById(@RequestParam("id") Integer id);
}
