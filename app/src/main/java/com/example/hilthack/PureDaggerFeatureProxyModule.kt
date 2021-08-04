package com.example.hilthack

import com.example.feature.puredagger.DaggerPureDaggerFeatureComponent
import com.example.feature.puredagger.PureDaggerFeatureComponent
import com.example.feature.puredagger.PureDaggerSomeFeature
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Hack to integrate external dagger component like as component-dependency.
 */
@Module
@InstallIn(SingletonComponent::class)
internal class PureDaggerFeatureProxyModule {

    // Pass as method args any dependencies from :app you need to build component
    @Singleton
    @Provides
    fun pureDaggerFeatureComponent(): PureDaggerFeatureComponent {
        return DaggerPureDaggerFeatureComponent.builder().build()
    }

    // Use someFeature in Hilt
    @Provides
    fun someFeature(pureDaggerFeatureComponent: PureDaggerFeatureComponent): PureDaggerSomeFeature {
        return pureDaggerFeatureComponent.someFeature()
    }
}
