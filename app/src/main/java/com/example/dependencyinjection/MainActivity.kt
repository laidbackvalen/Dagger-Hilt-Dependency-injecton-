package com.example.dependencyinjection

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dependencyinjection.dependencyinjection.Computer
import com.example.dependencyinjection.dependencyinjection.interfaces.MainOne
import com.example.dependencyinjection.dependencyinjection.interfaces.MainTwo
import com.example.dependencyinjection.dependencyinjection.qualifier.Test
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var computer: Computer

    @Inject
    lateinit var mainOne: MainOne

    @Inject
    lateinit var mainTwo: MainTwo

    @Inject
    lateinit var test: Test

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        computer.getComputer()

        mainOne.demoOne()

        mainTwo.demoTwo()

        test.getNames()
    }

    companion object{
        val FName = "Valen"
        val LName = "Patel"
    }
}