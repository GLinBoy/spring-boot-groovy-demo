package com.glinboy.demo.book.config

import org.modelmapper.ModelMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ModelMapperConfig {

    @Bean
    ModelMapper getModelMapper() {
        return new ModelMapper()
    }
}
