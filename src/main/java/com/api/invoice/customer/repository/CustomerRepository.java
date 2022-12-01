package com.api.invoice.customer.repository;

import com.api.invoice.customer.dto.CustomerDTO;
import com.api.invoice.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository
{
    public Customer getCustomerById(UUID customerId);
}
