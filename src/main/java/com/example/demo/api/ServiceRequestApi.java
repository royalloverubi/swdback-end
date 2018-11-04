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
    ResponseEntity<ServiceRequestDTO> getById(@PathVariable("id") Integer id);

    @ApiOperation(tags = {"ServiceRequest",}, notes = "", value = "Update ServiceRequest")
    @PutMapping("")
    ResponseEntity<ServiceRequestDTO> update(@RequestBody ServiceRequestDTO serviceRequestDTO);

    @ApiOperation(tags = {"ServiceRequest",}, notes = "", value = "Create ServiceRequest")
    @PostMapping("")
    ResponseEntity<ServiceRequestDTO> create(@RequestBody ServiceRequestDTO serviceRequestDTO);

    @ApiOperation(tags = {"ServiceRequest",}, notes = "", value = "Delete ServiceRequest")
    @DeleteMapping("/{id}")
    ResponseEntity<Map<String, Boolean>> delete(@PathVariable("id") Integer id);

    @ApiOperation(tags = {"ServiceRequest",}, notes = "", value = "Get ServiceRequest By Customer Request Id")
    @GetMapping("/getByAccountRequestId/{customerId}")
    ResponseEntity<List<ServiceRequestDTO>> getByAccountRequestId(@PathVariable("customerId") Integer id);

    @ApiOperation(tags = {"ServiceRequest",}, notes = "", value = "Get List ServiceRequest Need To Approve By CyberId")
    @GetMapping("/getListNeedToAprove/{cyberId}")
    ResponseEntity<List<ServiceRequestDTO>>getListNeedToAprove(@PathVariable("cyberId") Integer cyberId);

    @ApiOperation(tags = {"ServiceRequest",}, notes = "", value = "Approve a ServiceRequest")
    @PutMapping("/approve/{id}")
    ResponseEntity<Map<String, Boolean>> approveRequest(@PathVariable("id") Integer id);

    @ApiOperation(tags = {"ServiceRequest",}, notes = "", value = "Get List ServiceRequest Need To ApproveByAccountId")
    @GetMapping("/getListNeedToAproveByAccountId/{accountId}")
    ResponseEntity<List<ServiceRequestDetailDTO>>getListNeedToAproveByAccountId(@PathVariable("accountId") Integer accountId);

    @ApiOperation(tags = {"ServiceRequest",}, notes = "", value = "Get List ServiceRequest Approved By Customer Id")
    @GetMapping("/getListAproved/{customerId}")
    ResponseEntity<List<ServiceRequestDTO>>getListAproved(@PathVariable("customerId") Integer customerId);

    @ApiOperation(tags = {"ServiceRequest",}, notes = "", value = "Get List ServiceRequest Done By Customer Id")
    @GetMapping("/getListDone/{customerId}")
    ResponseEntity<List<ServiceRequestDTO>>getListDone(@PathVariable("customerId") Integer customerId);
}
