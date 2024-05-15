package com.example.ordenesapi.infraestructure.adapters;

import com.example.ordenesapi.infraestructure.entities.OrderEntity;
import org.springframework.data.repository.CrudRepository;

public interface IOrderCrudRepositoryMySql extends CrudRepository<OrderEntity, String> {
}
