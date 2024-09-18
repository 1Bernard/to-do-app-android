package com.example.to_do_app.ui.screens.list

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ListScreen(
    navigateTOTaskScreen: (Int) -> Unit
) {
    Scaffold(
        content = {},
        floatingActionButton = {
            ListFab(navigateTOTaskScreen = navigateTOTaskScreen)
        }
    )
}

@Composable
fun ListFab(
    navigateTOTaskScreen: (Int) -> Unit
) {
    FloatingActionButton(
        onClick = {
            navigateTOTaskScreen(-1)
        }
    ) {
        Icon(
            imageVector = Icons.Filled.Add,
            contentDescription = "Add Button"
        )
    }
}

@Composable
@Preview
private fun ListScreenPreview() {
    ListScreen(navigateTOTaskScreen = {})
}