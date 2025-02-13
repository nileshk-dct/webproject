// Step 1: Define the package
package coding;

// Step 2: Define the class 'Fibonacci'
public class Fibonacci {

    // Step 3: Define the recursive method to get Fibonacci numbers
    public static int fibonacci(int n) {
        // Step 4: Base conditions
        return (n <= 1) ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Step 5: Main method
    public static void main(String[] args) {
        // Step 6: Test the Fibonacci function
        System.out.println(fibonacci(7)); // 13
        System.out.println(fibonacci(5)); // 5
    }
}
