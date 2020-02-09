package com.ankur.sampleInstaclient

import android.app.Application
import com.ankur.sampleInstaclient.di.components.ApplicationComponent
import com.ankur.sampleInstaclient.di.components.ApplicationModule
import com.ankur.sampleInstaclient.di.components.DaggerApplicationComponent

class MyApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    private fun injectDependencies() {
        applicationComponent = DaggerApplicationComponent.builder()
            .applicationModule(ApplicationModule(this))
            .build()

        applicationComponent.inject(this)
    }

    // Needed to replace the component with a test specific one
    fun setComponent(applicationComponent: ApplicationComponent) {
        this.applicationComponent = applicationComponent
    }
}