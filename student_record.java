package student;
import java.util.ArrayList;
import java.util.Scanner;
public class student_record {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Double> studentGrades = new ArrayList<>();
        // Initial students and grades
        studentNames.add("Vikash Divyakriti");
        studentGrades.add(85.5);
        studentNames.add("Ritesh Moharana");
        studentGrades.add(92.0);
        studentNames.add("Harsh Prabhakar");
        studentGrades.add(96.0);
        studentNames.add("Suraj Sahoo");
        studentGrades.add(89.0);
        studentNames.add("Roshan Rout");
        studentGrades.add(92.0);
        studentNames.add("Prateek Tripathy");
        studentGrades.add(98.0);
        studentNames.add("Vikram Aditya");
        studentGrades.add(84.0);
        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            switch (choice) {
                case 1:
                    addStudent(scanner, studentNames, studentGrades);
                    break;
                case 2:
                    viewStudentsAndGrades(studentNames, studentGrades);
                    break;
                case 3:
                    calculateAverageGrade(studentGrades);
                    break;
                case 4:
                    exitProgram();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
    private static void printMenu() {
        System.out.println("Grade Tracker Menu:");
        System.out.println("1. Add new student");
        System.out.println("2. View students and grades");
        System.out.println("3. Calculate average grade");
        System.out.println("4. Exit");
        System.out.print("Enter your choice (1-4): ");
    }
    private static void addStudent(Scanner scanner, ArrayList<String> studentNames,
                                   ArrayList<Double> studentGrades) {
        System.out.print("Enter the student's name: ");
        String studentName = scanner.nextLine();
        studentNames.add(studentName);
        System.out.print("Enter the student's grade: ");
        double studentGrade = scanner.nextDouble();
        studentGrades.add(studentGrade);
        System.out.println("Student added successfully!");
    }
    private static void viewStudentsAndGrades(ArrayList<String> studentNames, ArrayList<Double>
            studentGrades) {
        if (studentNames.isEmpty()) {
            System.out.println("No students in the system.");
        } else {
            System.out.println("List of students and grades:");
            for (int i = 0; i < studentNames.size(); i++) {
                System.out.println(studentNames.get(i) + ": " + studentGrades.get(i));
            }
        }
    }
    private static void calculateAverageGrade(ArrayList<Double> studentGrades) {
        if (studentGrades.isEmpty()) {
            System.out.println("No grades to calculate the average.");
        } else {
            double sum = 0;
            for (Double grade : studentGrades) {
                sum += grade;
            }
            double average = sum / studentGrades.size();
            System.out.println("Average grade: " + average);
        }
    }
    private static void exitProgram() {
        System.out.println("Exiting Grade Tracker. Goodbye!");
        System.exit(0);
    }
}










