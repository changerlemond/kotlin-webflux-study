package com.study.webflux

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router

@Configuration
class TestRouter(private val handler: TestHandler) {

    @Bean
    fun test(): RouterFunction<ServerResponse> {
        return router {
            "/hello".nest {
                accept(MediaType.APPLICATION_JSON).nest {
                    GET("/", handler::hello)
                }
            }
        }
    }

}