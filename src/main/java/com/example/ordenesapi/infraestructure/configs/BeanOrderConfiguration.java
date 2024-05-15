package com.example.ordenesapi.infraestructure.configs;

import com.example.ordenesapi.application.services.DomainOrderServiceImpl;
import com.example.ordenesapi.application.services.IOrderService;
import com.example.ordenesapi.domain.ports.IOrderRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanOrderConfiguration {
    @Bean
    IOrderService orderBeanService(final IOrderRepository repository){
        return new DomainOrderServiceImpl(repository);
    }
}
