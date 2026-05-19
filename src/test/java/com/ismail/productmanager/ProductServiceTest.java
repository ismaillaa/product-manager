package com.ismail.productmanager;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductServiceTest {

    @Test
    public void testAddProduct() {
        ProductService service = new ProductService();
        service.addProduct(new Product("Laptop", 1000.0, 2));
        assertEquals(1, service.getProductCount());
    }

    @Test
    public void testTotalInventoryValue() {
        ProductService service = new ProductService();
        service.addProduct(new Product("Laptop", 1000.0, 2));
        service.addProduct(new Product("Mouse", 25.0, 10));
        // 1000 * 2 + 25 * 10 = 2250
        assertEquals(2250.0, service.getTotalInventoryValue(), 0.01);
    }

    @Test
    public void testEmptyInventory() {
        ProductService service = new ProductService();
        assertEquals(0.0, service.getTotalInventoryValue(), 0.01);
        assertEquals(0, service.getProductCount());
    }

    @Test
    public void testAddNullProductThrowsException() {
        ProductService service = new ProductService();
        assertThrows(IllegalArgumentException.class, () -> service.addProduct(null));
    }

    @Test
    public void testProductTotalValue() {
        Product p = new Product("Keyboard", 50.0, 3);
        assertEquals(150.0, p.getTotalValue(), 0.01);
    }
}
