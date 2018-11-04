package com.example.demo.api.impl;

import com.example.demo.api.ServiceRequestApi;
import com.example.demo.service.ServiceRequestService;
import com.example.demo.service.dto.ServiceRequestDTO;
import com.example.demo.service.dto.ServiceRequestDetailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ServiceRequestController implements ServiceRequestApi {

    @Autowired
    ServiceRequestService serviceRequestService;

    @Override
    public ResponseEntity<ServiceRequestDTO> getById(@PathVariable("id") Integer id) {
        ServiceRequestDTO serviceRequestDTO = serviceRequestService.getById(id);
        return ResponseEntity.ok(serviceRequestDTO);
    }

    @Override
    public ResponseEntity<ServiceRequestDTO> update(@RequestBody ServiceRequestDTO serviceRequestDTO) {
        ServiceRequestDTO dto = serviceRequestService.update(serviceRequestDTO);
        return ResponseEntity.ok(dto);
    }

    @Override
    public ResponseEntity<ServiceRequestDTO> create(@RequestBody ServiceRequestDTO serviceRequestDTO) {
        ServiceRequestDTO dto = serviceRequestService.create(serviceRequestDTO);
        return ResponseEntity.ok(dto);
    }

    @Override
    public ResponseEntity<Map<String, Boolean>> delete(Integer id) {
        Boolean result = serviceRequestService.delete(id);
        Map<String, Boolean> resul = new HashMap<>();
        resul.put("Content", result);
        return ResponseEntity.ok(resul);
    }

    @Override
    public ResponseEntity<List<ServiceRequestDTO>> getByAccountRequestId(@PathVariable("customerId") Integer id) {
        List<ServiceRequestDTO> serviceRequestDTOS = serviceRequestService.getByAccountRequestId(id);
        return ResponseEntity.ok(serviceRequestDTOS);
    }

    @Override
    public ResponseEntity<List<ServiceRequestDTO>> getListNeedToAprove(@PathVariable("cyberId") Integer cyberId) {
        List<ServiceRequestDTO> serviceRequestDTOS = serviceRequestService.getListNeedToAprove(cyberId);
        return ResponseEntity.ok(serviceRequestDTOS);
    }

    @Override
    public ResponseEntity<Map<String, Boolean>> approveRequest(Integer id) {
        Boolean result = serviceRequestService.approveARequest(id);
        Map<String, Boolean> resul = new HashMap<>();
        resul.put("Content", result);
        return ResponseEntity.ok(resul);
    }

    @Override
    public ResponseEntity<List<ServiceRequestDetailDTO>> getListNeedToAproveByAccountId(@PathVariable("accountId") Integer accountId) {
        List<ServiceRequestDetailDTO> serviceRequestDTOS = serviceRequestService.getListNeedToAproveByAccountId(accountId);
        return ResponseEntity.ok(serviceRequestDTOS);
    }

    @Override
    public ResponseEntity<List<ServiceRequestDTO>> getListAproved(@PathVariable("customerId") Integer customerId) {
        List<ServiceRequestDTO> serviceRequestDTOS = serviceRequestService.getListApproved(customerId);
        return ResponseEntity.ok(serviceRequestDTOS);
    }

    @Override
    public ResponseEntity<List<ServiceRequestDTO>> getListDone(@PathVariable("customerId") Integer customerId) {
        List<ServiceRequestDTO> serviceRequestDTOS = serviceRequestService.getListDone(customerId);
        return ResponseEntity.ok(serviceRequestDTOS);
    }
}
