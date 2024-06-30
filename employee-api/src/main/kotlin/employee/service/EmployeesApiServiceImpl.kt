package employee.service

import employee.api.EmployeeApiService
import employee.api.model.AddEmployeeRequestModel
import employee.api.model.Employee
import org.springframework.stereotype.Service

@Service
class EmployeesApiServiceImpl(
): EmployeeApiService {

    // in-memory database for saving the employee data
    private val employees = mutableListOf<Employee>()

    override fun addEmployee(addEmployeeRequestModel: AddEmployeeRequestModel) {
        TODO("Not yet implemented")
    }

    override fun listEmployees(): List<Employee> {
        TODO("Not yet implemented")
    }

}
