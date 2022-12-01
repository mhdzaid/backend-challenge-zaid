package com.api.invoice.customer.service.impl;

import com.api.invoice.customer.dto.CustomerDTO;
import com.api.invoice.customer.mapper.CustomerMapper;
import com.api.invoice.customer.model.Customer;
import com.api.invoice.customer.repository.CustomerRepository;
import com.api.invoice.customer.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService
{
    private final CustomerRepository customerRepository;

    @Override
    public CustomerDTO getCustomerById(UUID customerId) {
        Customer customer = customerRepository.getCustomerById(customerId);
        CustomerDTO customerDTO = CustomerMapper.customerToCustomerDTO(customer);
        return customerDTO;
    }
}
