package com.example.ordenesapi.infraestructure.configs;

import com.example.ordenesapi.application.services.DomainOrdenesProductosServiceImpl;
import com.example.ordenesapi.application.services.IOrdenesProductosService;
import com.example.ordenesapi.domain.ports.IOrdenesProductosRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class BeanOrdenesProductosConfiguration {
    @Bean
    IOrdenesProductosService ordenesProductosBeanService(final IOrdenesProductosRepository repository){
        return new DomainOrdenesProductosServiceImpl(repository);
    }
}

