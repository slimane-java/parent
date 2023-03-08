package com.example.demoServer1.service;

import com.example.demoServer1.entity.Invoice;
import org.springframework.batch.item.ItemProcessor;

public class InvoiceProcessor implements ItemProcessor<Invoice, Invoice> {
    @Override
    public Invoice process(final Invoice invoice) throws Exception {
        System.out.println("invoice invoice invoice " + invoice.toString());
        return null;
    }
}
