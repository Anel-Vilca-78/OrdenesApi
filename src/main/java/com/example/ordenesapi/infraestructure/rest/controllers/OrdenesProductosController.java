package com.example.ordenesapi.infraestructure.rest.controllers;

import com.example.ordenesapi.application.services.IOrdenesProductosService;
import com.example.ordenesapi.domain.models.OrdenesProductos;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ordenesProductos")
@Slf4j
public class OrdenesProductosController {
    private final IOrdenesProductosService service;

    public OrdenesProductosController(IOrdenesProductosService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<OrdenesProductos> create(@RequestBody OrdenesProductos ordenesProductos){
        return new ResponseEntity<>(service.create(ordenesProductos), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<OrdenesProductos> update(@RequestBody OrdenesProductos ordenesProductos){
        return new ResponseEntity<>(service.update(ordenesProductos), HttpStatus.OK);
    }

}
