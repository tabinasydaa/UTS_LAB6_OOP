package Nomor4;

//hukum Coulomb menggambarkan gaya elektrostatis antara dua benda bermuatan listrik
public class CoulombsLaw {
    //konstanta Coulomb dalam vakum (8.9875 x 10^9 N m^2/C^2)
    private static final double k = 8.9875e9;

    //menghitung gaya elektrostatis antara dua benda bermuatan
    //F = k * (|q1 * q2|) / r^2
    public static double hitungGaya(double q1, double q2, double r) {
        return k * Math.abs(q1 * q2) / Math.pow(r, 2);
    }
}