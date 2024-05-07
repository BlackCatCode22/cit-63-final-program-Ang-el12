
// SearchComplexity.java
// Starter code for final programming assignment in CIT-63 Java Programming Spring 2024

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SearchComplexity {

    // Linear Search Method with Iteration Count
    // This method performs a linear search and also counts the iterations to find the target.
    public static int linearSearch(int[] array, int target) {
        int iterations = 0;
        for (int i = 0; i < array.length; i++) {
            iterations++;  // Increment iteration count on each loop
            if (array[i] == target) {
                System.out.println("Linear search iterations: " + iterations);
                return i;  // Return index if target is found
            }
        }
        System.out.println("Linear search iterations: " + iterations);
        return -1;  // Return -1 if target is not found
    }

    // Recursive Binary Search Method
    // This method uses recursion to perform binary search, dividing the search space in half each call.
    public static int recursiveBinarySearch(int[] array, int left, int right, int target) {
        if (right >= left) {
            int mid = left + (right - left) / 2;  // Compute mid point

            if (array[mid] == target) {
                return mid;  // Return index if target is found
            }

            if (array[mid] > target) {
                return recursiveBinarySearch(array, left, mid - 1, target);  // Search in the left sub-array
            } else {
                return recursiveBinarySearch(array, mid + 1, right, target);  // Search in the right sub-array
            }
        }
        return -1;  // Target not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int[] array = null;

        try {
            System.out.println("Enter number of elements in array:");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("The array size must be greater than 0.");
                scanner.close();
                return;
            }
            array = new int[n];  // Initialize array with user-specified size
        } catch (InputMismatchException e) {
            System.out.println("Invalid input: Please enter an integer.");
            scanner.close();
            return;
        }

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            while (!scanner.hasNextInt()) {
                scanner.next(); // Skip non-integer inputs
                System.out.println("Invalid input: Please enter an integer.");
            }
            array[i] = scanner.nextInt();  // Store each integer input in array
        }

        System.out.println("Enter target number to search:");
        while (!scanner.hasNextInt()) {
            scanner.next(); // Continue to skip non-integer inputs
            System.out.println("Invalid input: Please enter an integer.");
        }
        int target = scanner.nextInt();  // Read target integer to search for

        Arrays.sort(array);  // Sort array to prepare for binary search

        // Timing Linear Search
        long startTime = System.nanoTime();
        int linearResult = linearSearch(array, target);
        long endTime = System.nanoTime();
        System.out.println((linearResult == -1) ? "Target not found by linear search." :
                "Target found by linear search at index: " + linearResult);
        System.out.println("Linear search took: " + (endTime - startTime) + " nanoseconds");

        // Timing Recursive Binary Search
        startTime = System.nanoTime();
        int recursiveResult = recursiveBinarySearch(array, 0, array.length - 1, target);
        endTime = System.nanoTime();
        System.out.println((recursiveResult == -1) ? "Target not found by recursive binary search." :
                "Target found by recursive binary search at index: " + recursiveResult);
        System.out.println("Recursive binary search took: " + (endTime - startTime) + " nanoseconds");

        scanner.close();  // Close scanner to free resources
    }
}