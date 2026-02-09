package model;

public class Student {
    private int id;
    private String name;
    private String email; // Added to match SQL
    private String course;

    public Student(int id, String name, String email, String course) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.course = course;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; } // Added
    public void setEmail(String email) { this.email = email; } // Added

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }
}
