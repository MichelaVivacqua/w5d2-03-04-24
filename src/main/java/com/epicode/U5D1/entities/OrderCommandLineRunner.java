package com.epicode.U5D1.entities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

@Component
public class OrderCommandLineRunner implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(OrderCommandLineRunner.class);

    private final OrderService orderService;

    public OrderCommandLineRunner(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void run(String... args) throws Exception {
        // Inizializza il menu
        List<MenuItem> items = Arrays.asList(
                new Pizza("Margherita", 7.99, Arrays.asList(Prosciutto, ananas)),
                new Topping("Prosciutto", 4.2),
                new Topping("Ananas", 4.2),
                new Drink("Cola", 2, 4.2)
        );

        // Crea un ordine
        Order order = orderService.createOrder(items, 1, 4); // Ordine al tavolo 1 con 4 coperti

        // Stampa l'ordine
        logger.info("Order details: {}", order);
    }
}
