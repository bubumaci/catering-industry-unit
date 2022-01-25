package com.codecool.catering.table;

import com.codecool.catering.order.OrderItem;

public class TableWithViolinPlayers extends Table {

    private static final int LIVE_MUSIC_BOOKING_BASE_PRICE = 4299;

    @Override
    public void setReserved(boolean reserved) {
        super.setReserved(reserved);
        addNewOrder(new OrderItem("LIVE_MUSIC_BOOKING_BASE_PRICE", LIVE_MUSIC_BOOKING_BASE_PRICE));
    }
}
