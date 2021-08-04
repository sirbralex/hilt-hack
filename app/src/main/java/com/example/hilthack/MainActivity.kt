package com.example.hilthack

import androidx.appcompat.app.AppCompatActivity
import com.example.feature.puredagger.PureDaggerSomeFeature
import com.example.hilthack.feature.hilt.HiltSomeFeature
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity(R.layout.acitivity_main){

    @Inject
    lateinit var pureDaggerSomeFeature: PureDaggerSomeFeature

    // One possible reason to use component-dependency approach
    // Uncomment to get compilation error
    // @Inject
    // lateinit var hiltSomeFeature: HiltSomeFeature
}
