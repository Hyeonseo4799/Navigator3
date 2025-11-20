package com.skogkatt.navigator3.ui.demo.screen

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import com.skogkatt.navigator3.ui.demo.keys.Demo2Screen

fun EntryProviderScope<NavKey>.demo2Screen(
    navigateToBack: () -> Unit,
) {
    entry<Demo2Screen> {
        Demo2Screen(navigateToBack)
    }
}

@Composable
fun Demo2Screen(navigateToBack: () -> Unit) {}