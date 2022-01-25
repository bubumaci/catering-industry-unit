package com.codecool;

import com.codecool.catering.order.OrderItem;
import com.codecool.catering.pub.Pub;
import com.codecool.catering.table.Table;
import com.codecool.catering.table.TableWithBilliard;

public class Main {

    public static void main(String[] args) {
        createPub();
    }

    public static void createPub() {
        Pub hardRockCafe = new Pub();
        Table table1 = new Table();
        TableWithBilliard billiard1 = new TableWithBilliard();
        hardRockCafe.addTable(table1);
        hardRockCafe.reserveTable(billiard1);
        hardRockCafe.reserveTable(table1);
        table1.addNewOrder(new OrderItem("Burger", 590));
        table1.addNewOrder(new OrderItem("Ice tea", 290));
        hardRockCafe.closeBillOnTable(table1);
        hardRockCafe.closeBillOnTable(billiard1);
    }
}
