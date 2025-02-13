package coding;
public class StringMethodsExample {
    public static void main(String[] args) {
        // 1. .length() - Returns string length
        String str1 = "Java";
        System.out.println("Length of 'Java': " + str1.length()); // Output: 4

        // 2. .charAt(index) - Returns character at the given index
        System.out.println("Character at index 2: " + str1.charAt(2)); // Output: 'v'

        // 3. .toUpperCase() - Converts string to uppercase
        System.out.println("Uppercase: " + str1.toUpperCase()); // Output: "JAVA"

        // 4. .toLowerCase() - Converts string to lowercase
        String str2 = "JAVA";
        System.out.println("Lowercase: " + str2.toLowerCase()); // Output: "java"

        // 5. .substring(start, end) - Extracts part of a string
        String str3 = "Hello";
        System.out.println("Substring (0,4): " + str3.substring(0, 4)); // Output: "Hell"

        // 6. .replace("a", "o") - Replaces characters in a string
        System.out.println("Replacing 'a' with 'o' in Java: " + str1.replace("a", "o")); // Output: "Jovo"

        // 7. .trim() - Removes extra spaces before and after a string
        String str4 = " Java ";
        System.out.println("Trimmed: '" + str4.trim() + "'"); // Output: "Java"

        // 8. .split(" ") - Splits a string into an array based on the given delimiter
        String str5 = "Java is fun";
        String[] words = str5.split(" ");
        System.out.println("Splitting 'Java is fun':");
        for (String word : words) {
            System.out.println(word);
        }
        // Output:
        // Java
        // is
        // fun

        // 9. .equals("text") - Compares two strings (case-sensitive)
        System.out.println("Does 'Java' equal 'java'? " + str1.equals("java")); // Output: false
    }
}
