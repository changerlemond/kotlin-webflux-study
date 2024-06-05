package com.study.webflux.dto

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.Pattern

data class AuthDto(
    @JsonProperty("email")
    var email: String,

    @JsonProperty("nickname")
    @field:Pattern(regexp = "^[A-Za-z0-9._-]{5,30}$")
    var nickname: String,

    @JsonProperty("password")
    @field:Pattern(regexp = "^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[~․!@#$%^&*()_+={};:'<>,.?/|\\-\\[\\]]).{8,30}$")
    val password: String,
)