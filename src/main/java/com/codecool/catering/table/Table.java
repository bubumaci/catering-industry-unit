package com.codecool.catering.table;

import com.codecool.catering.order.OrderItem;

import java.util.ArrayList;
import java.util.List;

public class Table {

    private final List<OrderItem> orderItemList;
    private boolean isReserved;

    public Table() {
        orderItemList = new ArrayList<>();
        isReserved = false;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public void addNewOrder(OrderItem item) {
        orderItemList.add(item);
    }

    public int payAndCloseTable() {
        int sum = 0;
        for (OrderItem item : orderItemList) {
            sum += item.getPrice();
        }
        orderItemList.clear();
        setReserved(false);
        return sum;
    }

    public String getBillSummary() {
        List<String> billSummary = new ArrayList<>();
        for (OrderItem item : orderItemList) {
            billSummary.add(item.toString());
        }
        return String.join("\n", billSummary);
    }
}
