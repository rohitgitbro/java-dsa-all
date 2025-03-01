/*
 * 14	Create two dimensional array of int with user given input. Display the summation of all elements of 2D array using for each loop.
 */
import java.util.*;

public class pr_14 {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the dimensions of the 2D array from the user
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Create the 2D array based on user input
        int[][] array = new int[rows][columns];

        // Get the elements of the 2D array from the user
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                array[i][j] = scanner.nextInt();
            }
        }

        // Calculate the summation of all elements using for-each loop
        int sum = 0;
        for (int[] row : array) {
            for (int element : row) {
                sum += element;
            }
        }

        // Display the summation
        System.out.println("Summation of all elements: " + sum);

        scanner.close();
    }
}
