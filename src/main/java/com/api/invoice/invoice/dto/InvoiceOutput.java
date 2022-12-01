package com.api.invoice.invoice.dto;

import com.api.invoice.customer.dto.CustomerDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class InvoiceOutput
{

    private UUID id;
    private String code; // human readable invoice code/number
    private String title;
    private String description;
    private LocalDateTime issuedAt; // ISO date time
    private CustomerDTO customer;
    private float totalAmount;
}
