package com.example.demo.service.impl;

import com.example.demo.persistent.entity.ServiceRequest;
import com.example.demo.persistent.repository.*;
import com.example.demo.service.ServiceRequestService;
import com.example.demo.service.dto.ServiceRequestDTO;
import com.example.demo.service.dto.ServiceRequestDetailDTO;
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
    private final RoomRepository roomRepository;
    private final ConfigurationRepository configurationRepository;
    private final CyberGamingRepository cyberGamingRepository;
    private final CustomerRepository customerRepository;

    public ServiceRequestServiceImpl(ServiceRequestRepository serviceRequestRepository, RoomRepository roomRepository, ConfigurationRepository configurationRepository, CyberGamingRepository cyberGamingRepository, CustomerRepository customerRepository) {
        this.serviceRequestRepository = serviceRequestRepository;
        this.roomRepository = roomRepository;
        this.configurationRepository = configurationRepository;
        this.cyberGamingRepository = cyberGamingRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public ServiceRequestDetailDTO getById(Integer id) {
        ServiceRequest serviceRequest = serviceRequestRepository.getByID(id);
        if(ObjectUtils.isEmpty(serviceRequest)) {
            return null;
        }
        return updateDetail(serviceRequest);
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
    public List<ServiceRequestDetailDTO> getByAccountRequestId(Integer id) {
        List<ServiceRequest> serviceRequests = serviceRequestRepository.getByAccountRequestId(id);
        if(ObjectUtils.isEmpty(serviceRequests)) {
            return null;
        }
        List<ServiceRequestDetailDTO> serviceRequestDetailDTOS = new ArrayList<>();
        for (ServiceRequest sr: serviceRequests ) {
            serviceRequestDetailDTOS.add(updateDetail(sr));
        }
        return serviceRequestDetailDTOS;
    }

    private ServiceRequestDetailDTO updateDetail(ServiceRequest serviceRequest) {
        ModelMapper modelMapper = new ModelMapper();
        ServiceRequestDetailDTO dto = modelMapper.map(serviceRequest, ServiceRequestDetailDTO.class);
        dto.setUsername((String) customerRepository.getNameById(serviceRequest.getUserId()));
        dto.setRoomname((String) roomRepository.getNameById(serviceRequest.getRoomId()));
        dto.setCyberGamingName((String) cyberGamingRepository.getNameById(serviceRequest.getCyberGamingId()));
        dto.setConfigurationName((String) configurationRepository.getNameById(serviceRequest.getConfigurationId()));
        return dto;
    }
}
