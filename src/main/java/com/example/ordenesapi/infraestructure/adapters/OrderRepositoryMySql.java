package com.example.ordenesapi.infraestructure.adapters;

import com.example.ordenesapi.domain.models.Order;
import com.example.ordenesapi.domain.ports.IOrderRepository;
import com.example.ordenesapi.infraestructure.entities.OrderEntity;
import com.example.ordenesapi.infraestructure.rest.mappers.IOrderMappper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class OrderRepositoryMySql implements IOrderRepository {
    private final IOrderCrudRepositoryMySql repository;

    @Autowired
    private IOrderMappper IOrderMappper;

    public OrderRepositoryMySql(IOrderCrudRepositoryMySql repository) {
        this.repository = repository;
    }


    @Override
    public Order create(Order order) {
        OrderEntity orderEntity = this.IOrderMappper.toOrderEntity(order);
        return this.IOrderMappper.toOrder(this.repository.save(orderEntity));
    }

    @Override
    public Iterable<Order> list() {
        return this.IOrderMappper.toOrders(this.repository.findAll());
    }


}
