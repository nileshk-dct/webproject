// Step 1: Define the package
package coding;

// Step 2: Define the class 'Factorial'
public class Factorial {

    // Step 3: Define the recursive method for factorial calculation
    public static int factorial(int n) {
        // Step 4: Base condition - if n is 0, return 1
        return (n == 0) ? 1 : n * factorial(n - 1);
    }

    // Step 5: Main method
    public static void main(String[] args) {
        // Step 6: Test with a sample number
        System.out.println(factorial(5)); // 120
        System.out.println(factorial(3)); // 6
    }
}
