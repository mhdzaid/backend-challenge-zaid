package com.api.invoice.customer.service;

import com.api.invoice.customer.dto.CustomerDTO;

import java.util.UUID;

public interface CustomerService
{
    public CustomerDTO getCustomerById(UUID customerId);
}
