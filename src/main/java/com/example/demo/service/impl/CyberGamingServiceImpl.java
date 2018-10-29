package com.example.demo.service.impl;

import com.example.demo.persistent.entity.CyberGaming;
import com.example.demo.persistent.repository.CyberGamingRepository;
import com.example.demo.service.CyberGamingService;
import com.example.demo.service.dto.CyberGamingDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.transaction.Transactional;

@Service
@Transactional
public class CyberGamingServiceImpl implements CyberGamingService {

    private final CyberGamingRepository cyberGamingRepository;

    public CyberGamingServiceImpl(CyberGamingRepository cyberGamingRepository) {
        this.cyberGamingRepository = cyberGamingRepository;
    }

    @Override
    public CyberGamingDTO getByAccountId(Integer accountId) {
        CyberGaming cyberGaming = cyberGamingRepository.findByAccountId(accountId);
        if(ObjectUtils.isEmpty(cyberGaming)) {
            return null;
        }
        ModelMapper modelMapper = new ModelMapper();
        CyberGamingDTO cyberGamingDTO = modelMapper.map(cyberGaming, CyberGamingDTO.class);
        return cyberGamingDTO;
    }
}
