package com.ankur.sampleInstaclient.di.components

import android.app.Application
import com.ankur.sampleInstaclient.MyApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class ApplicationModule(private val application: MyApplication) {


    @Provides
    @Singleton
    fun providesApplication(): Application = application


}