package com.api.invoice.invoice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
public class InvoiceInput
{
    @NotEmpty
    private String title;
    private String description;
    @NotEmpty
    private UUID customerId;
    private float totalAmount;

    @Size(min = 1)
    private List<InvoicePositionInput> invoicePositionInputs;
}
