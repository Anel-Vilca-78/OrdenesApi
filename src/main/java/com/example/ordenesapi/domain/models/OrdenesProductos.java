package com.example.ordenesapi.domain.models;

import lombok.Data;

@Data
public class OrdenesProductos {
    private String id;
    private String productoId;
    private Double precio;
    private Double cantidad;
}
