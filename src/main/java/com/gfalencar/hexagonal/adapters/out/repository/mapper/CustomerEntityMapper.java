package com.gfalencar.hexagonal.adapters.out.repository.mapper;

import com.gfalencar.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.gfalencar.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);
}
