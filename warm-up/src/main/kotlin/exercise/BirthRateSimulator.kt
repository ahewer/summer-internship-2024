package exercise

import kotlin.random.Random

enum class Gender {
    BOY,
    GIRL
}

data class Child(
    val gender: Gender
)

class BirthRateSimulator {

    fun estimateGenderRatio(familyAmount: Int): Double {
        TODO("Implement this function to complete the task")
    }

    private fun estimateChildrenForOneFamily(): List<Child> {
        TODO("Implement this function to complete the task")
    }

    private fun isGirl() = Random.nextBoolean()
}
