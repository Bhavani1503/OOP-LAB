import math.utils.MathOperations;
import string.utils.StringOperations;

public class MathStringDemo {
    public static void main(String[] args) {
        // Math operations
        int a = 12, b = 18;
        System.out.println("GCD of " + a + " and " + b + ": " + MathOperations.gcd(a, b));
        System.out.println("Factorial of 5: " + MathOperations.factorial(5));
        
        // String operations
        String text = "Java Programming";
        System.out.println("\nOriginal string: " + text);
        System.out.println("Reversed: " + StringOperations.reverse(text));
        System.out.println("Vowel count: " + StringOperations.countVowels(text));
        System.out.println("Capitalized words: " + StringOperations.capitalizeWords("hello world"));
    }
}