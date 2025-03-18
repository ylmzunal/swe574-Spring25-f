package dev.swe573.whatsthis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import java.io.File;

@SpringBootApplication
@PropertySources({
    @PropertySource(value = "file:env.properties", ignoreResourceNotFound = true)
})
public class WhatsthisApplication {

	public static void main(String[] args) {
		// Check if env.properties file exists
		File envFile = new File("env.properties");
		if (envFile.exists()) {
			System.out.println("env.properties file found at: " + envFile.getAbsolutePath());
		} else {
			System.out.println("env.properties file not found. Using environment variables only.");
		}
		
		SpringApplication.run(WhatsthisApplication.class, args);
	}

}
