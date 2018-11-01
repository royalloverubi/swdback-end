package com.example.demo.api;

import com.example.demo.service.dto.CustomerDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Component
@RequestMapping("/customer")
public interface CustomerApi {

    @ApiOperation(tags = {"Customer",}, notes = "", value = "Get Customer By Account Id")
    @GetMapping("/getByAccountId")
    ResponseEntity<CustomerDTO> getByAccountId(@RequestParam("accountId") Integer accountId);

    @ApiOperation(tags = {"Customer",}, notes = "", value = "Update Customer")
    @PostMapping("/update")
    ResponseEntity<CustomerDTO> update(@RequestBody CustomerDTO customerDTO);

    @ApiOperation(tags = {"Customer",}, notes = "", value = "Create Customer")
    @PutMapping("/create")
    ResponseEntity<CustomerDTO> create(@RequestBody CustomerDTO customerDTO);

    @ApiOperation(tags = {"Customer",}, notes = "", value = "Delete Customer")
    @DeleteMapping("/delete/{id}")
    ResponseEntity<Map<String, Boolean>> delete(@PathVariable("id") Integer id);
}
