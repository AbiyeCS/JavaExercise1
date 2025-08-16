package org.example;

import java.util.List;

public class Student {

    private int id;
    private String name;
    private String email;
    private int grade;
    private List<String> courses;

    public Student(int id, String name, String email, int grade, List<String> courses) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.grade = grade;
        this.courses = courses;
    }
    public Student(){

    } // I've created this one so that they also have the ability to create a class without passing the above vars if this functionalityy is needed

    // I'd prefer to add Lombok annontations rather than this so using @Getter's and @Setters but for now the below will suffice
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public List<String> getCourses() {
        return courses;
    }
    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student Name: " + name + ", Email: " + email + ", Grade: " + grade + ", Courses: " + courses;
    }
}
