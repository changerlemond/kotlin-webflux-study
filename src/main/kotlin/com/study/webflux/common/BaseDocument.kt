package com.study.webflux.common

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.time.Instant
import java.time.LocalDateTime

@Document
abstract class BaseDocument {

    @CreatedDate
    @Field(name = "createdDate")
    var createdDate: Instant? = null

    @LastModifiedDate
    @Field(name = "modifiedDate")
    var modifiedDate: Instant? = null

}