package com.skogkatt.navigator.navigator

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.rememberNavBackStack

open class Navigator(val backStack: NavBackStack<NavKey>) {
    fun navigateTo(navKey: NavKey) {
        backStack.add(navKey)
    }

    fun popBackStack(): NavKey? {
        return backStack.removeLastOrNull()
    }
}

@Composable
fun rememberNavigator(navKey: NavKey): Navigator {
    val backStack = rememberNavBackStack(navKey)
    return remember(backStack) { Navigator(backStack) }
}