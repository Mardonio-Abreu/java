package mx.unam.dgtic.config;

import java.util.HashMap;
import java.util.Map;

public class AuditServiceSingleton {
    // 1. Private static instance of the same class
    private static AuditServiceSingleton instance;

    // 2. Private constructor to prevent instantiation
    private AuditServiceSingleton() {
        // initialization logic

    }

    // 3. Public static method to provide access to the instance
    public static AuditServiceSingleton getInstance() {
        if (instance == null) {
            instance = new AuditServiceSingleton();  // lazy initialization
        }
        return instance;
    }

    public void log(String userId, String action, String details) {

    }
}
