package dev.spozap.momentum.database.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import dev.spozap.momentum.database.DB_NAME
import dev.spozap.momentum.database.MomentumDatabase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal class DatabaseModule {

    @[Provides Singleton]
    fun providesMomentumDatabase(@ApplicationContext context: Context): MomentumDatabase {
        return Room.databaseBuilder(
            context = context,
            klass = MomentumDatabase::class.java,
            name = DB_NAME
        ).build()
    }

}