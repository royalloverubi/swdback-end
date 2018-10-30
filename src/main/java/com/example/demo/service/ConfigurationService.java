package com.example.demo.service;

import com.example.demo.service.dto.ConfigurationDTO;
import io.swagger.models.auth.In;

import java.util.List;

public interface ConfigurationService {

    List<ConfigurationDTO> getByCyberId(Integer cyberId);

    ConfigurationDTO create(ConfigurationDTO configurationDTO);

    ConfigurationDTO update(ConfigurationDTO configurationDTO);

    Boolean delete(Integer id);

    ConfigurationDTO getById(Integer id);
}
