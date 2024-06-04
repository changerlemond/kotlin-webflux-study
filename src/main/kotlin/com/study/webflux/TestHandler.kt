package com.study.webflux

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono

@Component
class TestHandler {

    fun hello(request: ServerRequest): Mono<ServerResponse> {
        return ServerResponse.ok().bodyValue(TestData("Hello, world!"))
    }

}

data class TestData(val result: String)