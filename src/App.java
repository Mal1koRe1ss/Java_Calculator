import com.malikoreis.calculator.Digerislemler;
import com.malikoreis.calculator.Temelislemler;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Temel Islemler");
            System.out.println("2 - Gelismis Islemler");
            System.out.println("3 - Cikis");
            System.out.print("Lutfen yapacaginiz islemi seciniz: ");
            int input = Integer.parseInt(sc.nextLine());

            switch (input) {
                case 1:
                    // Temel işlemler
                    System.out.println("1 - Toplama");
                    System.out.println("2 - Cikarma");
                    System.out.println("3 - Carpma");
                    System.out.println("4 - Bolme");
                    System.out.print("Lutfen yapacaginiz islemi seciniz: ");
                    int input_ti = Integer.parseInt(sc.nextLine());

                    switch (input_ti) {
                        case 1:
                            System.out.print("Birinci sayiyi girin: ");
                            double t_sayi1 = Double.parseDouble(sc.nextLine());
                            
                            System.out.print("Ikinci sayiyi girin: ");
                            double t_sayi2 = Double.parseDouble(sc.nextLine());
                            
                            System.out.println("Sonuc: " + Temelislemler.toplama.topla(t_sayi1, t_sayi2));
                            bekleVeTemizle(sc);
                            break;
                        case 2:
                            System.out.print("Birinci sayiyi girin: ");
                            double c_sayi1 = Double.parseDouble(sc.nextLine());
                            
                            System.out.print("Ikinci sayiyi girin: ");
                            double c_sayi2 = Double.parseDouble(sc.nextLine());
                            
                            System.out.println("Sonuc: " + Temelislemler.cikarma.cikar(c_sayi1, c_sayi2));
                            bekleVeTemizle(sc);
                            break;
                        case 3:
                            System.out.print("Birinci sayiyi girin: ");
                            double m_sayi1 = Double.parseDouble(sc.nextLine());
                            
                            System.out.print("Ikinci sayiyi girin: ");
                            double m_sayi2 = Double.parseDouble(sc.nextLine());
                            
                            System.out.println("Sonuc: " + Temelislemler.carpma.carp(m_sayi1, m_sayi2));
                            bekleVeTemizle(sc);
                            break;
                        case 4:
                            System.out.print("Birinci sayiyi girin: ");
                            double b_sayi1 = Double.parseDouble(sc.nextLine());
                            
                            System.out.print("Ikinci sayiyi girin: ");
                            double b_sayi2 = Double.parseDouble(sc.nextLine());
                            
                            try {
                                System.out.println("Sonuc: " + Temelislemler.bolme.bol(b_sayi1, b_sayi2));
                            } catch (ArithmeticException e) {
                                System.out.println(e.getMessage());
                            }
                            bekleVeTemizle(sc);
                            break;
                        default:
                            System.out.println("HATA: Gecersiz islem numarasi");
                            bekleVeTemizle(sc);
                            break;
                    }
                    break;

                case 2:
                    System.out.println("1 - Alan (Kare, Dikdortgen, Daire, Ucgen)");
                    System.out.println("2 - Cevre (Kare, Dikdortgen, Daire, Ucgen)");
                    System.out.println("3 - Faktoriyel");
                    System.out.println("4 - Karekok");
                    int input_gi = Integer.parseInt(sc.nextLine());

                    switch (input_gi) {
                        case 1:
                            System.out.println("1 - Kare");
                            System.out.println("2 - Dikdortgen");
                            System.out.println("3 - Daire");
                            System.out.println("4 - Ucgen");
                            int input_gi_a = Integer.parseInt(sc.nextLine());
                            
                            switch (input_gi_a) {
                                case 1:
                                    System.out.print("Karenin bir kenar uzunlugunu girin: ");
                                    double input_gi_a_k = Double.parseDouble(sc.nextLine());
                                    double sonuc_gi_a_k = Digerislemler.alan.kare_alan(input_gi_a_k);
                                    System.out.println("Karenin alani: " + sonuc_gi_a_k);
                                    bekleVeTemizle(sc);
                                    break;
                                case 2:
                                    System.out.print("Dikdortgenin kisa kenar uzunlugunu girin: ");
                                    double input_gi_a_d_k = Double.parseDouble(sc.nextLine());

                                    System.out.print("Dikdortgenin uzun kenar uzunlugunu girin: ");
                                    double input_gi_a_d_u = Double.parseDouble(sc.nextLine());
                                    double sonuc_gi_a_d = Digerislemler.alan.diktortgen_alan(input_gi_a_d_k, input_gi_a_d_u);
                                    System.out.println("Dikdortgenin alani: " + sonuc_gi_a_d);
                                    bekleVeTemizle(sc);
                                    break;
                                case 3:
                                    System.out.print("Dairenin yaricap uzunlugunu girin: ");
                                    double input_gi_a_s = Double.parseDouble(sc.nextLine());
                                    double sonuc_gi_a_s = Digerislemler.alan.daire_alan(input_gi_a_s);
                                    System.out.println("Dairenin alani: " + sonuc_gi_a_s);
                                    bekleVeTemizle(sc);
                                    break;
                                case 4:
                                    System.out.print("Ucgenin taban uzunlugunu girin: ");
                                    double input_gi_a_u_t = Double.parseDouble(sc.nextLine());
                                    System.out.print("Ucgenin yuksekligini girin: ");
                                    double input_gi_a_u_y = Double.parseDouble(sc.nextLine());
                                    double sonuc_gi_a_u = Digerislemler.alan.ucgen_alan(input_gi_a_u_t, input_gi_a_u_y);
                                    System.out.println("Ucgenin alani: " + sonuc_gi_a_u);
                                    bekleVeTemizle(sc);
                                    break;
                                default:
                                    System.out.println("HATA: Gecersiz sekil secimi");
                                    bekleVeTemizle(sc);
                                    break;
                            }
                            break;

                        case 2:
                            System.out.println("1 - Kare");
                            System.out.println("2 - Dikdortgen");
                            System.out.println("3 - Daire");
                            System.out.println("4 - Ucgen");
                            int input_gi_c = Integer.parseInt(sc.nextLine());
                            
                            switch (input_gi_c) {
                                case 1:
                                    System.out.print("Karenin bir kenar uzunlugunu girin: ");
                                    double kenar_uzunlugu = Double.parseDouble(sc.nextLine());
                                    double kare_cevre = Digerislemler.cevre.kare_cevre(kenar_uzunlugu);
                                    System.out.println("Karenin cevresi: " + kare_cevre);
                                    bekleVeTemizle(sc);
                                    break;
                                case 2:
                                    System.out.print("Dikdortgenin kisa kenar uzunlugunu girin: ");
                                    double dikdortgen_kisa_kenar = Double.parseDouble(sc.nextLine());
                                    System.out.print("Dikdortgenin uzun kenar uzunlugunu girin: ");
                                    double dikdortgen_uzun_kenar = Double.parseDouble(sc.nextLine());
                                    double dikdortgen_cevre = Digerislemler.cevre.diktortgen_cevre(dikdortgen_kisa_kenar, dikdortgen_uzun_kenar);
                                    System.out.println("Dikdortgenin cevresi: " + dikdortgen_cevre);
                                    bekleVeTemizle(sc);
                                    break;
                                case 3:
                                    System.out.print("Dairenin yaricap uzunlugunu girin: ");
                                    double daire_yaricap = Double.parseDouble(sc.nextLine());
                                    double daire_cevre = Digerislemler.cevre.daire_cevre(daire_yaricap);
                                    System.out.println("Dairenin cevresi: " + daire_cevre);
                                    bekleVeTemizle(sc);
                                    break;
                                case 4:
                                    System.out.print("Ucgenin birinci kenar uzunlugunu girin: ");
                                    double ucgen_kenar1 = Double.parseDouble(sc.nextLine());
                                    System.out.print("Ucgenin ikinci kenar uzunlugunu girin: ");
                                    double ucgen_kenar2 = Double.parseDouble(sc.nextLine());
                                    System.out.print("Ucgenin ucuncu kenar uzunlugunu girin: ");
                                    double ucgen_kenar3 = Double.parseDouble(sc.nextLine());
                                    double ucgen_cevre = Digerislemler.cevre.ucgen_cevre(ucgen_kenar1, ucgen_kenar2, ucgen_kenar3);
                                    System.out.println("Ucgenin cevresi: " + ucgen_cevre);
                                    bekleVeTemizle(sc);
                                    break;
                                default:
                                    System.out.println("HATA: Gecersiz sekil secimi");
                                    bekleVeTemizle(sc);
                                    break;
                            }
                            break;

                        case 3:
                            System.out.print("Faktoriyelini hesaplamak istediginiz sayiyi girin: ");
                            int faktoriyel_input = Integer.parseInt(sc.nextLine());
                            
                            try {
                                double faktoriyel_sonuc = Digerislemler.faktoriyel(faktoriyel_input);
                                System.out.println(faktoriyel_input + "! = " + faktoriyel_sonuc);
                            } catch (IllegalArgumentException e) {
                                System.out.println(e.getMessage());
                            }
                            bekleVeTemizle(sc);
                            break;

                        case 4:
                            System.out.print("Karekoku hesaplanacak sayiyi girin: ");
                            double karekok_input = Double.parseDouble(sc.nextLine());
                            
                            try {
                                double karekok_sonuc = Digerislemler.karekok(karekok_input);
                                System.out.println(karekok_input + "'nin karekoku: " + karekok_sonuc);
                            } catch (IllegalArgumentException e) {
                                System.out.println(e.getMessage());
                            }
                            bekleVeTemizle(sc);
                            break;

                        default:
                            System.out.println("HATA: Gecersiz islem numarasi");
                            bekleVeTemizle(sc);
                            break;
                    }
                    break;

                case 3:
                    System.out.println("Cikis yapiliyor...");
                    sc.close();
                    return;

                default:
                    System.out.println("HATA: Gecersiz islem numarasi");
                    bekleVeTemizle(sc);
                    break;
            }
        }
    }

    public static void bekleVeTemizle(Scanner sc) {
        try {
            Thread.sleep(3000); // 3 saniye bekleme
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Konsolu temizleme
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) {
            // Windows için
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (IOException | InterruptedException e) {
                System.err.println("HATA: Konsolu temizleme islemi basarisiz.");
            }
        } else {
            // Unix tabanlı sistemler için (Linux, macOS)
            try {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            } catch (IOException | InterruptedException e) {
                System.err.println("HATA: Konsolu temizleme islemi basarisiz.");
            }
        }
    }
}
