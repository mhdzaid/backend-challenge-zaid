package com.api.invoice.invoice.controller;

import com.api.invoice.invoice.dto.InvoiceInput;
import com.api.invoice.invoice.dto.InvoiceOutput;
import com.api.invoice.invoice.service.InvoiceService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import javax.xml.ws.Response;

@Slf4j
@RequestMapping("/api/invoice")
@AllArgsConstructor
public class InvoiceController
{

    private final InvoiceService invoiceService;

    @PostMapping
    public ResponseEntity<InvoiceOutput> createInvoice(@RequestBody @Valid InvoiceInput invoiceInput)
    {
        log.info("Creating invoice for customer of id:{}", invoiceInput.getCustomerId());
        InvoiceOutput invoiceOutput = invoiceService.createInvoice(invoiceInput);
        return ResponseEntity.ok(invoiceOutput);
    }

}
