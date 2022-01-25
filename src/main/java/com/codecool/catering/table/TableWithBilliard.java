package com.codecool.catering.table;

import com.codecool.catering.order.OrderItem;

public class TableWithBilliard extends Table {

    private static final int BILLIARD_BOOKING_BASE_PRICE = 1900;

    @Override
    public void setReserved(boolean reserved) {
        super.setReserved(reserved);
        addNewOrder(new OrderItem("BILLIARD_BOOKING_BASE_PRICE", BILLIARD_BOOKING_BASE_PRICE));
    }
}
