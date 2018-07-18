package com.example.domain

import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class SuperUseCaseTest {

    @Test
    fun subtraction_isCorrect() {
        val result = 100 - 1
        assertEquals(99, result)
    }
}