package com.moex.axelix.demo.default_spring_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.UUID;

@Data
@Accessors(chain = true)
@Entity
public class CustomerEntity {
    @Id
    @GeneratedValue
    UUID id;

    String name;
}
