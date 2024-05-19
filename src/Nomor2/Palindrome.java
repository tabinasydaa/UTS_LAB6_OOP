package Nomor2;
public class Palindrome {

    //method untuk mengecek apakah sebuah string adalah palindrome
    public static boolean isPalindrome(String str) {
        //mengubah string menjadi lowercase untuk memudahkan perbandingan
        str = str.toLowerCase();

        //inisialisasi pointer untuk karakter pertama dan terakhir
        int start = 0;
        int end = str.length() - 1;

        //loop untuk membandingkan karakter dari depan dan belakang
        while (start < end) {
            //jika karakter tidak sama, maka bukan palindrome
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            //pindahkan pointer ke karakter berikutnya
            start++;
            end--;
        }

        //jika seluruh karakter cocok, maka string adalah palindrome
        return true;
    }
}