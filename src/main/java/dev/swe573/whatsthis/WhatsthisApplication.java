package dev.swe573.whatsthis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.File;

@SpringBootApplication
public class WhatsthisApplication {

	public static void main(String[] args) {
		// Print startup message for debugging
		System.out.println("Starting WhatsThis application...");
		System.out.println("Current directory: " + new File(".").getAbsolutePath());
		
		// Launch the Spring application
		SpringApplication.run(WhatsthisApplication.class, args);
		
		System.out.println("WhatsThis application started successfully!");
	}
}
