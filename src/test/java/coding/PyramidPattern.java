// Step 1: Define the class 'PyramidPattern'
package coding;

public class PyramidPattern {

    // Step 2: Define the method to print a pyramid
    public static void printPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // Step 3: Print spaces
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Step 4: Print stars
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Step 5: Main method
    public static void main(String[] args) {
        printPyramid(5);
    }
}
