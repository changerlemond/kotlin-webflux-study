package com.study.webflux.config

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

// mapper package scan and register

@Configuration
@ComponentScan(basePackages = ["com.study.webflux.mapper"])
class MapperConfig