package com.example.ordenesapi.infraestructure.adapters;

import com.example.ordenesapi.infraestructure.entities.OrdenesProductosEntity;
import org.springframework.data.repository.CrudRepository;

public interface IOrdenesProductosCrudRepositoryMySql extends CrudRepository<OrdenesProductosEntity, String> {
}
