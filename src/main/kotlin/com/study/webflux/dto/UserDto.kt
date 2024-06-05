package com.study.webflux.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.study.webflux.common.ObjectIdSerializer
import org.bson.types.ObjectId

data class UserDto(
    @JsonProperty(value = "id")
    @JsonSerialize(using = ObjectIdSerializer::class)
    val id: ObjectId?,

    @JsonProperty(value = "email")
    val email: String,

    @JsonProperty(value = "nickname")
    val nickname: String,

    @JsonProperty(value = "profile_url")
    val profileUrl: String? = null,
)