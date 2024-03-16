package com.example.dependencyinjection.dependencyinjection.interfaces

import android.util.Log
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

interface DemoOne {
    fun demoOne()
}

class Demoimplementation @Inject constructor() : DemoOne {
    override fun demoOne() {
        Log.d("main", "demoOne is calling...")
    }
}

class MainOne @Inject constructor(private val demoOne: DemoOne) {
    fun demoOne() {
        demoOne.demoOne()
    }
}


//Here's a brief overview of how @Module works in Dagger Hilt:
//Annotation: @Module is part of the Dagger framework and is used to annotate classes that provide dependencies.

//Module Class: A class annotated with @Module typically contains one or more methods annotated with @Provides.
// These methods define how to create instances of specific types.

//Provides Methods:
// Methods annotated with @Provides inside a @Module class are responsible for providing instances of classes or interfaces.
// These methods specify how to construct or obtain these instances.


@Module  //for interface we make module to create instances
@InstallIn(SingletonComponent::class) //it lets you use this anywhere
abstract class Appmodule2 {
    @Binds //annotations to specify how instances of interfaces or abstract classes should be provided.
    @Singleton  //one objects can be use everywhere
    abstract fun providesOne(demoimplementation: Demoimplementation): DemoOne
}
