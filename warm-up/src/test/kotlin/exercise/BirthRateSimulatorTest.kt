package exercise

import org.junit.jupiter.api.Test

class BirthRateSimulatorTest{

    private val simulator = BirthRateSimulator()

    @Test fun `Run simulation for 10 families`() {
        val result = simulator.estimateGenderRatio(10)
        println(result)
    }

    @Test fun `Run simulation for 100 families`() {
        val result = simulator.estimateGenderRatio(100)
        println(result)
    }

    @Test fun `Run simulation for 1000 families`() {
        val result = simulator.estimateGenderRatio(1000)
        println(result)
    }
}
