package com.gfalencar.hexagonal.application.ports.out;

import com.gfalencar.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);
}
