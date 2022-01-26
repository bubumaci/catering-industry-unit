package com.codecool;

import com.codecool.catering.order.OrderItem;
import com.codecool.catering.pub.Pub;
import com.codecool.catering.table.Table;
import com.codecool.catering.table.TableWithBilliard;
import com.codecool.catering.table.TableWithKaraoke;
import com.codecool.catering.table.TableWithViolinPlayers;

public class Main {

    public static void main(String[] args) {
        createPub();
    }

    public static void createPub() {
        Pub hardRockCafe = new Pub();

        Table table1 = new Table();
        TableWithViolinPlayers tableViolin1 = new TableWithViolinPlayers();
        TableWithBilliard billiard1 = new TableWithBilliard();
        TableWithKaraoke tableWithKaraoke1 = new TableWithKaraoke();

        hardRockCafe.addTable(tableViolin1);
        hardRockCafe.addTable(table1);
        hardRockCafe.addTable(billiard1);
        hardRockCafe.addTable(tableWithKaraoke1);

        hardRockCafe.reserveTable(billiard1);
        hardRockCafe.reserveTable(table1);
        hardRockCafe.reserveTable(tableViolin1);
        hardRockCafe.reserveTable(tableWithKaraoke1);

        table1.addNewOrder(new OrderItem("Burger", 590));
        table1.addNewOrder(new OrderItem("Ice tea", 290));
        hardRockCafe.closeBillOnTable(table1);

        tableViolin1.addNewOrder(new OrderItem("Burger", 590));

        hardRockCafe.closeBillOnTable(billiard1);
        hardRockCafe.closeBillOnTable(tableViolin1);
    }
}
