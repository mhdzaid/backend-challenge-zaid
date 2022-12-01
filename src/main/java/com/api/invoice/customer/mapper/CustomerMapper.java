package com.api.invoice.customer.mapper;

import com.api.invoice.customer.dto.CustomerDTO;
import com.api.invoice.customer.model.Customer;

public class CustomerMapper
{
    public static CustomerDTO customerToCustomerDTO(Customer customer)
    {
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setName(customer.getName());
        customerDTO.setId(customer.getId());
        customerDTO.setAddress(customer.getAddress());
        return customerDTO;
    }
}
