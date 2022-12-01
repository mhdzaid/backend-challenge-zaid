package com.api.invoice.customer.dto;

import lombok.Data;

import java.util.UUID;
@Data
public class CustomerDTO
{
    private UUID id;
    private String name;
    private String address;
}
