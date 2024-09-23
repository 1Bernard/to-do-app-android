package com.example.to_do_app.ui.screens.list

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.to_do_app.R

@Composable
fun ListScreen(
    navigateTOTaskScreen: (Int) -> Unit
) {
    Scaffold(
        topBar = {
            ListAppBar()
        },
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
        containerColor = Color.Blue,
        contentColor = Color.Blue,
        shape = MaterialTheme.shapes.medium,

        onClick = {
            navigateTOTaskScreen(-1)
        }
    ) {
        Icon(
            imageVector = Icons.Filled.Add,
            contentDescription = stringResource(id = R.string.add_button),
            tint = Color.White
        )
    }
}

@Composable
@Preview
private fun ListScreenPreview() {
    ListScreen(navigateTOTaskScreen = {})
}