package com.example.ordenesapi.application.services;

import com.example.ordenesapi.domain.models.Order;


public interface IOrderService {
    Order create(Order order);
    Iterable<Order> list();
}
