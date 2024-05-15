package com.example.ordenesapi.infraestructure.rest.mappers;

import com.example.ordenesapi.domain.models.OrdenesProductos;
import com.example.ordenesapi.domain.models.Order;
import com.example.ordenesapi.infraestructure.entities.OrdenesProductosEntity;
import com.example.ordenesapi.infraestructure.entities.OrderEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Optional;

@Mapper(componentModel = "spring")
public interface IOrdenesProductosMappper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "productoId", target = "productoId"),
            @Mapping(source = "precio", target = "precio"),
            @Mapping(source = "cantidad", target = "cantidad")
    }
    )
    OrdenesProductos toOrdenesProductos(OrdenesProductosEntity ordenesProductos);
    Iterable<OrdenesProductos> toOrdenesProductos(Iterable<OrdenesProductosEntity> ordenesProductosEntity);

    @InheritInverseConfiguration
    OrdenesProductosEntity toOrdenesProductosEntity(OrdenesProductos ordenesProductos);

    OrdenesProductos toOrdenesProductos(Optional<OrdenesProductosEntity> ordenesProductos);
}
