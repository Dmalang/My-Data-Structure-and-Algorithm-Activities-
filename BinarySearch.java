import java.util.Scanner;

public class BinarySearch {
    
    // Method to perform binary search
    public static int binarySearch(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is at mid
            if (arr[mid] == target)
                return mid;

            // If the target is greater, ignore the left half
            if (arr[mid] < target)
                left = mid + 1;

            // If the target is smaller, ignore the right half
            else
                right = mid - 1;
        }
        // Target not found
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of an array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input: array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input: target element to search for
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();

        // Perform binary search
        int result = binarySearch(arr, 0, n - 1, target);

        // Output the result
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        sc.close();
    }
                  }
