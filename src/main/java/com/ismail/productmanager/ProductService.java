package com.ismail.productmanager;

import java.util.ArrayList;
import java.util.List;

/**
 * Service de gestion d'un inventaire de produits.
 */
public class ProductService {

    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("Product cannot be null");
        }
        products.add(product);
    }

    public int getProductCount() {
        return products.size();
    }

    public double getTotalInventoryValue() {
        double total = 0;
        for (Product p : products) {
            total += p.getTotalValue();
        }
        return total;
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }
}
