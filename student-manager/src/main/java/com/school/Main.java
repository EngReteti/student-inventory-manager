package com.school;
import com.school.service.StudentService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        Scanner sc = new Scanner(System.in);

        System.out.println("--- UNIVERSITY ACCESS PORTAL ---");
        System.out.print("Enter Your Name: ");
        String user = sc.nextLine();
        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        // Matching your documented successful login
        if (user.equals("admin") && pass.equals("university2026")) {
            System.out.println("Access Granted! Welcome, admin");
            service.run();
        } else {
            System.out.println("Access Denied. Incorrect credentials.");
        }
    }
}

