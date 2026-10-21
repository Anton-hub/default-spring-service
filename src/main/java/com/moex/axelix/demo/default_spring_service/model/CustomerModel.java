package com.moex.axelix.demo.default_spring_service.model;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class CustomerModel {
    UUID id;
    String name;
}
