package com.api.invoice.customer.repository.impl;

import com.api.invoice.customer.model.Customer;
import com.api.invoice.customer.repository.CustomerRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CustomerRepositoryImpl implements CustomerRepository
{

    @Override
    public Customer getCustomerById(UUID customerId)
    {
        Customer customer = new Customer();
        customer.setId(customerId);
        customer.setName("Andrew");
        customer.setAddress("Middle of nowhwere");
        return customer;
    }
}
