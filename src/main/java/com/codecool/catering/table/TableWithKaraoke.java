package com.codecool.catering.table;

import com.codecool.catering.order.OrderItem;

public class TableWithKaraoke extends Table {

    private static final int KARAOKE_BOOKING_BASE_PRICE = 3990;

    @Override
    public void setReserved(boolean reserved) {
        super.setReserved(reserved);
        addNewOrder(new OrderItem("KARAOKE_BOOKING_BASE_PRICE", KARAOKE_BOOKING_BASE_PRICE));
    }
}
