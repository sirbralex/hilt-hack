package com.example.feature.puredagger

import com.example.hilthack.library.LibraryManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
internal class PureDaggerFeatureModule {

    @Singleton
    @Provides
    fun libraryManager(): LibraryManager = LibraryManager()

    @Provides
    fun someFeature(someFeature: PureDaggerSomeFeatureImpl): PureDaggerSomeFeature = someFeature
}
