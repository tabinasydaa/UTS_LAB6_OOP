package Nomor2;

public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println("--Pengecekan Palindrome--");
        //contoh penggunaan
        String input = "Katak";
        System.out.println("Apakah \"" + input + "\" termasuk palindrome? " + Palindrome.isPalindrome(input));

        input = "Laptop";
        System.out.println("Apakah \"" + input + "\" termasuk palindrome? " + Palindrome.isPalindrome(input));

        input = "Level";
        System.out.println("Apakah \"" + input + "\" termasuk palindrome? " + Palindrome.isPalindrome(input));

        input = "Belajar";
        System.out.println("Apakah \"" + input + "\" termasuk palindrome? " + Palindrome.isPalindrome(input));
    }
}
