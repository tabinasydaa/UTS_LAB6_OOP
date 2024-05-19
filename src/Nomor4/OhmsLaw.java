package Nomor4;

//hukum Ohm menggambarkan hubungan antara tegangan, arus, dan hambatan dalam sirkuit listrik
public class OhmsLaw {
    //menghitung tegangan (V) dalam sirkuit listrik
    //V = I * R
    public static double hitungTegangan(double arus, double hambatan) {
        return arus * hambatan;
    }

    //menghitung arus (I) dalam sirkuit listrik
    //I = V / R
    public static double hitungArus(double tegangan, double hambatan) {
        return tegangan / hambatan;
    }

    //menghitung hambatan (R) dalam sirkuit listrik
    //R = V / I
    public static double hitungHambatan(double tegangan, double arus) {
        return tegangan / arus;
    }
}