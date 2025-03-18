package dev.swe573.whatsthis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthCheckController {

    @GetMapping("/api/health")
    public Map<String, Object> healthCheck() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "UP");
        response.put("message", "Service is running without database");
        response.put("timestamp", System.currentTimeMillis());
        return response;
    }

    @GetMapping("/api/info")
    public Map<String, Object> info() {
        Map<String, Object> response = new HashMap<>();
        response.put("app", "WhatsThis API");
        response.put("version", "0.0.1");
        response.put("profile", System.getProperty("spring.profiles.active", "default"));
        response.put("database", "DISABLED");
        return response;
    }
} 