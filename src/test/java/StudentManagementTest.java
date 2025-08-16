import org.example.Student;
import org.example.service.StudentService;

import java.util.Arrays;
import java.util.List;

public class StudentManagementTest {
    public static void main(String[] args) {
        StudentService service = new StudentService();

        List<String> courses = Arrays.asList("Maths", "English", "Science");
        Student student1 = new Student(1,"John", "John@gmail.com", 65, courses);
        Student student2 = new Student(2,"Alice", "Alice@gmail.com", 75, courses);
        Student student3 = new Student(3,"Ben", "Ben@gmail.com", 85, courses);

        service.addStudent(student1);
        service.addStudent(student2);
        service.addStudent(student3);

        System.out.println("Student 1: " + service.findStudentById(1).get().getName());
        // instead of doing the above, can do this

        service.findStudentById(2)
                .ifPresentOrElse(
                        student -> System.out.println("Student 2: " + student.getName()),
                        () -> System.out.println("Student 2 not found")
                ); // it gives you a failsafe if student is not found

        System.out.println(service.getStudentsByGradeRange());
        System.out.println(service.getStudentsWithGradesAbove(50.0));
        System.out.println(service.getTopStudents(70).get(0).getName());
    }
}
