package com.katherinsanchez.act9_miniapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {

    var name by remember { mutableStateOf("") }
    var buttonEnabled by remember { mutableStateOf(true) }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Image(
            painter = painterResource(R.drawable.saludar),
            contentDescription = "Imagen",
            modifier = Modifier.size(300.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Escribe tu nombre") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                if (buttonEnabled) {
                    buttonEnabled = false

                    val finalName = if (name.isBlank()) "desconocido" else name

                    navController.navigate(Routes.DETAIL + "/$finalName")
                }
            },
            enabled = buttonEnabled,
        ) {
            Text("Ir a Detail")
        }
    }
}
