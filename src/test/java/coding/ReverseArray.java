// Step 1: Import required package
package coding;

import java.util.Arrays;

// Step 2: Define the class 'ReverseArray'
public class ReverseArray {

    // Step 3: Define the method to reverse an array
    public static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;

        // Step 4: Swap elements from left to right
        while (left < right) {
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }

    // Step 5: Main method
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        // Step 6: Reverse the array
        reverse(arr);
        
        // Step 7: Print the reversed array
        System.out.println(Arrays.toString(arr)); // [5, 4, 3, 2, 1]
    }
}
