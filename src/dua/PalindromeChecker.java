package dua;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Contoh penggunaan
        String input = "Katak";
        System.out.println("Apakah \"" + input + "\" adalah palindrome? " + Palindrome.isPalindrome(input));

        input = "Laptop";
        System.out.println("Apakah \"" + input + "\" adalah palindrome? " + Palindrome.isPalindrome(input));

        input = "Level";
        System.out.println("Apakah \"" + input + "\" adalah palindrome? " + Palindrome.isPalindrome(input));

        input = "Belajar";
        System.out.println("Apakah \"" + input + "\" adalah palindrome? " + Palindrome.isPalindrome(input));
    }
}
