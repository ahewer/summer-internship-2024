package exercise.model

class Matrix(
    rows: Int,
    private val cols: Int,
    private val _data:  DoubleArray
) {
    val data: DoubleArray
        get() = _data.clone()

    init {
        if(_data.size != rows * cols) {
            throw IllegalArgumentException("Provided data must have same dimensions like matrix.")
        }
    }

    fun getValue(row: Int, col: Int) = _data[row * cols + col]

}
