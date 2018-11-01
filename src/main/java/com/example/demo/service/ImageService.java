package com.example.demo.service;

import com.example.demo.service.dto.ImageDTO;

import java.util.List;

public interface ImageService {

    List<ImageDTO> getByCyberId(Integer cyberId);
}
