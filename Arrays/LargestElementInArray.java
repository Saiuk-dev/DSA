// Program to find the largest element in an array
// Author: Sairaj Ukarande (or your GitHub username)
// Date: 2025-07-11

public class LargestElementInArray {

    // Returns the largest element from the given integer array
    public static int findLargestElement(int[] nums) {
        // Handle edge cases where array is null or empty
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        // Assume the first element is the largest initially
        int max = nums[0];

        // Traverse the array to find the maximum element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i]; // Update max if current element is greater
            }
        }

        return max; // Return the largest value found
    }

    // Main method to run and test the logic
    public static void main(String[] args) {
        // Example array to test the function
        int[] nums = {8, 9, 4, 5, 7, 4, 7, 9, 6, 4, 3};

        // Find and print the largest element
        int largest = findLargestElement(nums);
        System.out.println("The largest element of the array is: " + largest);
    }
}


