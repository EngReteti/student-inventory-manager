package com.school;
import com.school.service.StudentService;
import com.school.service.AuthService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AuthService authService = new AuthService();
        StudentService studentService = new StudentService();

        System.out.println("🚀 Launching School Management System...");

        // Keep asking for login until successful
        boolean loggedIn = false;
        while (!loggedIn) {
            loggedIn = authService.login(sc);
            if (!loggedIn) {
                System.out.println("Please try again.");
            }
        }

        // Only starts the menu if login is successful
        studentService.run();
        
        System.out.println("\n👋 System Session Ended.");
        sc.close();
    }
}
