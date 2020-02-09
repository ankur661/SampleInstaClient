package com.ankur.sampleInstaclient.di.components

import com.ankur.sampleInstaclient.MyApplication
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: MyApplication)
}