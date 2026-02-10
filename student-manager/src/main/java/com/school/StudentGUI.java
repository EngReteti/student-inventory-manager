package com.school;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentGUI {
    private JFrame frame;
    private JTextField nameField, idField, phoneField;
    private DatabaseManager db;

    public StudentGUI() {
        db = new DatabaseManager();
        frame = new JFrame("Student Manager Pro");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2));

        // UI Components
        frame.add(new JLabel(" Name:"));
        nameField = new JTextField();
        frame.add(nameField);

        frame.add(new JLabel(" Student ID (5 digits):"));
        idField = new JTextField();
        frame.add(idField);

        frame.add(new JLabel(" Phone:"));
        phoneField = new JTextField();
        frame.add(phoneField);

        JButton addButton = new JButton("Add Student");
        frame.add(addButton);

        JButton viewButton = new JButton("View All (Console)");
        frame.add(viewButton);

        // Button Logic
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                db.saveStudent(nameField.getText(), idField.getText(), phoneField.getText());
                JOptionPane.showMessageDialog(frame, "Action Processed! Check console for details.");
            }
        });

        viewButton.addActionListener(e -> db.viewAllStudents());

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new StudentGUI();
    }
}

