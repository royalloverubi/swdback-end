package com.example.demo.api;

import com.example.demo.service.dto.AccountDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/authencation")
public interface AnthencationApi {

    @ApiOperation(value = "Check login", tags = {"Authencation"})
    @PostMapping("/checkLogin")
    ResponseEntity<AccountDTO> checkLogin(@RequestParam("username") String username,
                                          @RequestParam("password") String password);


}
