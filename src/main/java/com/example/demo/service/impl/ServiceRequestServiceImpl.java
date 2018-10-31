package com.example.demo.service.impl;

import com.example.demo.persistent.entity.ServiceRequest;
import com.example.demo.persistent.repository.ServiceRequestRepository;
import com.example.demo.service.ServiceRequestService;
import com.example.demo.service.dto.ServiceRequestDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ServiceRequestServiceImpl implements ServiceRequestService {

    private final ServiceRequestRepository serviceRequestRepository;

    public ServiceRequestServiceImpl(ServiceRequestRepository serviceRequestRepository) {
        this.serviceRequestRepository = serviceRequestRepository;
    }

    @Override
    public ServiceRequestDTO getById(Integer id) {
        ServiceRequest serviceRequest = serviceRequestRepository.getByID(id);
        if(ObjectUtils.isEmpty(serviceRequest)) {
            return null;
        }
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(serviceRequest, ServiceRequestDTO.class);
    }

    @Override
    public ServiceRequestDTO create(ServiceRequestDTO serviceRequestDTO) {
        ModelMapper modelMapper = new ModelMapper();
        ServiceRequest serviceRequest = modelMapper.map(serviceRequestDTO, ServiceRequest.class);
        serviceRequest = serviceRequestRepository.save(serviceRequest);
        ServiceRequestDTO dto = modelMapper.map(serviceRequest, ServiceRequestDTO.class);
        return dto;
    }

    @Override
    public ServiceRequestDTO update(ServiceRequestDTO serviceRequestDTO) {
        ModelMapper modelMapper = new ModelMapper();
        ServiceRequest serviceRequest = modelMapper.map(serviceRequestDTO, ServiceRequest.class);
        serviceRequest = serviceRequestRepository.saveAndFlush(serviceRequest);
        ServiceRequestDTO dto = modelMapper.map(serviceRequest, ServiceRequestDTO.class);
        return dto;
    }

    @Override
    public Boolean delete(Integer id) {
        Optional.ofNullable(serviceRequestRepository.findById(id)).orElseThrow(() -> new EntityNotFoundException());
        serviceRequestRepository.deleteByID(id);
        return true;
    }

    @Override
    public List<ServiceRequestDTO> getByAccountRequestId(Integer id) {
        List<ServiceRequest> serviceRequests = serviceRequestRepository.getByAccountRequestId(id);
        if(ObjectUtils.isEmpty(serviceRequests)) {
            return null;
        }
        List<ServiceRequestDTO> serviceRequestDTOS = new ArrayList<>();
        ModelMapper modelMapper = new ModelMapper();
        for (ServiceRequest sr: serviceRequests ) {
            serviceRequestDTOS.add(modelMapper.map(sr, ServiceRequestDTO.class));
        }
        return serviceRequestDTOS;
    }
}
