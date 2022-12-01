package com.api.invoice.invoice.dto;

import lombok.AllArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
public class InvoiceInput
{
    private String title;
    private String description;
    private UUID customerId;
    private float totalAmount;
}
