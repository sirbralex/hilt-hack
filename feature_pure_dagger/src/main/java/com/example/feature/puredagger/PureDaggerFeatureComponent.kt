package com.example.feature.puredagger

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [PureDaggerFeatureModule::class])
interface PureDaggerFeatureComponent {
    fun someFeature(): PureDaggerSomeFeature
}
