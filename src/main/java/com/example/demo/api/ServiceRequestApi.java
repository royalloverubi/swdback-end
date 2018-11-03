package com.example.demo.api;

import com.example.demo.service.dto.ServiceRequestDTO;
import com.example.demo.service.dto.ServiceRequestDetailDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Component
@RequestMapping("/serviceRequest")
public interface ServiceRequestApi {

    @ApiOperation(tags = {"ServiceRequest",}, notes = "", value = "Get ServiceRequest By Id")
    @GetMapping("/{id}")
    ResponseEntity<ServiceRequestDetailDTO> getById(@PathVariable("id") Integer id);

    @ApiOperation(tags = {"ServiceRequest",}, notes = "", value = "Update ServiceRequest")
    @PutMapping("")
    ResponseEntity<ServiceRequestDTO> update(@RequestBody ServiceRequestDTO serviceRequestDTO);

    @ApiOperation(tags = {"ServiceRequest",}, notes = "", value = "Create ServiceRequest")
    @PostMapping("")
    ResponseEntity<ServiceRequestDTO> create(@RequestBody ServiceRequestDTO serviceRequestDTO);

    @ApiOperation(tags = {"ServiceRequest",}, notes = "", value = "Delete ServiceRequest")
    @DeleteMapping("/{id}")
    ResponseEntity<Map<String, Boolean>> delete(@PathVariable("id") Integer id);

    @ApiOperation(tags = {"ServiceRequest",}, notes = "", value = "Get ServiceRequest By Account Request Id")
    @GetMapping("/getByAccountRequestId")
    ResponseEntity<List<ServiceRequestDetailDTO>> getByAccountRequestId(@RequestParam("accountId") Integer id);
}
