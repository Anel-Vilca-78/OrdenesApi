package com.example.ordenesapi.domain.ports;

import com.example.ordenesapi.domain.models.OrdenesProductos;

public interface IOrdenesProductosRepository {
    OrdenesProductos create(OrdenesProductos ordenesproductos);

}
