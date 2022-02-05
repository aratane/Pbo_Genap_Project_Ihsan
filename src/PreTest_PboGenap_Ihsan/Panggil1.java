package PreTest_PboGenap_Ihsan;

import java.util.Scanner;
import PreTest_PboGenap_Ihsan.Rumus.lingkaran;
import PreTest_PboGenap_Ihsan.Rumus.persegi;
import PreTest_PboGenap_Ihsan.Rumus.persegiPanjang;
import PreTest_PboGenap_Ihsan.Rumus.segitiga;
import PreTest_PboGenap_Ihsan.Rumus.jajarGenjang;
import PreTest_PboGenap_Ihsan.Rumus.belahKetupat;
import PreTest_PboGenap_Ihsan.Rumus.layangLayang;
import PreTest_PboGenap_Ihsan.Rumus.trapesium;

public class Panggil1 {
    int noRumus;
    String jawab;
    boolean running = true;
    Scanner ling = new Scanner(System.in);
    void Pemanggilan() {
        System.out.println("Kalkulator hitung luas dan keliling "+Thread.currentThread().getName());
        System.out.println("===================================");
        System.out.println("Daftar rumus : ");
        System.out.println("1. Lingkaran");
        System.out.println("2. Segitiga");
        System.out.println("3. Persegi");
        System.out.println("4. Persegi Panjang");
        System.out.println("5. Jajar Genjang");
        System.out.println("6. Belah Ketupat");
        System.out.println("7. Layang - layang");
        System.out.println("8. Trapesium");
        System.out.println("Masukan nomor rumus yang ingin anda hitung : ");
        noRumus = ling.nextInt();

        if (noRumus ==  1) {
            lingkaran lucu = new lingkaran();
            lucu.inputanku();
            lucu.hit_Luas();
            lucu.hit_Keliling();
            System.out.println("=============================== ");

        }else if (noRumus == 2) {
            segitiga gemoi = new segitiga();
            gemoi.inputan();
            gemoi.hit_Luas();
            gemoi.hit_Keliling();
            System.out.println("===============================");
        } else if (noRumus == 3) {
            persegi kawai = new persegi();
            kawai.inputan();
            kawai.hit_luas();
            kawai.hit_keliling();
            System.out.println("===============================");
        } else if (noRumus == 4) {
            persegiPanjang doita = new persegiPanjang();
            doita.inputan();
            doita.hit_luas();
            doita.hit_keliling();
            System.out.println("===============================");
        } else if (noRumus == 5) {
            jajarGenjang jagen = new jajarGenjang();
            jagen.inputan();
            jagen.hit_luas();
            jagen.hit_keliling();
            System.out.println("===============================");
        } else if (noRumus == 6) {
            belahKetupat tupat = new belahKetupat();
            tupat.inputan();
            tupat.hit_luas();
            tupat.hit_keliling();
            System.out.println("===============================");
        } else if (noRumus == 7) {
            layangLayang layang = new layangLayang();
            layang.inputan();
            layang.hit_luas();
            layang.hit_keliling();
        } else if (noRumus == 8) {
            trapesium trap = new trapesium();
            trap.inputan();
            trap.hit_luas();
            trap.hit_keliling();
        }

        System.out.println("Apakah anda mau memilih rumus lagi?? [ya/tidak]");
        while (running) {
            jawab = ling.nextLine();
            if (jawab.equalsIgnoreCase("tidak")) {
                try {
                    System.out.println("Terimakasih telah menggunakan kalkulator ini");
                    System.out.println("Semoga bermanfaat");
                    System.out.println("Best Regards @Ihsan");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println("@Copyright -ArataDev");
                    System.out.println("Jadikan Source Code ini untuk referensi belajar saja");
                    System.out.println("Dilarang untuk merecode source ini");
                    /*
                    UU Nomor 28 tahun 2014 tentang Hak Cipta !!
                     */
                }
                System.out.println("Bye bye ~~");
                running = false;
            } else if (jawab.equalsIgnoreCase("ya")) {
                Pemanggilan();
            }
        }
    }
}
