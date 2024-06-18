package example.service.aop

import example.service.CustomException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class ExceptionHandler {

    @ExceptionHandler(value = [CustomException::class])
    fun onOpenAiClientError(ex: CustomException): ResponseEntity<Any> =
        ResponseEntity<Any>(ex.msg, HttpStatus.INTERNAL_SERVER_ERROR)

}
