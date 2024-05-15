package com.example.ordenesapi.domain.ports;

import com.example.ordenesapi.domain.models.Order;

public interface IOrderRepository {
    Order create(Order order);
    Iterable<Order> list();
}
