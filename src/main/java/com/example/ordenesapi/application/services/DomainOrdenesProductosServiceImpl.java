package com.example.ordenesapi.application.services;

import com.example.ordenesapi.domain.models.OrdenesProductos;
import com.example.ordenesapi.domain.ports.IOrdenesProductosRepository;

public class DomainOrdenesProductosServiceImpl implements IOrdenesProductosService{
    private final IOrdenesProductosRepository repository;

    public DomainOrdenesProductosServiceImpl(IOrdenesProductosRepository repository) {
        this.repository = repository;
    }

    @Override
    public OrdenesProductos create(OrdenesProductos ordenesproductos) {
        return repository.create(ordenesproductos);
    }



}
