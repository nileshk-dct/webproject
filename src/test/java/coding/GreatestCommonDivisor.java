// Step 1: Define the class 'GCD'
package coding;

public class GreatestCommonDivisor  {

    // Step 2: Define the method using recursion
    public static int findGCD(int a, int b) {
        return (b == 0) ? a : findGCD(b, a % b);
    }

    // Step 3: Main method
    public static void main(String[] args) {
        System.out.println(findGCD(48, 18)); // 6
    }
}
