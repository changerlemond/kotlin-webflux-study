package com.study.webflux.repository

import com.study.webflux.entity.User
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface UserRepository: ReactiveMongoRepository<User, ObjectId>