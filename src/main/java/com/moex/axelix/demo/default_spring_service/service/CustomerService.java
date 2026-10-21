package com.moex.axelix.demo.default_spring_service.service;

import com.moex.axelix.demo.default_spring_service.entity.CustomerEntity;
import com.moex.axelix.demo.default_spring_service.mapper.CustomerMapper;
import com.moex.axelix.demo.default_spring_service.model.CustomerModel;
import com.moex.axelix.demo.default_spring_service.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerService {

    CustomerMapper mapper;
    CustomerRepository repository;

    public CustomerModel addCustomer(String name) {
        return mapper.toModel(
                repository.save(new CustomerEntity().setName(name))
        );
    }

    public List<CustomerModel> getAll() {
        return mapper.toModel(
                repository.findAll()
        );
    }
}
