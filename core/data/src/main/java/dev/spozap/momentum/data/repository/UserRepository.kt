package dev.spozap.momentum.data.repository

import dev.spozap.momentum.core.model.user.User

interface UserRepository {
    suspend fun create(user: User)
}