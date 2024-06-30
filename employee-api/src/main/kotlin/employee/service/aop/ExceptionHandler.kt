package employee.service.aop

import employee.service.CustomException
import employee.service.EmployeeAlreadyExistsException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class ExceptionHandler {

    @ExceptionHandler(value = [CustomException::class])
    fun onCustomError(ex: CustomException): ResponseEntity<Any> =
        ResponseEntity<Any>(ex.msg, HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = [EmployeeAlreadyExistsException::class])
    fun onEmployeeAlreadyExistsError(ex: EmployeeAlreadyExistsException): ResponseEntity<Any> =
        ResponseEntity<Any>(ex.msg, HttpStatus.INTERNAL_SERVER_ERROR)

}
