package com.gfalencar.hexagonal.adapters.out.client.mapper;

import com.gfalencar.hexagonal.adapters.out.client.response.AddressResponse;
import com.gfalencar.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
