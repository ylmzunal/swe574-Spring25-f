package dev.swe573.whatsthis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * This controller is for testing database connectivity only.
 * It won't be active in the minimal profile, only when database is configured.
 */
@RestController
@RequestMapping("/api/dbtest")
public class DatabaseTestController {

    @Value("${spring.datasource.url:none}")
    private String jdbcUrl;
    
    @Value("${spring.datasource.username:none}")
    private String username;
    
    @Value("${spring.datasource.password:none}")
    private String password;

    @GetMapping("/info")
    public Map<String, Object> getDatabaseInfo() {
        Map<String, Object> info = new HashMap<>();
        info.put("jdbcUrl", maskSensitiveInfo(jdbcUrl));
        info.put("username", maskSensitiveInfo(username));
        info.put("hasPassword", password != null && !password.equals("none"));
        return info;
    }
    
    @GetMapping("/test")
    public Map<String, Object> testConnection() {
        Map<String, Object> result = new HashMap<>();
        
        if ("none".equals(jdbcUrl)) {
            result.put("status", "NOT_CONFIGURED");
            result.put("message", "Database connection is not configured");
            return result;
        }
        
        Connection conn = null;
        try {
            // Try to establish a connection
            conn = DriverManager.getConnection(jdbcUrl, username, password);
            result.put("status", "SUCCESS");
            result.put("message", "Successfully connected to the database");
            result.put("databaseProduct", conn.getMetaData().getDatabaseProductName());
            result.put("databaseVersion", conn.getMetaData().getDatabaseProductVersion());
        } catch (SQLException e) {
            result.put("status", "ERROR");
            result.put("message", e.getMessage());
            result.put("errorCode", e.getErrorCode());
            result.put("sqlState", e.getSQLState());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    // Ignore
                }
            }
        }
        
        return result;
    }
    
    // Masks sensitive data in connection strings
    private String maskSensitiveInfo(String input) {
        if (input == null || "none".equals(input)) {
            return "not configured";
        }
        
        // Simple masking for demo purposes
        if (input.contains("@") && input.contains("://")) {
            // This is a JDBC URL with credentials - mask it
            return input.replaceAll(":[^:@/]+@", ":****@");
        }
        
        return input.length() > 3 ? input.substring(0, 2) + "..." : "***";
    }
} 