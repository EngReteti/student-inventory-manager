package com.school.util;

public class Color {
    // Color Codes
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String CYAN = "\u001B[36m";
    public static final String YELLOW = "\u001B[33m";

    // Helper methods to make it easy to use
    public static void success(String message) {
        System.out.println(GREEN + "✅ " + message + RESET);
    }

    public static void error(String message) {
        System.out.println(RED + "❌ " + message + RESET);
    }

    public static void info(String message) {
        System.out.println(CYAN + message + RESET);
    }
}
