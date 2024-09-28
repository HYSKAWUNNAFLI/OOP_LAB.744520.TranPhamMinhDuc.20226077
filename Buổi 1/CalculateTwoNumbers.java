import java.util.Scanner;

public class CalculateTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        String strNum1 = scanner.nextLine();
        System.out.print("Enter the second number: ");
        String strNum2 = scanner.nextLine();

        // Convert the input strings to double
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        // Perform arithmetic operations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        // Check divisor to avoid division by zero
        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Cannot divide by zero.");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
