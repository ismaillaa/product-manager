package com.ismail.productmanager;

/**
 * Représente un produit avec un nom, un prix unitaire et une quantité en stock.
 */
public class Product {

    private final String name;
    private final double price;
    private final int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    /**
     * Calcule la valeur totale de ce produit en stock.
     */
    public double getTotalValue() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return name + " (x" + quantity + ") - " + price + " MAD";
    }
}
