package com.katherinsanchez.act9_miniapp

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DetailScreen(navController: NavController, name: String) {

    var buttonEnabled by remember { mutableStateOf(true) }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(text = "Hola $name")

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                if (buttonEnabled) {
                    buttonEnabled = false
                    navController.navigate(Routes.INFO)
                }
            },
            enabled = buttonEnabled
        ) {
            Text("Ir a Info")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { navController.popBackStack() }
        ) {
            Text("Volver")
        }
    }
}
