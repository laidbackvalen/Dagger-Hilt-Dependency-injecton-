package com.example.dependencyinjection.dependencyinjection.qualifier

import android.content.Context
import android.util.Log
import android.widget.Toast
import com.example.dependencyinjection.MainActivity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Qualifier


class Test @Inject constructor(
    @FName
    val FName: String,
    @LName
    val LName: String,
    @ApplicationContext  //@ActivityContext is valid to activity where application is valid throughout the Application
    val context: Context,
) {
    fun getNames() {
        Log.d("main", "$FName $LName")

        Toast.makeText(context, "$FName $LName", Toast.LENGTH_SHORT).show()
    }
}

@Module
@InstallIn(SingletonComponent::class)
object Modules {

    @Provides
    @FName
//    fun providesFName() = "Valen"
    fun providesFName() = MainActivity.FName //using Companion Object in MainActivity

    @Provides
    @LName
//    fun providesLName() = "Patel"
    fun providesLName() = MainActivity.LName
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FName

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class LName