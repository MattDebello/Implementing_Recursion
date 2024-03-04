import java.util.Scanner;

public class ProductCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept five numbers from the user
        double[] numbers = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        // Calculate the product using recursion
        double result = calculateProductRecursive(numbers, 0);

        // Display the result
        System.out.println("The product of the five numbers is: " + result);
    }

    private static double calculateProductRecursive(double[] numbers, int index) {
        if (index == numbers.length) {
            return 1;
        } else {
            return numbers[index] * calculateProductRecursive(numbers, index + 1);
        }
    }
}