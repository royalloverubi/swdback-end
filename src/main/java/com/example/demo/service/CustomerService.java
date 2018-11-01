package com.example.demo.service;

import com.example.demo.service.dto.CustomerDTO;

public interface CustomerService {

    CustomerDTO getByAccountId (Integer accountId);

    CustomerDTO create(CustomerDTO customerDTO);

    CustomerDTO update(CustomerDTO customerDTO);

    Boolean delete(Integer id);
}
