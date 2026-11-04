import java.util.ArrayList;

public class GradeManager {

    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {

            for (Student student : students) {
                student.displayStudent();
                System.out.println("--------------------");
            }
        }
    }
}

