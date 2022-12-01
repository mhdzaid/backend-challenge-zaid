package com.api.invoice.invoice.service.impl;

import com.api.invoice.customer.dto.CustomerDTO;
import com.api.invoice.customer.service.CustomerService;
import com.api.invoice.invoice.dto.InvoiceInput;
import com.api.invoice.invoice.dto.InvoiceOutput;
import com.api.invoice.invoice.mapper.InvoiceMapper;
import com.api.invoice.invoice.model.Invoice;
import com.api.invoice.invoice.repository.InvoiceRepository;
import com.api.invoice.invoice.service.InvoiceService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class InvoiceServiceImpl implements InvoiceService
{

    private final InvoiceRepository invoiceRepository;

    private final CustomerService customerService;

    @Override
    public InvoiceOutput createInvoice(InvoiceInput request)
    {
        Invoice invoiceInput = InvoiceMapper.invoiceOutPutToInvoice(request);
        invoiceInput.setCode(createCode());
        Invoice invoice = invoiceRepository.save(invoiceInput);
        CustomerDTO customerDTO = customerService.getCustomerById(request.getCustomerId());
        InvoiceOutput invoiceOutput = InvoiceMapper.invoiceToInvoiceOutPut(invoice, customerDTO);
        return invoiceOutput;
    }

    private String createCode()
    {
        return UUID.randomUUID().toString();
    }
}
