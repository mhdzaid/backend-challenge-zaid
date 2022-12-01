package com.api.invoice.invoice.dto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InvoicePositionInput
{
    private String description;
    private float amount;
}
