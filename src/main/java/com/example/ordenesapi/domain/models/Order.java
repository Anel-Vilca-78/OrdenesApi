package com.example.ordenesapi.domain.models;

import lombok.Data;

@Data
public class Order {
    private String id;
    private Double total;
    private String fecha;
    private  String status;
}
