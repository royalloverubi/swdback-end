package com.example.demo.service;

import com.example.demo.service.dto.UserDTO;

public interface UserService {

    UserDTO getByAccountId (Integer accountId);

    UserDTO create(UserDTO userDTO);

    UserDTO update(UserDTO userDTO);

    Boolean delete(Integer id);
}
