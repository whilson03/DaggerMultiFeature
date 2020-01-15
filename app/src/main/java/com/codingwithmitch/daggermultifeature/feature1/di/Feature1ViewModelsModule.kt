package com.codingwithmitch.daggermultifeature.feature1.di

import androidx.lifecycle.ViewModel
import com.codingwithmitch.daggermultifeature.app.di.keys.ViewModelKey
import com.codingwithmitch.daggermultifeature.feature1.ui.Feature1ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class Feature1ViewModelsModule{

    // This is not added to the map ... HELP
    @Binds
    @IntoMap
    @ViewModelKey(Feature1ViewModel::class)
    abstract fun bindFeature1ViewModel(feature1ViewModel: Feature1ViewModel): ViewModel

}