package employee.service

class CustomException(val msg: String): Exception(msg)
class EmployeeAlreadyExistsException(val msg: String): Exception(msg)
