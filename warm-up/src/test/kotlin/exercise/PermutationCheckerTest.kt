package exercise

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PermutationCheckerTest{

    private val permutationChecker = PermutationChecker()

    @Test  fun `Should return true if both strings are empty`() {
        val stringOne = ""
        val stringTwo = ""

        val result = permutationChecker.isPermutation(stringOne, stringTwo)
        assertTrue(result)

    }

    @Test  fun `Should return true if one string is permutation of other one`() {
        val stringOne = "abcdk"
        val stringTwo = "cabkd"

        val result = permutationChecker.isPermutation(stringOne, stringTwo)
        assertTrue(result)
    }


    @Test  fun `Should return false if one string is not a permutation of the other one`() {
        val stringOne = "abcdk"
        val stringTwo = "cabkdaaabbshd"

        val result = permutationChecker.isPermutation(stringOne, stringTwo)
        assertFalse(result)
    }

}
