package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void InvoiceDaoSaveTest() {
        //Given
        Item item = new Item(1, new BigDecimal(1), new BigDecimal(2));
        Item item2 = new Item(1, new BigDecimal(1), new BigDecimal(1));
        Product product=new Product("japko");
        Product product2=new Product("pomidor");
        item.setProduct(product);
        item2.setProduct(product2);
        Invoice invoice=new Invoice("22");
        invoice.getItems().add(item);
        invoice.getItems().add(item2);
        item.setTheInvoice(invoice);
        item2.setTheInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        //invoiceDao.deleteAll();
    }
}
