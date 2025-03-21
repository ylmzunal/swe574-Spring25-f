package dev.swe573.whatsthis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

// Explicitly exclude all database-related configuration
@Configuration
@ComponentScan(basePackages = {"dev.swe573.whatsthis.minimal"})
@EnableAutoConfiguration(exclude = {
    DataSourceAutoConfiguration.class,
    HibernateJpaAutoConfiguration.class
})
@RestController
public class MinimalApplication {

    public static void main(String[] args) {
        // Print system properties for debugging
        System.out.println("JAVA_HOME: " + System.getProperty("java.home"));
        System.out.println("PORT: " + System.getenv("PORT"));
        System.out.println("Profile: " + System.getProperty("spring.profiles.active"));
        
        // Run with explicit configuration to ensure no auto-config
        SpringApplication app = new SpringApplication(MinimalApplication.class);
        app.setAdditionalProfiles("minimal");
        app.run(args);
        
        System.out.println("Minimal application started successfully");
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