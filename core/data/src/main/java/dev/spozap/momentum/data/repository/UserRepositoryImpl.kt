package dev.spozap.momentum.data.repository

import dev.spozap.momentum.core.model.user.User
import dev.spozap.momentum.data.model.toEntity
import dev.spozap.momentum.database.dao.UserDao
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val userDao: UserDao
) : UserRepository {
    override suspend fun create(user: User) {
        val entity = user.toEntity()
        userDao.insert(entity)
    }
}