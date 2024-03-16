package com.example.dependencyinjection.dependencyinjection

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.internal.modules.ApplicationContextModule

@HiltAndroidApp
class BaseApp : Application() {
//the dependency i'll provide will be store here in base app
    //this is a parent application which will keep all dependency here
    //for ex - val computer = Computer() is passed to this Base App

}

