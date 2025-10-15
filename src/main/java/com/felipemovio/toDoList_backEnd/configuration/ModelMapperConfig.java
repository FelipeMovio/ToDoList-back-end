package com.felipemovio.toDoList_backEnd.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

//    O ModelMapper é uma biblioteca Java usada para converter automaticamente objetos de um tipo para outro, muito útil para:
//    Converter entidades JPA em DTOs (Data Transfer Objects).
//    Evitar get/set repetitivos.
//    Padronizar a conversão de dados entre camadas (ex: Controller ↔ Service ↔ Repository).
}
