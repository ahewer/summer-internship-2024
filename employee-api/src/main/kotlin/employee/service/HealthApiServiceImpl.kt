package employee.service

import employee.api.HealthApiService
import org.springframework.stereotype.Service

@Service
class HealthApiServiceImpl: HealthApiService {
    override fun health(): String {
        return "ok"
    }
}
