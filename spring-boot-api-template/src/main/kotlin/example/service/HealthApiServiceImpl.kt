package example.service

import example.api.HealthApiService
import org.springframework.stereotype.Service

@Service
class HealthApiServiceImpl: HealthApiService {
    override fun health(): String {
        return "ok"
    }
}
