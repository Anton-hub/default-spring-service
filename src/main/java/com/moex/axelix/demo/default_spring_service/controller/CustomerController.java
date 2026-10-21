package com.moex.axelix.demo.default_spring_service.controller;

import com.moex.axelix.demo.default_spring_service.dto.CustomerDto;
import com.moex.axelix.demo.default_spring_service.mapper.CustomerMapper;
import com.moex.axelix.demo.default_spring_service.service.CustomerService;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    CustomerService service;
    CustomerMapper mapper;

    @GetMapping()
    public List<CustomerDto> getAll() {
        return mapper.toDto(
                service.getAll()
        );
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerDto create(@NotEmpty @RequestParam("name") String name) {
        return mapper.toDto(service.addCustomer(name));
    }
}
