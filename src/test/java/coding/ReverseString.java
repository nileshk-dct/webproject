// Step 1: Define the package
package coding;

// Step 2: Define the class 'ReverseString'
public class ReverseString {

    // Step 3: Define a method to reverse the string
    public static String reverse(String str) {
        String reversed = "";

        // Step 4: Iterate the string from the last character to the first
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    // Step 5: Main method to test the function
    public static void main(String[] args) {
        // Step 6: Print reversed strings
        System.out.println(reverse("Java")); // "avaJ"
        System.out.println(reverse("Coding")); // "gnidoC"
    }
}
