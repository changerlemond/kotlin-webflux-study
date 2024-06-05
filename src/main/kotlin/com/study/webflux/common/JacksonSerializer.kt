package com.study.webflux.common

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider
import org.bson.types.ObjectId
import java.io.IOException

class ObjectIdSerializer : JsonSerializer<ObjectId>() {
    @Throws(IOException::class)
    override fun serialize(value: ObjectId?, gen: JsonGenerator?, serializers: SerializerProvider?) {
        if (value != null && gen != null) {
            gen.writeString(value.toHexString())
        }
    }
}