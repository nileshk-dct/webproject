// Step 1: Import required package
package coding;

import java.util.Arrays;

// Step 2: Define the class 'Anagram'
public class Anagram {

    // Step 3: Define the method to check for anagram
    public static boolean isAnagram(String s1, String s2) {
        // Step 4: Convert both strings to character arrays
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        // Step 5: Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 6: Compare the sorted arrays
        return Arrays.equals(arr1, arr2);
    }

    // Step 7: Main method
    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent")); // true
        System.out.println(isAnagram("hello", "world"));   // false
    }
}
