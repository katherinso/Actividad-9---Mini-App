package com.katherinsanchez.act9_miniapp

import org.junit.Assert.assertEquals
import org.junit.Test

class UtilsTest {

    @Test
    fun testFormatName_blank_returnsDesconocido() {
        val result = Utils.formatName("")
        assertEquals("desconocido", result)
    }

    @Test
    fun testFormatName_validName() {
        val result = Utils.formatName("Katherin")
        assertEquals("Katherin", result)
    }

    @Test
    fun testGreeting() {
        val result = Utils.getGreeting("Ana")
        assertEquals("Hola Ana", result)
    }

}
