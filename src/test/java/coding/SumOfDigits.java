// Step 1: Define the class 'SumOfDigits'
package coding;

public class SumOfDigits {

    // Step 2: Define the method to calculate sum of digits
    public static int sumOfDigits(int num) {
        int sum = 0;

        // Step 3: Loop through each digit
        while (num > 0) {
            sum += num % 10; // Extract last digit and add to sum
            num /= 10; // Remove last digit
        }
        return sum;
    }

    // Step 4: Main method
    public static void main(String[] args) {
        System.out.println(sumOfDigits(123)); // 6
    }
}
