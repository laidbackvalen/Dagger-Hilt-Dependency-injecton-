package com.example.dependencyinjection.dependencyinjection.interfaces

import android.util.Log
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.math.sign

interface Demo2 {
    fun demoTwo()
}

class Demo2Implementation @Inject constructor() : Demo2 {
    override fun demoTwo() {
        Log.d("main", "demoOne is calling...")
    }
}

class MainTwo @Inject constructor(private val demo: Demo2) {
    fun demoTwo() {
        demo.demoTwo()
    }
}

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

@Provides
@Singleton
fun providesDemo2(): Demo2 = Demo2Implementation()

}