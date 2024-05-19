package Nomor4;

//hukum Kepler menggambarkan gerakan planet dalam orbit elips
public class KeplersLaw {
    //menghitung periode orbit (T) sebuah planet
    //T^2 = (4 * π^2 * r^3) / (G * M)
    public static double hitungPeriode(double r, double m) {
        double G = 6.67430e-11; // Konstanta gravitasi universal
        return Math.sqrt((4 * Math.pow(Math.PI, 2) * Math.pow(r, 3)) / (G * m));
    }
}
