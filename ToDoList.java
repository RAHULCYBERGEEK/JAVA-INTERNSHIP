import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    private ArrayList<String> tasks;
    private Scanner scanner;

    public ToDoList() {
        tasks = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addTask() {
        System.out.print("Enter task to add: ");
        String taskToAdd = scanner.nextLine();
        tasks.add(taskToAdd);
        System.out.println("Task added: " + taskToAdd);
    }

    public void deleteTask() {
        displayTasks();
        if (!tasks.isEmpty()) {
            System.out.print("Enter task index to delete: ");
            int indexToDelete = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            if (indexToDelete > 0 && indexToDelete <= tasks.size()) {
                String removedTask = tasks.remove(indexToDelete - 1);
                System.out.println("Task removed: " + removedTask);
            } else {
                System.out.println("Invalid task index!");
            }
        }
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public void markAsComplete() {
        displayTasks();
        if (!tasks.isEmpty()) {
            System.out.print("Enter task index to mark as complete: ");
            int indexToComplete = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            if (indexToComplete > 0 && indexToComplete <= tasks.size()) {
                String task = tasks.get(indexToComplete - 1);
                tasks.set(indexToComplete - 1, "[X] " + task);
                System.out.println("Task marked as complete: " + task);
            } else {
                System.out.println("Invalid task index!");
            }
        }
    }

    public void start() {
        int choice;
        do {
            System.out.println("\n===== To-Do List Menu =====");
            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. Display Tasks");
            System.out.println("4. Mark Task as Complete");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    deleteTask();
                    break;
                case 3:
                    displayTasks();
                    break;
                case 4:
                    markAsComplete();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 5);
        scanner.close();
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.start();
    }
}
