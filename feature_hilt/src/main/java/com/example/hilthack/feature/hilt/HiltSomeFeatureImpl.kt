package com.example.hilthack.feature.hilt

import com.example.hilthack.library.LibraryManager
import javax.inject.Inject

internal class HiltSomeFeatureImpl @Inject constructor(
    private val libraryManager: LibraryManager
) : HiltSomeFeature {
    override fun someMethod() = Unit
}
