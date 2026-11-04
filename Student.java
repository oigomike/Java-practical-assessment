public class Student {

    String name;
    String admissionNumber;
    double marks;

    public Student(String name, String admissionNumber, double marks) {
        this.name = name;
        this.admissionNumber = admissionNumber;
        this.marks = marks;
    }

    public void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Admission Number: " + admissionNumber);
        System.out.println("Marks: " + marks);
    }
}

