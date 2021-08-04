package com.example.hilthack.feature.hilt

import com.example.hilthack.library.LibraryManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal class HiltFeatureModule {

    @Singleton
    @Provides
    fun libraryManager(): LibraryManager = LibraryManager()

    @Provides
    fun someFeature(someFeature: HiltSomeFeatureImpl): HiltSomeFeature = someFeature
}
