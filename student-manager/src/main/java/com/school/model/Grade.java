package com.school.model;

public class Grade {
    private int id;
    private int studentId;
    private String subject;
    private int score;

    public Grade(int id, int studentId, String subject, int score) {
        this.id = id;
        this.studentId = studentId;
        this.subject = subject;
        this.score = score;
    }
}
