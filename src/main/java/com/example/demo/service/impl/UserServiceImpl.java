package com.example.demo.service.impl;

import com.example.demo.persistent.entity.User;
import com.example.demo.persistent.repository.UserRepository;
import com.example.demo.service.UserService;
import com.example.demo.service.dto.UserDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO getByAccountId(Integer accountId) {
        User user = userRepository.getByAccountId(accountId);
        if(ObjectUtils.isEmpty(accountId)) {
            return null;
        }
        ModelMapper modelMapper = new ModelMapper();
        return  modelMapper.map(user, UserDTO.class);
    }

    @Override
    public UserDTO create(UserDTO userDTO) {
        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userDTO, User.class);
        user = userRepository.save(user);
        UserDTO dto = modelMapper.map(user, UserDTO.class);
        return dto;
    }

    @Override
    public UserDTO update(UserDTO userDTO) {
        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userDTO, User.class);
        user = userRepository.saveAndFlush(user);
        UserDTO dto = modelMapper.map(user, UserDTO.class);
        return dto;
    }

    @Override
    public Boolean delete(Integer id) {
        Optional.ofNullable(userRepository.findById(id)).orElseThrow(() -> new EntityNotFoundException());
        userRepository.deleteByID(id);
        return true;
    }
}
