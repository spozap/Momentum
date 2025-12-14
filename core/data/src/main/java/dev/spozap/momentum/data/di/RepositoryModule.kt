package dev.spozap.momentum.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.spozap.momentum.data.repository.UserRepository
import dev.spozap.momentum.data.repository.UserRepositoryImpl

@InstallIn(SingletonComponent::class)
@Module
internal abstract class RepositoryModule {
    @Binds
    internal abstract fun bindsUserRepository(repositoryImpl: UserRepositoryImpl): UserRepository
}