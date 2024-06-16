package exercise

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class StringDistanceCheckerTest{

    private val stringDistanceChecker = StringDistanceChecker()

    @Test fun `Should return true for identical strings`() {
        val string = "hello"
        val result = stringDistanceChecker.isDistanceAtMostOne(string, string)
        assertTrue(result)
    }

    @Test fun `Should return true for string that had one character added`() {
        val stringOne = "hello"
        val stringTwo = "hello!"
        val result = stringDistanceChecker.isDistanceAtMostOne(stringOne, stringTwo)
        assertTrue(result)
    }

    @Test fun `Should return true for string that had one character removed`() {
        val stringOne = "hello"
        val stringTwo = "ello"
        val result = stringDistanceChecker.isDistanceAtMostOne(stringOne, stringTwo)
        assertTrue(result)
    }

    @Test fun `Should return true for string that had one character replaced`() {
        val stringOne = "hello"
        val stringTwo = "hallo"
        val result = stringDistanceChecker.isDistanceAtMostOne(stringOne, stringTwo)
        assertTrue(result)
    }

    @Test fun `Should return false for string that is too different from original string`() {
        val stringOne = "hello"
        val stringTwo = "llo"
        val result = stringDistanceChecker.isDistanceAtMostOne(stringOne, stringTwo)
        assertFalse(result)
    }


}

