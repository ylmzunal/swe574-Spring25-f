package dev.swe573.whatsthis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import static org.springframework.web.servlet.function.RouterFunctions.route;
import static org.springframework.web.servlet.function.ServerResponse.ok;

@SpringBootApplication(exclude = {
    DataSourceAutoConfiguration.class,
    HibernateJpaAutoConfiguration.class,
    JpaRepositoriesAutoConfiguration.class
})
public class CloudRunApplication {

    public static void main(String[] args) {
        System.out.println("Starting Cloud Run Application (No Database)...");
        SpringApplication.run(CloudRunApplication.class, args);
        System.out.println("Cloud Run Application started successfully!");
    }

    @Bean
    public RouterFunction<ServerResponse> routes() {
        return route()
            .GET("/", request -> ok().body("WhatsThis API is running (Database disabled)"))
            .GET("/health", request -> ok().body("OK"))
            .build();
    }
} 