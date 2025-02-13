// Step 1: Define the class 'PrimeNumber'
package coding;

public class PrimeNumber {

    // Step 2: Define the method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false; // Step 3: 0 and 1 are not prime

        // Step 4: Loop from 2 to sqrt(num) to check divisibility
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Step 5: Main method
    public static void main(String[] args) {
        System.out.println(isPrime(7)); // true
        System.out.println(isPrime(10)); // false
    }
}
