package com.malikoreis.calculator;

public class Digerislemler {

    public static final double PI = 3.14;

    public static class alan {
        public static double kare_alan(double kenar) {
            return kenar * kenar;
        }

        public static double diktortgen_alan(double kisa_kenar, double uzun_kenar) {
            return (kisa_kenar * uzun_kenar);
        }

        public static double ucgen_alan(double taban, double yukseklik) {
            return (taban * yukseklik) / 2;
        }

        public static double daire_alan(double yaricap) {
            return yaricap * yaricap * PI;
        }
    }

    public static class cevre {
        public static double kare_cevre(double kenar) {
            return kenar * 4;
        }

        public static double diktortgen_cevre(double kisa_kenar, double uzun_kenar) {
            return 2 * (kisa_kenar + uzun_kenar);
        }

        public static double ucgen_cevre(double kenar1, double kenar2, double kenar3) {
            return kenar1 + kenar2 + kenar3;
        }

        public static double daire_cevre(double yaricap) {
            return (PI * 2) * yaricap;
        }
    }

    public static double faktoriyel(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negatif sayilarin faktoriyeli tanimsizdir!");
        }
        if (n == 0) {
            return 1;
        } else {
            return n * faktoriyel(n - 1);
        }
    }

    public static double karekok(double sayi) {
        if (sayi < 0) {
            throw new IllegalArgumentException("Negatif sayilarin karekoku tanimsizdir!");
        }

        double tahmin = sayi;
        double epsilon = 0.00001;

        while (Math.abs(tahmin * tahmin - sayi) > epsilon) {
            tahmin = (tahmin + sayi / tahmin) / 2;
        }

        return tahmin;
    }

    public static void main(String[] args) {
        System.out.println("Digerislemler sinifi test ediliyor...");
    }
}
