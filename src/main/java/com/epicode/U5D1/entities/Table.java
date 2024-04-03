package com.epicode.U5D1.entities;

import lombok.Data;

@Data
public class Table {
    private int tableNumber;
    private int maxSeats;
    private TableStatus status;

    // Costruttori, getter e setter
}
