package com.example.mytestcoverageapp

import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(MockitoJUnitRunner::class)
class ExampleUnitTest {

    @Test
    fun addition_isCorrect() {
        val result = 2 + 2
        assertEquals(4, result)
    }

    @Test
    fun multiplication_isCorrect() {
        val result = 5 * 5
        assertEquals(25, result)
    }
}
