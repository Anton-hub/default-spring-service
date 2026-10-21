package com.moex.axelix.demo.default_spring_service.repository;

import com.moex.axelix.demo.default_spring_service.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<CustomerEntity, UUID> { }
