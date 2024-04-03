package com.epicode.U5D1.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.awt.*;

@Service
public class OrderService {

    @Value("${cover.cost}")
    private double coverCost;

    public Order createOrder(List<MenuItem> items, int tableNumber, int numberOfSeats) {
        Order order = new Order();
        order.setOrderNumber(/* generare un numero di ordine univoco */);
        order.setStatus(OrderStatus.IN_PROGRESS);
        order.setNumberOfSeats(numberOfSeats);
        order.setAcquisitionTime(LocalDateTime.now());
        order.setItems(items);

        double totalCost = items.stream().mapToDouble(MenuItem::getPrice).sum();
        totalCost += coverCost * numberOfSeats;
        order.setTotalAmount(totalCost);

        return order;
    }
}

