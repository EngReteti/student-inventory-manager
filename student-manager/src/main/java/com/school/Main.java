package com.school;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DatabaseManager db = new DatabaseManager();

        while (true) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student by ID");
            System.out.println("3. Delete Student");
            System.out.println("4. Update Student");
            System.out.println("5. View All Students");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("ID: ");
                String id = scanner.nextLine();
                System.out.print("Phone: ");
                String phone = scanner.nextLine();
                db.saveStudent(name, id, phone);

            } else if (choice.equals("2")) {
                System.out.print("Enter ID to search: ");
                String searchId = scanner.nextLine();
                db.searchStudent(searchId);

            } else if (choice.equals("3")) {
                System.out.print("Enter ID to DELETE: ");
                String deleteId = scanner.nextLine();
                db.deleteStudent(deleteId);

            } else if (choice.equals("4")) {
                System.out.print("Enter Student ID to Update: ");
                String updateId = scanner.nextLine();
                System.out.print("Enter New Name: ");
                String newName = scanner.nextLine();
                System.out.print("Enter New Phone: ");
                String newPhone = scanner.nextLine();
                db.updateStudent(updateId, newName, newPhone);

            } else if (choice.equals("5")) {
                db.viewAllStudents();

            } else if (choice.equals("0")) {
                break;
            }
        }
        scanner.close();
    }
}

