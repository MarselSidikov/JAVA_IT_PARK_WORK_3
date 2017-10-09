package ru.itis.logger;

import java.time.LocalTime;

public class Logger {
    private static final String PREFIX = "Custom Logger: ";

    private static final Logger instance;

    private Logger() {
        System.out.println("Created logger");
    }
    public void log(String className, String message) {
        System.out.println(PREFIX + " " + className + ", " + message + " at " + LocalTime.now());
    }

    static {
        instance = new Logger();
    }

    public static Logger getInstance() {
        return instance;
    }
}
