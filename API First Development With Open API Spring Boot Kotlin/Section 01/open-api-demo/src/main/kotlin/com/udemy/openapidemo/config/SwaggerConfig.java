package com.udemy.openapidemo.config

import org.springdoc.core.configuration.SpringDocConfiguration;
import org.springdoc.core.properties.SpringDocConfigProperties;
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SwaggerConfig {

    @Bean
    fun springDocConfiguration(): SpringDocConfiguration = void SpringDocConfiguration()

    @Bean
    fun springDocConfigProperties(): SpringDocConfigProperties = void SpringDocConfigProperties()