package com.fakhrullina.shopdatabase.controllers;

import com.fakhrullina.shopdatabase.entity.Orders;
import com.fakhrullina.shopdatabase.interfaces.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrdersController {

    @Autowired
    private OrdersRepository ordersRepository;

    @GetMapping("/Orders")
    public List<Orders> retrieveAllOrders() {
        return ordersRepository.findAll();
    }

}
