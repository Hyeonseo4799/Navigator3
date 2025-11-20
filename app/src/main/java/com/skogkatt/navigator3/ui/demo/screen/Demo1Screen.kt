package com.skogkatt.navigator3.ui.demo.screen

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import com.skogkatt.navigator3.ui.demo.keys.Demo1Screen

fun EntryProviderScope<NavKey>.demo1Screen(
    navigateToDemo2: () -> Unit
) {
    entry<Demo1Screen> {
        Demo1Screen(navigateToDemo2 = navigateToDemo2)
    }
}

@Composable
fun Demo1Screen(navigateToDemo2: () -> Unit) {}