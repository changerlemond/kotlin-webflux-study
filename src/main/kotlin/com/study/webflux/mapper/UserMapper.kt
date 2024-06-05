package com.study.webflux.mapper

import com.study.webflux.dto.AuthDto
import com.study.webflux.dto.UserDto
import com.study.webflux.entity.User
import org.mapstruct.InheritInverseConfiguration
import org.mapstruct.Mapper
import org.mapstruct.NullValuePropertyMappingStrategy
import org.mapstruct.ReportingPolicy

@Mapper(
    componentModel = "spring",
    unmappedTargetPolicy = ReportingPolicy.IGNORE,
    nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
)
interface UserMapper {
    fun convertToDto(user: User) : UserDto

    @InheritInverseConfiguration
    fun convertToEntity(dto: UserDto) : User

    fun toUser(dto: AuthDto) : User
}