package dua;
public class Palindrome {

    // Method untuk mengecek apakah sebuah string adalah palindrome
    public static boolean isPalindrome(String str) {
        // Mengubah string menjadi lowercase untuk memudahkan perbandingan
        str = str.toLowerCase();

        // Inisialisasi pointer untuk karakter pertama dan terakhir
        int start = 0;
        int end = str.length() - 1;

        // Loop untuk membandingkan karakter dari depan dan belakang
        while (start < end) {
            // Jika karakter tidak sama, maka bukan palindrome
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            // Pindahkan pointer ke karakter berikutnya
            start++;
            end--;
        }

        // Jika seluruh karakter cocok, maka string adalah palindrome
        return true;
    }
}