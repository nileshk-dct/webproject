// Step 1: Define the class 'PowerOfNumber'
package coding;

public class PowerOfNumber {

    // Step 2: Define the method to calculate power
    public static int power(int base, int exp) {
        int result = 1;

        // Step 3: Multiply base exp times
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }

    // Step 4: Main method
    public static void main(String[] args) {
        System.out.println(power(2, 3)); // 8
    }
}
