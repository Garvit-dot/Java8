// Name: Garvit Kandpal
// PRN: 23070126044
// Batch: AIML A2

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager sm = new StudentManager();

        while (true) {
            System.out.println("\n---- Student Management Menu ----");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search by PRN");
            System.out.println("4. Search by Name");
            System.out.println("5. Search by Position");
            System.out.println("6. Update Student");
            System.out.println("7. Delete Student");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter PRN: ");
                        String prn = sc.nextLine();
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter DoB (dd-mm-yyyy): ");
                        String dob = sc.nextLine();
                        System.out.print("Enter Marks: ");
                        double marks = sc.nextDouble();
                        sm.addStudent(new Student(prn, name, dob, marks));
                        System.out.println("Student added successfully.");
                        break;

                    case 2:
                        sm.displayAll();
                        break;

                    case 3:
                        System.out.print("Enter PRN to search: ");
                        Student s1 = sm.searchByPRN(sc.nextLine());
                        s1.display();
                        break;

                    case 4:
                        System.out.print("Enter Name to search: ");
                        Student s2 = sm.searchByName(sc.nextLine());
                        s2.display();
                        break;

                    case 5:
                        System.out.print("Enter index to search: ");
                        int index = sc.nextInt();
                        Student s3 = sm.searchByPosition(index);
                        s3.display();
                        break;

                    case 6:
                        System.out.print("Enter PRN to update: ");
                        String upPrn = sc.nextLine();
                        System.out.print("New Name: ");
                        String upName = sc.nextLine();
                        System.out.print("New DoB: ");
                        String upDob = sc.nextLine();
                        System.out.print("New Marks: ");
                        double upMarks = sc.nextDouble();
                        sm.updateStudent(upPrn, upName, upDob, upMarks);
                        System.out.println("Student updated.");
                        break;

                    case 7:
                        System.out.print("Enter PRN to delete: ");
                        sm.deleteStudent(sc.nextLine());
                        System.out.println("Student deleted.");
                        break;

                    case 8:
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid option. Try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
