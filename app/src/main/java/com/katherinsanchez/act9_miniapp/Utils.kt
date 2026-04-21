package com.katherinsanchez.act9_miniapp

object Utils {

    fun formatName(name: String): String {
        return if (name.isBlank()) "desconocido" else name
    }

    fun getGreeting(name: String): String {
        return "Hola $name"
    }

}