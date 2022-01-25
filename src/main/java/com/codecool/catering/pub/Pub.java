package com.codecool.catering.pub;

import com.codecool.catering.table.Table;

import java.util.ArrayList;
import java.util.List;

public class Pub {

    List<Table> tableList;

    Long profit;

    public Pub() {
        tableList = new ArrayList<>();
        profit = 0L;
    }

    public void addTable(Table newTable) {
        tableList.add(newTable);
    }

    public void closeBillOnTable(Table table) {
        String summary = table.getBillSummary();
        System.out.println(summary);
        System.out.println("TABLE CLOSED\n-----------------------");
        int incomingAmount = table.payAndCloseTable();
        profit += incomingAmount;
        System.out.println("Current profit balance: " + profit + "\n-----------------------");
    }

    public boolean reserveTable(Table table) {
        if (table.isReserved()) {
            System.out.println(table.getClass().getSimpleName() + " unavailable!");
            return false;
        } else {
            table.setReserved(true);
            System.out.println(table.getClass().getSimpleName() + " booked!");
            return true;
        }
    }
}
