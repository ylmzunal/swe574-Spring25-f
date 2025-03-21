package dev.swe573.whatsthis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {
    DataSourceAutoConfiguration.class,
    HibernateJpaAutoConfiguration.class,
    JpaRepositoriesAutoConfiguration.class
})
@RestController
public class CloudRunApplication {

    public static void main(String[] args) {
        System.out.println("Starting minimal Cloud Run application");
        SpringApplication.run(CloudRunApplication.class, args);
        System.out.println("Application started successfully");
    }

    @GetMapping("/")
    public String home() {
        return "WhatsThis API is running (Database disabled)";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
} 