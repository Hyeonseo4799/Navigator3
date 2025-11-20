package com.skogkatt.navigator.navhost

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.ui.NavDisplay
import com.skogkatt.navigator.navigator.Navigator
import com.skogkatt.navigator.navigator.rememberNavigator

typealias NavGraphBuilder = EntryProviderScope<NavKey>.(Navigator) -> Unit

@Composable
fun NavHost(
    navKey: NavKey,
    navGraph: NavGraphBuilder,
) {
    val navigator = rememberNavigator(navKey)
    NavDisplay(
        backStack = navigator.backStack,
        onBack = navigator::popBackStack,
        entryProvider = entryProvider { navGraph(navigator) }
    )
}