package com.example.ordenesapi.infraestructure.rest.controllers;

import com.example.ordenesapi.application.services.IOrderService;
import com.example.ordenesapi.domain.models.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orden")
@Slf4j
public class OrderController {
    private final IOrderService service;

    public OrderController(IOrderService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Order> create(@RequestBody Order order){
        return new ResponseEntity<>(service.create(order), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Iterable<Order>> list(){
        return new ResponseEntity<>(service.list(), HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Order> update(@RequestBody Order order, @PathVariable String id){
        return new ResponseEntity<>(service.update(order, id), HttpStatus.OK);
    }
}
