// Step 1: Define the class 'SecondLargest'
package coding;

public class SecondLargest {

    // Step 2: Define the method to find second largest number
    public static int findSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        // Step 3: Loop through the array
        for (int num : arr) {
            if (num > first) { // Step 4: Update first and second
                second = first;
                first = num;
            } else if (num > second && num != first) { // Step 5: Update second
                second = num;
            }
        }
        return second;
    }

    // Step 6: Main method
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 8, 5};
        System.out.println(findSecondLargest(arr)); // 7
    }
}
