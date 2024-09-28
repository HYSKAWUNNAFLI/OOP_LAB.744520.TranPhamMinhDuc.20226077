import java.util.Arrays;
import java.util.Scanner;

public class Lab1_65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] myArray = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            myArray[i] = scanner.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(myArray));

        Arrays.sort(myArray);

        System.out.println("Sorted array: " + Arrays.toString(myArray));

        int sum = 0;
        for (int num : myArray) {
            sum += num;
        }

        double average = (double) sum / myArray.length;

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average value of array elements: " + average);

        scanner.close();
    }
}
