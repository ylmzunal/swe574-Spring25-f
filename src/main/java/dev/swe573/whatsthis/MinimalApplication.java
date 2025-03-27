package dev.swe573.whatsthis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication(exclude = {
    DataSourceAutoConfiguration.class,
    HibernateJpaAutoConfiguration.class
})
@RestController
public class MinimalApplication {

    public static void main(String[] args) {
        // Print environment for debugging
        System.out.println("Starting MinimalApplication...");
        System.out.println("PORT: " + System.getenv("PORT"));
        System.out.println("PROFILES: " + System.getProperty("spring.profiles.active"));
        
        SpringApplication.run(MinimalApplication.class, args);
        
        System.out.println("MinimalApplication started successfully");
    }

    @GetMapping("/")
    public Map<String, Object> home() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "UP");
        response.put("message", "Minimal WhatsThis API is running");
        response.put("timestamp", System.currentTimeMillis());
        return response;
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        Map<String, String> status = new HashMap<>();
        status.put("status", "UP");
        return status;
    }
} 