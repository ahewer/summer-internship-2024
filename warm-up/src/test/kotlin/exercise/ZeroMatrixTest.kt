package exercise

import exercise.model.Matrix
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ZeroMatrixTest{

    private val zeroMatrix = ZeroMatrix()

    @Test fun `Matrix with no zeroes should not be changed`() {
        val matrix = Matrix(
            3, 3, doubleArrayOf(
                1.0, 1.0, 1.0,
                1.0, 1.0, 1.0,
                2.0, 2.0, 2.0,
            )
        )
        val result = zeroMatrix.zero(matrix)

        assertTrue(matrix.data.contentEquals(result.data))
    }

    @Test fun `Columns and rows should be overwritten with 0 if one entry is 0`() {
        val matrix = Matrix(
            3, 3, doubleArrayOf(
                1.0, 0.0, 1.0,
                1.0, 1.0, 1.0,
                2.0, 2.0, 2.0,
            )
        )
        val expected = Matrix(
            3, 3, doubleArrayOf(
                0.0, 0.0, 0.0,
                1.0, 0.0, 1.0,
                2.0, 0.0, 2.0,
            )
        )
        val result = zeroMatrix.zero(matrix)

        assertTrue(expected.data.contentEquals(result.data))
    }
}
