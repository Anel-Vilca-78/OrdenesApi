package com.example.ordenesapi.infraestructure.adapters;

import com.example.ordenesapi.domain.models.OrdenesProductos;
import com.example.ordenesapi.domain.ports.IOrdenesProductosRepository;
import com.example.ordenesapi.infraestructure.entities.OrdenesProductosEntity;
import com.example.ordenesapi.infraestructure.rest.mappers.IOrdenesProductosMappper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class OrdenesProductosRepositoryMySql implements IOrdenesProductosRepository {
    private final IOrdenesProductosCrudRepositoryMySql repository;

    @Autowired
    private IOrdenesProductosMappper iOrdenesProductosMappper;

    public OrdenesProductosRepositoryMySql(IOrdenesProductosCrudRepositoryMySql repository) {
        this.repository = repository;
    }

    @Override
    public OrdenesProductos create(OrdenesProductos ordenesproductos) {
        OrdenesProductosEntity ordenesProductosEntity = this.iOrdenesProductosMappper.toOrdenesProductosEntity(ordenesproductos);
        return this.iOrdenesProductosMappper.toOrdenesProductos(this.repository.save(ordenesProductosEntity));
    }

    @Override
    public OrdenesProductos update(OrdenesProductos ordenesProductos) {
        OrdenesProductosEntity ordenesProductosEntity = this.iOrdenesProductosMappper.toOrdenesProductosEntity(ordenesProductos);
        return this.iOrdenesProductosMappper.toOrdenesProductos(this.repository.save(ordenesProductosEntity));
    }

}
