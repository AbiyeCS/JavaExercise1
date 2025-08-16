package org.example.service;

import org.example.Student;

import java.util.*;
import java.util.stream.Collectors;

public class StudentService {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) throws IllegalArgumentException {
        if (students.contains(student)) {
            throw new IllegalArgumentException("Student already exists");
        }
        students.add(student);
    }

    public Optional<Student> findStudentById(int id) {
        return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst();
    } // Needed a bit of help with this one

    public List<Student> getStudentsWithGradesAbove(double threshold) {
//        return students.stream()
//                .filter(student -> student.getGrade() >= 60)
//                .toList();

        // no clue why I've originally used 60, you should use the param you are passing in

        return students.stream()
                .filter(student -> student.getGrade() >= threshold)
                .toList();
    }

//    public Map<String, List<Student>> getStudentsByGradeRange(){
//        Map <String, List<Student>> studentsByGradeRange = new HashMap<>();
//
//        List <Student> studentsWithAGrade = students.stream()
//                .filter(student -> student.getGrade() >= 90 && student.getGrade() <= 100)
//                .toList();
//        studentsByGradeRange.put("A", studentsWithAGrade);
//
//        List <Student> studentsWithBGrade = students.stream()
//                .filter(student -> student.getGrade() >= 80 && student.getGrade() <= 89)
//                .toList();
//        studentsByGradeRange.put("B", studentsWithBGrade);
//
//        List <Student> studentsWithCGrade = students.stream()
//                .filter(student -> student.getGrade() >= 70 && student.getGrade() <= 79)
//                .toList();
//        studentsByGradeRange.put("C", studentsWithCGrade);
//
//        List <Student> studentsWithDGrade = students.stream()
//                .filter(student -> student.getGrade() >= 60 && student.getGrade() <= 69)
//                .toList();
//
//        studentsByGradeRange.put("D", studentsWithDGrade);
//
//        // Not sure what I'd return here tbh, we don't want to return a list. I imagine we want to return a map with the grade then the list of students
//
//        return studentsByGradeRange;
//    }

    // A much much better way to do the above is

    public Map<String, List<Student>> getStudentsByGradeRange() {
        return students.stream()
                .collect(Collectors.groupingBy(student -> {
                    int grade = student.getGrade();
                    if (grade >= 90) return "A";
                    if (grade >= 80) return "B";
                    if (grade >= 70) return "C";
                    if (grade >= 60) return "D";
                    return "F";
                }));
    }

//    public List<Student> getTopStudents(int n){
//        // Not sure what it means get top N students by grade
//        List <Student> topStudents = new ArrayList<>();
//        for(Student student: students){
//            if(student.getGrade() >= n){
//                topStudents.add(student);
//            }
//        }
//        return topStudents;
//    }

    // Did the above wrong - What was intended to be done originally was

    public List<Student> getTopStudents(int n) {
        return students.stream()
                .sorted(Comparator.comparing(Student::getGrade).reversed()) // Highest first
                .limit(n)  // Take first N
                .toList();
    }
}
