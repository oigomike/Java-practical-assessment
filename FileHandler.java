import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    public void saveStudents(ArrayList<Student> students) {

        try (FileWriter writer = new FileWriter("students.txt")) {
            for (Student student : students) {
                writer.write(escapeCsv(student.name) + "," + escapeCsv(student.admissionNumber) + "," + student.marks + "\n");
            }
            System.out.println("Students saved successfully!");

        } catch (IOException e) {
            System.out.println("Error saving students: " + e.getMessage());
        }
    }

    // Escapes a string for CSV output.
    private String escapeCsv(String value) {
        if (value.contains(",") || value.contains("\"") || value.contains("\n") || value.contains("\r")) {
            value = value.replace("\"", "\"\"");
            return "\"" + value + "\"";
        }
        return value;
    }

    public ArrayList<Student> loadStudents() {

        ArrayList<Student> students = new ArrayList<>();

        try {
            File file = new File("students.txt");

            if (file.exists()) {
                Scanner reader = new Scanner(file);

                while (reader.hasNextLine()) {
                    String line = reader.nextLine();

                    String[] data = line.split(",");

                    String name = data[0];
                    String admissionNumber = data[1];
                    double marks = Double.parseDouble(data[2]);

                    Student student = new Student(name, admissionNumber, marks);

                    students.add(student);
                }

                reader.close();
            }

        } catch (Exception e) {
            System.out.println("Error loading students.");
        }

        return students;
    }
}

