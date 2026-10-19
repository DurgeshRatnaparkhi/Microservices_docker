package com.eazybytes.account.mapper;

import com.eazybytes.account.dto.CustomerDto;
import com.eazybytes.account.entity.Customer;

public class CustomerMapper {

    // Map Customer entity to CustomerDto
    public static CustomerDto mapToCustomerDto(Customer customer, CustomerDto customerDto) {
        customerDto.setName(customer.getName());
        customerDto.setEmail(customer.getEmail());
        customerDto.setMobileNumber(customer.getMobileNumber());
        return customerDto;
    }
// Map CustomerDto to Customer entity
    public static Customer mapToCustomer(CustomerDto customerDto, Customer customer) {
        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        customer.setMobileNumber(customerDto.getMobileNumber());
        return customer;
    }

    //also we can use ModelMapper library to map the entity to DTO and vice versa. It will reduce the boilerplate code.
}
