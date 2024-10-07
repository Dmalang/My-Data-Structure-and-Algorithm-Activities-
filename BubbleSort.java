import java.util.Scanner;

public class BubbleSort{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the number of elements in the array
        System.out.print("Enter number of an array: ");
        int n = scanner.nextInt();
        
        // Create an array of the specified size
        int[] arr = new int[n];
        
        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
       
        
        // Call the bubbleSort method to sort the array
        bubbleSort(arr);
        
        // Print the sorted array after applying Bubble Sort
        System.out.print("Sorted Array in Ascending Order: ");
        printArray(arr);
        
        // Close the scanner
        scanner.close();
    }

    // Method to perform Bubble Sort on the array
    public static void bubbleSort(int[] arr) {
        int n = arr.length; // Get the length of the array
        
        // Outer loop for each pass over the array
        for (int i = 0; i < n - 1; i++) {
            // Inner loop to compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                // Check if the current element is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to print the array elements
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Print a newline after the array
    }
}
