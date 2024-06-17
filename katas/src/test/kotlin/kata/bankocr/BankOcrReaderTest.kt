package kata.bankocr

import com.github.ahewer.kata.bankocr.BankOcrReader
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class BankOcrReaderTest {

    private val reader = BankOcrReader()

    @Test
    fun `Test basic entry`() {

        val entry = "   _  _     _  _  _  _  _ \n" +
                    " | _| _||_||_ |_   ||_||_|\n" +
                    " ||_  _|  | _||_|  ||_| _|"

        val expected = "123456789"
        val result = reader.scan(entry)

        assertEquals(expected, result)
    }
}
