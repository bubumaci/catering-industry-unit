package com.codecool.catering.pub;

import com.codecool.catering.table.Table;

import java.util.ArrayList;
import java.util.List;

public class Pub {

    private final List<Table> tableList;
    private Long profit;

    public Pub() {
        this.tableList = new ArrayList<>();
        this.profit = 0L;
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
        if (table.isLoudTypeOfTable()) {
            System.out.println("Loud table types can be reserved again.");
        }
    }

    public boolean reserveTable(Table table) {
        if (table.isReserved()) {
            System.out.println(table.getClass().getSimpleName() + " unavailable!");
            return false;
        } else if (isLoudTableReserved() && table.isLoudTypeOfTable()) {
            System.out.println(table.getClass().getSimpleName() + " unavailable! Another loud table is already reserved.");
            return false;
        } else {
            handleReservingTable(table);
            return true;
        }
    }

    private void handleReservingTable(Table table) {
        table.setReserved(true);
        System.out.println(table.getClass().getSimpleName() + " booked!");
        if (table.isLoudTypeOfTable()) {
            System.out.println("No more loud table types can be reserved for a while now.");
        }
    }

    public boolean isLoudTableReserved() {
        return this.tableList.stream().filter(Table::isReserved).anyMatch(Table::isLoudTypeOfTable);
    }
}
