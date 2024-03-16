package com.example.dependencyinjection.dependencyinjection

import android.util.Log
import javax.inject.Inject

class Computer @Inject constructor(val ram: Ram, val hardisk: Hardisk) {
    //inject creates object of Computer Class //this means val computer = Computer()  //creates object
    fun getComputer() {
        ram.getRam()
        hardisk.getHardisk()
        Log.d("main", "getComputer: ")
    }
}

class Ram @Inject constructor() { //this means val ram = Ram()  //creates object
    fun getRam() {
        Log.d("main", "getComputer: ")
    }
}

class Hardisk @Inject constructor() {
    fun getHardisk() {
        Log.d("main", "getComputer: ")
    }
}