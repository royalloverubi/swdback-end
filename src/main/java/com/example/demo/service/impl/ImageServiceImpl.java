package com.example.demo.service.impl;

import com.example.demo.persistent.entity.Image;
import com.example.demo.persistent.repository.ImageRepository;
import com.example.demo.service.ImageService;
import com.example.demo.service.dto.ImageDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ImageServiceImpl implements ImageService {

    private final ImageRepository imageRepository;

    public ImageServiceImpl(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @Override
    public List<ImageDTO> getByCyberId(Integer cyberId) {
        List<Image> image = imageRepository.getByCyberGamingId(cyberId);
        if(ObjectUtils.isEmpty(image)) {
            return null;
        }
        ModelMapper modelMapper = new ModelMapper();
        List<ImageDTO> imageDTOS = new ArrayList<>();
        for (Image img : image ) {
            imageDTOS.add(modelMapper.map(img, ImageDTO.class));
        }
        return imageDTOS;
    }
}
