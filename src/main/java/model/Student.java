package model;

/**
 * Objective: Strengthen Java OOP through Encapsulation
 */
public class Student {
    // Private variables (Data hiding)
    private int id;
    private String name;
    private String course;

    // Constructor to initialize the Student object
    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    // Getters and Setters (Accessors and Mutators)
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }
}
