package com.skogkatt.navigator3.ui.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.skogkatt.navigator.navhost.NavHost
import com.skogkatt.navigator3.ui.demo.keys.Demo1Screen
import com.skogkatt.navigator3.ui.demo.keys.Demo2Screen
import com.skogkatt.navigator3.ui.demo.screen.demo1Screen
import com.skogkatt.navigator3.ui.demo.screen.demo2Screen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavHost(navKey = Demo1Screen) { navigator ->
                demo1Screen(
                    navigateToDemo2 = { navigator.navigateTo(Demo2Screen) }
                )
                demo2Screen(
                    navigateToBack = { navigator.popBackStack() }
                )
            }
        }
    }
}