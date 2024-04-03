package com.epicode.U5D1.entities;


import lombok.Data;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class Order {
    private int orderNumber;
    private OrderStatus status;
    private int numberOfSeats;
    private LocalDateTime acquisitionTime;
    private List<MenuItem> items;
    private double totalAmount;

    // Costruttori, getter e setter
}