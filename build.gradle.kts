// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
}

//add this for dagger hilt   //classpaths
dependencies {
   // classpath ("com.google.dagger:hilt-android-gradle-plugin:2.40.5")
   (libs.dagger.hilt.android.gradle.plugin)
}
