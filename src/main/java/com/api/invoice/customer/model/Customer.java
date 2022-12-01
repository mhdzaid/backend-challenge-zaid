package com.api.invoice.customer.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
public class Customer
{
    @Id
    private UUID id;
    private String name;
    private String address;
}
