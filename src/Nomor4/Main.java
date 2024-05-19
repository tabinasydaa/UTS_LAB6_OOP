package Nomor4;

public class Main {
    public static void main(String[] args) {
        // Contoh penggunaan Hukum Coulomb
        double q1 = 1.5e-6; // muatan pertama dalam coulomb
        double q2 = -2.5e-6; // muatan kedua dalam coulomb
        double r = 0.1; // jarak dalam meter
        double gaya = CoulombsLaw.hitungGaya(q1, q2, r);
        System.out.println("Gaya antara dua muatan: " + gaya + " N");

        // Contoh penggunaan Hukum Ohm
        double tegangan = 12; // tegangan dalam volt
        double arus = 2; // arus dalam ampere
        double hambatan = OhmsLaw.hitungHambatan(tegangan, arus);
        System.out.println("Hambatan dalam rangkaian: " + hambatan + " ohm");

        // Contoh penggunaan Hukum Kepler
        double rPlanet = 1.5e11; // jarak planet dari matahari dalam meter
        double mPlanet = 5.97e24; // massa planet dalam kilogram
        double periode = KeplersLaw.hitungPeriode(rPlanet, mPlanet);
        System.out.println("Periode orbit planet: " + periode + " detik");
    }
}