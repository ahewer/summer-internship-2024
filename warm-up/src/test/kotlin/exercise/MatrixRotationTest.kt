package exercise

import exercise.model.Matrix
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MatrixRotationTest{

    private val matrixRotation = MatrixRotation()

    @Test fun `Test if rotation is correct`() {

        val matrix = Matrix(
            3, 3, doubleArrayOf(
                1.0, 1.0, 1.0,
                1.0, 1.0, 1.0,
                2.0, 2.0, 2.0,
                )
        )
        val expected = Matrix(
            3, 3, doubleArrayOf(
                2.0, 1.0, 1.0,
                2.0, 1.0, 1.0,
                2.0, 1.0, 1.0,
            )
        )

        val result = matrixRotation.rotateBy90Degree(matrix)
        assertTrue(expected.data.contentEquals(result.data))
    }
}
