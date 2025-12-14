package dev.spozap.momentum.database.dao

import androidx.room.Dao
import androidx.room.Insert
import dev.spozap.momentum.database.entity.UserEntity

@Dao
interface UserDao {
    @Insert
    suspend fun insert(user: UserEntity)
}