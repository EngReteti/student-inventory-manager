package com.school;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DatabaseManager db = new DatabaseManager();
        
        System.out.println("🚀 SCHOOL MANAGEMENT SYSTEM READY");

        while (true) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student by ID");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                String name = getValidInput(scanner, "Name: ", "^[A-Za-z ]+$", "Letters only!");
                String id = getValidInput(scanner, "ID (5 digits): ", "^[0-9]{5}$", "5 numbers!");
                String phone = getValidInput(scanner, "Phone (10 digits): ", "^[0-9]{10}$", "10 numbers!");
                db.saveStudent(name, id, phone);
            } else if (choice.equals("2")) {
                System.out.print("Enter Student ID to search: ");
                String searchId = scanner.nextLine();
                db.searchStudent(searchId);
            } else if (choice.equals("0")) {
                break;
            }
        }
        scanner.close();
    }

    public static String getValidInput(Scanner scanner, String prompt, String regex, String errorMsg) {
        String input;
        while (true) {
            System.out.print(prompt);
            input = scanner.nextLine().trim();
            if (input.matches(regex)) return input;
            System.out.println("❌ Error: " + errorMsg);
        }
    }
}

