import java.util.Scanner;

public class FibonacciRecursive {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        if (num <= 0) {
            System.out.println("Please enter a positive integer greater than zero.");
        } else {
            int result = fibonacci(num - 1); // Adjusting to zero-based index
            System.out.println("The " + num + "th Fibonacci number is: " + result);
        }

        scanner.close();
    }
}
