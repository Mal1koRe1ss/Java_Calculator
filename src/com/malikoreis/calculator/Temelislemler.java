package com.malikoreis.calculator;

public class Temelislemler {

    public static class bolme {
        public static double bol(double sayi1, double sayi2) {
            if (sayi2 == 0) {
                throw new ArithmeticException("Sifira bolunemez!");
            }
            return sayi1 / sayi2;
        }
    }
    
    public static class carpma{
        public static double carp(double sayi1, double sayi2) {
            return sayi1 * sayi2;
        }
    }
    
    public static class cikarma{
        public static double cikar(double sayi1, double sayi2) {
            return sayi1 - sayi2;
        }
    }
    
    public static class toplama {
        public static double topla(double sayi1, double sayi2) {
            return sayi1 + sayi2;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Temelislemler sinifi test ediliyor...");
    }
}
