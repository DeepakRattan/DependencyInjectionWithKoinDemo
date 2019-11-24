package com.example.dependencyinjectionwithkoindemo

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

// Start Koin

/*  So far we have our modules, let’s start it with Koin.
    Open your application class, or make one (don’t forget to declare it in your manifest.xml).
    Just call the startKoin() function that take a lambda in which we define a list of
    module using modules(module: List<Module>)function

    Now Koin knows about our dependencies
    */
class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApp)
            modules(listOf(appModule))
        }
    }

}