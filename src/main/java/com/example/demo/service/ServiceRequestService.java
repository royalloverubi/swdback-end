package com.example.demo.service;

import com.example.demo.service.dto.ServiceRequestDTO;
import com.example.demo.service.dto.ServiceRequestDetailDTO;

import java.util.List;

public interface ServiceRequestService {

    ServiceRequestDTO getById(Integer id);

    ServiceRequestDTO create(ServiceRequestDTO serviceRequestDTO);

    ServiceRequestDTO update(ServiceRequestDTO serviceRequestDTO);

    Boolean delete(Integer id);

    List<ServiceRequestDTO> getByAccountRequestId(Integer id);

    List<ServiceRequestDTO> getListNeedToAprove(Integer cyberId);

    Boolean approveARequest(Integer id);

    List<ServiceRequestDetailDTO> getListNeedToAproveByAccountId(Integer accountId);

    List<ServiceRequestDTO> getListApproved(Integer customerId);

    List<ServiceRequestDTO> getListDone(Integer customerId);
}
