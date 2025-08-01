package org.example;

import java.util.*;

public class CollectionsExercise {
    public static void main(String[] args) {

        // TODO: Create a List of student names
        List<String> students = new ArrayList<>();

        // Add: "Alice", "Bob", "Charlie", "Alice", "David"
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("Alice"); // Lists allow dups whereas sets don't
        students.add("David");

        // TODO: Print the list size and check if "Alice" exists
        System.out.println("How many students there is in the class:  "+students.size());

//        for (String student : students) {
//            if (student.equals("Alice")) {
//                System.out.println("Yay alice you still exist!");
//            }
//        }

        // Better approach of doing the above:
        if (students.contains("Alice")) {
            System.out.println("Yay alice you still exist!");
        }

        // TODO: Create a Set from the list to remove duplicates
        Set<String> uniqueStudents = new HashSet<>(students); // it will return 4 students as doesn't allow dupes
        System.out.println("How many different students there is in the class:  "+uniqueStudents.size());

        // TODO: Create a Map to store student grades
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Alice", 90);
        grades.put("Bob", 85);
        grades.put("Charlie", 92);
        grades.put("David", 78);

        // TODO: Print all students and their grades
        for (String student : uniqueStudents) {
            System.out.println(student +": "+ grades.get(student));
        }
//        // An Alternative way to print student and grade
//        for (String student : grades.keySet()) {
//            System.out.println(student +": "+ grades.get(student));
//        }

        // TODO: Find the student with the highest grade

//        // Outputs the wrong answer - This gets "David" (last alphabetically)
//        String highest = Collections.max(grades.keySet());
//        System.out.println("The person with the highest grade: "+ highest);

        String highest = "";
        int highestScore = 0;
        for (String student : uniqueStudents) {
            int grade = grades.get(student);
            if (grade > highestScore) {
                highest = student;
                highestScore = grade;
            }
        }
        System.out.println("The person with the highest grade: "+ highest);
    }
}
