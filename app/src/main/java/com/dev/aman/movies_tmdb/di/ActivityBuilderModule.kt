package com.dev.aman.movies_tmdb.di

import com.dev.aman.movies_tmdb.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector
    abstract fun mainActivityProvider() : MainActivity

}