package com.study.webflux.controller

import com.study.webflux.dto.AuthDto
import com.study.webflux.dto.UserDto
import com.study.webflux.service.UserService
import org.bson.types.ObjectId
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import reactor.core.publisher.Mono

@Controller
class UserController(
    private val userService: UserService
) {

    @GetMapping("/user/{id}")
    fun getUser(@PathVariable id: ObjectId): Mono<ResponseEntity<UserDto>> {
        return userService.getUser(id).map { ResponseEntity.ok(it) }
    }

    @PostMapping("/register")
    fun register(@RequestBody authDto: AuthDto): Mono<ResponseEntity<UserDto>> {
        return userService.createUser(authDto).map { ResponseEntity.ok(it) }
    }

}