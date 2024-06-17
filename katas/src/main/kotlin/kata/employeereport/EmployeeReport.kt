package com.github.ahewer.kata.employeereport

data class Employee(
    val name: String,
    val age: Int
)

class EmployeeReport {

    fun generate(employeeList: List<Employee>): List<Employee> {
        return employeeList
    }

}
