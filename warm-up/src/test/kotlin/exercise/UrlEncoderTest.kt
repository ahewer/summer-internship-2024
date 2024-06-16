package exercise

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class UrlEncoderTest{

    private val encoder = UrlEncoder()

    @Test fun `Same string is returned if no encoding is needed`() {
        val string = "hello"
        val result = encoder.encode(string)
        assertEquals(string, result)
    }

    @Test fun `Trailing whitespace is removed in string by encoder`() {
        val string = "   hello    "
        val expected = "hello"
        val result = encoder.encode(string)
        assertEquals(expected, result)
    }


    @Test fun `Non-trailing whitespace is escaped in string by encoder`() {
        val string = "hello world"
        val expected = "hello%20world"
        val result = encoder.encode(string)
        assertEquals(expected, result)
    }
}
