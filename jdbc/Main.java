package jdbc;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {

        JdbcOperation jdbc = new JdbcOperation();

        try (Scanner sc = new Scanner(System.in)) {

            boolean running = true;

            while (running) {

                System.out.println("\n=== STUDENT MENU ===");
                System.out.println("1. Add Student");
                System.out.println("2. Display All Students");
                System.out.println("3. Search Student");
                System.out.println("4. Update Marks");
                System.out.println("5. Delete Student");
                System.out.println("6. Exit");
                System.out.print("Enter choice: ");

                try {
                    int choice =
                        Integer.parseInt(sc.nextLine().trim());

                    switch (choice) {

                        case 1: {
                            System.out.print("Enter ID: ");
                            int id = Integer.parseInt(
                                sc.nextLine().trim()
                            );

                            System.out.print("Enter name: ");
                            String name = sc.nextLine().trim();

                            System.out.print("Enter age: ");
                            int age = Integer.parseInt(
                                sc.nextLine().trim()
                            );

                            System.out.print("Enter marks: ");
                            double marks = Double.parseDouble(
                                sc.nextLine().trim()
                            );

                            if (name.isEmpty()
                                    || age < 0
                                    || marks < 0
                                    || marks > 100) {
                                System.out.println(
                                    "Invalid student details"
                                );
                                break;
                            }

                            Student s = new Student(
                                id, name, age, marks
                            );

                            if (jdbc.addStudent(s)) {
                                System.out.println(
                                    "Student added successfully"
                                );
                            }
                            break;
                        }

                        case 2: {
                            List<Student> students =
                                jdbc.readStudent();

                            if (students.isEmpty()) {
                                System.out.println(
                                    "No students found"
                                );
                            } else {
                                for (Student s : students) {
                                    System.out.println(s);
                                }
                            }
                            break;
                        }

                        case 3: {
                            System.out.print("Enter ID: ");
                            int id = Integer.parseInt(
                                sc.nextLine().trim()
                            );

                            Student s = jdbc.getstudentbyid(id);

                            if (s == null) {
                                System.out.println(
                                    "Student not found"
                                );
                            } else {
                                System.out.println(s);
                            }
                            break;
                        }

                        case 4: {
                            
                            System.out.print("Enter ID: ");
                            int id = Integer.parseInt(
                                sc.nextLine().trim()
                            );

                            System.out.print("Enter new marks: ");
                            double marks = Double.parseDouble(
                                sc.nextLine().trim()
                            );

                            if (marks < 0 || marks > 100) {
                                System.out.println(
                                    "Marks must be 0 to 100"
                                );
                                break;
                            }

                            if (jdbc.updateStudent(id, marks)) {
                                System.out.println(
                                    "Marks updated successfully"
                                );
                            } else {
                                System.out.println(
                                    "Student not found"
                                );
                            }
                            break;
                        }

                        case 5: {
                            System.out.print("Enter ID: ");
                            int id = Integer.parseInt(
                                sc.nextLine().trim()
                            );

                            if (jdbc.deleteStudent(id)) {
                                System.out.println(
                                    "Student deleted successfully"
                                );
                            } else {
                                System.out.println(
                                    "Student not found"
                                );
                            }
                            break;
                        }

                        case 6:
                            running = false;
                            System.out.println("Goodbye!");
                            break;

                        default:
                            System.out.println(
                                "Invalid menu choice"
                            );
                    }

                } catch (NumberFormatException e) {
                    System.out.println(
                        "Please enter a valid number."
                    );

                }
            }
        }
    }
}