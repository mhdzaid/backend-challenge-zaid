package com.api.invoice.invoice.service;

import com.api.invoice.invoice.dto.InvoiceInput;
import com.api.invoice.invoice.dto.InvoiceOutput;
import com.api.invoice.invoice.model.Invoice;

public interface InvoiceService
{
    public InvoiceOutput createInvoice(InvoiceInput request);
}
