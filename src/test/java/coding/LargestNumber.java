// Step 1: Define the class 'LargestNumber'
package coding;

public class LargestNumber {

    // Step 2: Define the method to find the largest number
    public static int findLargest(int[] arr) {
        int max = arr[0];

        // Step 3: Loop through the array
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    // Step 4: Main method
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 8, 5};

        // Step 5: Print the largest number
        System.out.println(findLargest(arr)); // 8
    }
}
