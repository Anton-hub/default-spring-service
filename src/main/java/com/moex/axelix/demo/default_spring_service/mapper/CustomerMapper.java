package com.moex.axelix.demo.default_spring_service.mapper;

import com.moex.axelix.demo.default_spring_service.dto.CustomerDto;
import com.moex.axelix.demo.default_spring_service.entity.CustomerEntity;
import com.moex.axelix.demo.default_spring_service.model.CustomerModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper {

    CustomerDto toDto(CustomerModel model);

    List<CustomerDto> toDto(List<CustomerModel> models);

    CustomerModel toModel(CustomerEntity entity);

    List<CustomerModel> toModel(List<CustomerEntity> entities);
}
