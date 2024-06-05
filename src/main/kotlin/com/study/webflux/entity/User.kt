package com.study.webflux.entity

import com.study.webflux.common.BaseDocument
import jakarta.persistence.Id
import org.bson.types.ObjectId
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.time.Instant

@Document(collection = "users")
class User: BaseDocument() {

    @Id
    @Field("_id")
    var id: ObjectId? = null

    @Field("status")
    var status: String? = ""

    @Field("role")
    var role: String? = ""

    @Field("email")
    var email: String = "";

    @Field("nickname")
    var nickname: String = "";

    @Field("password")
    var password: String = "";

    @Field("profile_url")
    var profileUrl: String? = ""

    @Field("first_login_datetime")
    var firstLoginDatetime: Instant = Instant.now()

    @Field("last_login_datetime")
    var lastLoginDatetime: Instant? = null

}