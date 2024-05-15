package com.example.ordenesapi.application.services;

import com.example.ordenesapi.domain.models.Order;
import com.example.ordenesapi.domain.ports.IOrderRepository;

public class DomainOrderServiceImpl implements IOrderService {
    private  final IOrderRepository repository;

    public DomainOrderServiceImpl(IOrderRepository repository) {
        this.repository = repository;
    }

    @Override
    public Order create(Order order) {
        return repository.create(order);
    }

    @Override
    public Iterable<Order> list() {
        return repository.list();
    }

}
