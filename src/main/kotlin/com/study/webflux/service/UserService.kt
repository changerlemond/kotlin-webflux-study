package com.study.webflux.service

import com.study.webflux.dto.AuthDto
import com.study.webflux.dto.UserDto
import com.study.webflux.mapper.UserMapper
import com.study.webflux.repository.UserRepository
import org.bson.types.ObjectId
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class UserService(
    private val userRepository: UserRepository,
    private val userMapper: UserMapper
) {

    fun getUser(userId: ObjectId): Mono<UserDto> {
        return userRepository.findById(userId)
            .map { user -> userMapper.convertToDto(user) }
    }

    fun createUser(authRequestDto: AuthDto): Mono<UserDto> {
        val user = userMapper.toUser(authRequestDto)
        return userRepository.save(user)
            .map { newUser -> userMapper.convertToDto(newUser) }
    }

}