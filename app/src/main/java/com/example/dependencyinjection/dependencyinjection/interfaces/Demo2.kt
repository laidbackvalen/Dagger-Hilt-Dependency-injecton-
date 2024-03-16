package com.example.dependencyinjection.dependencyinjection.interfaces

import android.util.Log
import dagger.Module
import javax.inject.Inject

interface Demo2 {
    fun demoTwo()
}

class Demo2Implementation @Inject constructor() : Demo2 {
    override fun demoTwo() {
        Log.d("main", "demoOne is calling...")
    }
}

class MainTwo @Inject constructor(private val demo: Demo2) {
    fun mainTwo() {
        demo.demoTwo()
    }
}

@Module
object AppModule{
    
}