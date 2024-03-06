package com.gfalencar.hexagonal.application.ports.out;

import com.gfalencar.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
