package com.example.ordenesapi.infraestructure.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "OrdenesProductos")
@NoArgsConstructor
@Data
public class OrdenesProductosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String productoId;
    private Double precio;
    private Double cantidad;
}
