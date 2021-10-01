package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {

        //Given
        Invoice invoice = new Invoice("09.10.2021");

        Product milk = new Product("Milk");
        Product ham = new Product("Ham");
        Product bread = new Product("Bread");

        Item itemMilk = new Item(new BigDecimal(5.99),10, new BigDecimal(59.90), milk);
        Item itemHam = new Item(new BigDecimal(10.99), 2, new BigDecimal(21.98), ham);
        Item itemBread = new Item(new BigDecimal(2.50), 3, new BigDecimal(7.50), bread);

        itemBread.setInvoice(invoice);
        itemHam.setInvoice(invoice);
        itemMilk.setInvoice(invoice);

        List<Item> items = new ArrayList<>();
        items.add(itemBread);
        items.add(itemMilk);
        items.add(itemHam);

        invoice.setItems(items);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        int itemSize = invoice.getItems().size();


        //Then
        Assert.assertEquals(invoiceId, 48);
        Assert.assertEquals(3, itemSize);
        Assert.assertEquals(itemSize, 3);

        //CleanUp
        invoiceDao.delete(invoice);
    }
}

