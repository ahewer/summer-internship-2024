package exercise

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PalindromePermutationCheckerTest{

    private val checker = PalindromePermutationChecker()

    @Test fun `Should return true for empty string`() {
        val string = ""
        val result = checker.checkPermutation(string)
        assertTrue(result)
    }

    @Test fun `Should return true for palindrome`() {
        val string = "No lemons, no melon"
        val result = checker.checkPermutation(string)
        assertTrue(result)
    }

    @Test fun `Should return true for permuted palindrome`() {
        val string = "melon no, No lemons"
        val result = checker.checkPermutation(string)
        assertTrue(result)
    }

    @Test fun `Should return false for a string that is not a permuted palindrome`() {
        val string = "hello"
        val result = checker.checkPermutation(string)
        assertFalse(result)
    }
}
