package kata.employeereport

import com.github.ahewer.kata.employeereport.Employee
import com.github.ahewer.kata.employeereport.EmployeeReport
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class EmployeeReportTest{
    private val employeeReport = EmployeeReport()

    private val employees = listOf(
        Employee("Mark", 15),
        Employee("John", 27),
        Employee("Jane", 50),
        Employee("Klara", 3),
        Employee("Maxim", 1),
        Employee("Nina", 30),
    )

    @Test
    fun `Fulfills first user story`() {
       // ...
    }
}
