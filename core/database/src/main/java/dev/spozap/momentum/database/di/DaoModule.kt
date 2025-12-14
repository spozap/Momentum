package dev.spozap.momentum.database.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.spozap.momentum.database.MomentumDatabase
import dev.spozap.momentum.database.dao.UserDao
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal class DaoModule {
    
    @[Provides Singleton]
    fun providesUserDao(database: MomentumDatabase): UserDao = database.userDao()
}