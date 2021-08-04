package com.example.feature.puredagger

import com.example.hilthack.library.LibraryManager
import javax.inject.Inject

internal class PureDaggerSomeFeatureImpl @Inject constructor(
    private val libraryManager: LibraryManager
) : PureDaggerSomeFeature {
    override fun someMethod() = Unit
}
