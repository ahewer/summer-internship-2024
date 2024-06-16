package exercise

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class UniqueCharactersTest {

    private val uniqueCharacters = UniqueCharacters()

    @Test fun `Should return true for empty string`() {
        val string = ""
        val result = uniqueCharacters.hasOnlyUniqueCharacters(string)
        assertTrue(result)
    }

    @Test fun `Should return false for string with repeated characters`() {
        val string = "aaabbb"
        val result = uniqueCharacters.hasOnlyUniqueCharacters(string)
        assertFalse(result)
    }

    @Test fun `Should return true for string with unique characters`() {
        val string = "abcde'"
        val result = uniqueCharacters.hasOnlyUniqueCharacters(string)
        assertTrue(result)
    }
}
