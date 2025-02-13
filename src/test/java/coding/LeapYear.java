// Step 1: Define the class 'LeapYear'
package coding;

public class LeapYear {

    // Step 2: Define the method to check leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Step 3: Main method
    public static void main(String[] args) {
        System.out.println(isLeapYear(2024)); // true
        System.out.println(isLeapYear(2023)); // false
    }
}
