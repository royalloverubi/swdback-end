package com.example.demo.service;

import com.example.demo.service.dto.ServiceRequestDTO;

import java.util.List;

public interface ServiceRequestService {

    ServiceRequestDTO getById(Integer id);

    ServiceRequestDTO create(ServiceRequestDTO serviceRequestDTO);

    ServiceRequestDTO update(ServiceRequestDTO serviceRequestDTO);

    Boolean delete(Integer id);

    List<ServiceRequestDTO> getByAccountRequestId(Integer id);
}
