package com.codecool.catering.order;

public class OrderItem {
    private final String name;
    private final int price;

    public OrderItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "OrderItem: " +
                "name='" + name + '\'' +
                " price=" + price;
    }
}
