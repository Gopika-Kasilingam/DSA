//Java program for finding maximum and minimum element in an array

import java.util.Scanner;

public class MinMaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");

        // Input array elements from the user
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        
        scanner.close();

        // Initialize min and max with the first element of the array
        int min = array[0];
        int max = array[0];

        // Iterate through the array to find min and max
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }
}
