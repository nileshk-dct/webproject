// Step 1: Define the class 'SwapNumbers'
package coding;

public class SwapNumbers {

    // Step 2: Define the main method
    public static void main(String[] args) {
        int a = 5, b = 10;

        // Step 3: Swap using arithmetic operations
        a = a + b;
        b = a - b;
        a = a - b;

        // Step 4: Print swapped values
        System.out.println("a: " + a + ", b: " + b);
    }
}
