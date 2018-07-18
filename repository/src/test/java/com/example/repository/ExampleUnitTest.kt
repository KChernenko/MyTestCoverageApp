package com.example.repository

import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
@RunWith(MockitoJUnitRunner::class)
class ExampleUnitTest {

    @Test
    fun addition_isCorrect() {
        val result = 1 + 1
        assertEquals(2, result)
    }
}