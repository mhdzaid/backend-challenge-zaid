package com.api.invoice.invoice.dto;

import lombok.AllArgsConstructor;

import javax.validation.constraints.NotEmpty;

@AllArgsConstructor
public class InvoicePositionInput
{
    @NotEmpty
    private String description;

    @NotEmpty
    private float amount;
}
