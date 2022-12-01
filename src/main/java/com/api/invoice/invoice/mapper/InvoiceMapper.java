package com.api.invoice.invoice.mapper;

import com.api.invoice.customer.dto.CustomerDTO;
import com.api.invoice.invoice.dto.InvoiceInput;
import com.api.invoice.invoice.dto.InvoiceOutput;
import com.api.invoice.invoice.model.Invoice;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

public class InvoiceMapper
{
    public static Invoice invoiceOutPutToInvoice(InvoiceInput invoiceInput)
    {
        Invoice invoice = new Invoice();
        invoice.setTitle(invoiceInput.getTitle());
        invoice.setDescription(invoiceInput.getDescription());
        invoice.setIssuedAt(LocalDateTime.now());
        invoice.setCustomerId(invoice.getCustomerId());
        invoice.setTotalAmount(invoice.getTotalAmount());
        return invoice;
    }

    public static InvoiceOutput invoiceToInvoiceOutPut(Invoice invoice, CustomerDTO customer)
    {
        InvoiceOutput invoiceOutput = new InvoiceOutput();
        invoiceOutput.setId(invoice.getId());
        invoiceOutput.setCode(invoice.getCode());
        invoiceOutput.setTitle(invoiceOutput.getTitle());
        invoiceOutput.setDescription(invoiceOutput.getDescription());
        invoiceOutput.setIssuedAt(invoice.getIssuedAt());
        invoiceOutput.setCustomer(customer);
        invoiceOutput.setTotalAmount(invoice.getTotalAmount());
        return invoiceOutput;
    }
}
