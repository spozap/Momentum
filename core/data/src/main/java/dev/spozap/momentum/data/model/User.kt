package dev.spozap.momentum.data.model

import dev.spozap.momentum.core.model.user.User
import dev.spozap.momentum.database.entity.UserEntity

fun User.toEntity(): UserEntity = UserEntity(
    username = username,
    emailAddress = emailAddress
)