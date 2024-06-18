package example.service

import example.api.ExampleApiService
import example.api.model.ExampleResponseModel
import org.springframework.stereotype.Service

@Service
class ExampleApiServiceImpl: ExampleApiService {
    override fun example(): ExampleResponseModel {
        return ExampleResponseModel(
            message = "hi"
        )
    }
}
