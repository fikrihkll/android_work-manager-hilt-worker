package com.teamdagger.workmanagerhiltworker.di

import com.teamdagger.workmanagerhiltworker.RemoteDataSource
import com.teamdagger.workmanagerhiltworker.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideRepository(remoteDataSource: RemoteDataSource) = Repository(remoteDataSource)

    @Singleton
    @Provides
    fun provideRemoteDataSource() = RemoteDataSource()

}