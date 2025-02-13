// Step 1: Define the class 'EvenOdd'
package coding;

public class EvenOdd {

    // Step 2: Define the method to check even or odd
    public static String checkEvenOdd(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }

    // Step 3: Main method
    public static void main(String[] args) {
        System.out.println(checkEvenOdd(8)); // Even
        System.out.println(checkEvenOdd(7)); // Odd
    }
}
