package dev.spozap.momentum.database

import androidx.room.Database
import androidx.room.RoomDatabase
import dev.spozap.momentum.database.dao.UserDao
import dev.spozap.momentum.database.entity.UserEntity

private const val DB_VERSION = 1
const val DB_NAME = "momentum_db"

@Database(version = DB_VERSION, entities = [UserEntity::class], exportSchema = true)
internal abstract class MomentumDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}