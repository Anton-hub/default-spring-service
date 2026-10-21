package com.moex.axelix.demo.default_spring_service.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import java.util.UUID;

@Value
@Builder
@Jacksonized
public class CustomerDto {
    UUID id;
    String name;
}