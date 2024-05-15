package com.example.ordenesapi.infraestructure.rest.mappers;

import com.example.ordenesapi.domain.models.Order;
import com.example.ordenesapi.infraestructure.entities.OrderEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Optional;

@Mapper(componentModel = "spring")
public interface IOrderMappper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "total", target = "total"),
            @Mapping(source = "fecha", target = "fecha"),
            @Mapping(source = "status", target = "status")
    }
    )
    Order toOrder(OrderEntity order);
    Iterable<Order> toOrders(Iterable<OrderEntity> orderEntity);

    @InheritInverseConfiguration
    OrderEntity toOrderEntity(Order order);

    Order toOrder (Optional<OrderEntity> order);
}
