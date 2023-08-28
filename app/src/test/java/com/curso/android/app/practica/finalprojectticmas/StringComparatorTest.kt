package com.curso.android.app.practica.finalprojectticmas

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class StringComparatorTest {
    @Test
    fun testEqualStrings() {
        val comparator = StringComparator("hello", "hello")
        assertEquals("Las cadenas de texto son iguales", comparator.result)
    }

    @Test
    fun testDifferentStrings() {
        val comparator = StringComparator("hello", "world")
        assertEquals("Las cadenas de texto son diferentes", comparator.result)
    }
}