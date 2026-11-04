import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("================================");
        System.out.println(" STUDENT GRADE MANAGEMENT SYSTEM");
        System.out.println("================================");

        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Exit");

        System.out.print("Choose an option: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Add Student selected");
                break;

            case 2:
                System.out.println("View Students selected");
                break;

            case 3:
                System.out.println("Exiting program...");
                break;

            default:
                System.out.println("Invalid choice!");
        }

        input.close();
    }
}

