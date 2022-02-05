package PreTest_PboGenap_Ihsan.Rumus;

import java.util.Scanner;

public class jajarGenjang {
    int sisiAlas, sisiMiring, tinggi, luas, keliling;

    public void hit_luas() {
        luas = sisiAlas * tinggi;
        System.out.println("Luas Jajar genjang adalah : "+luas);
    }
    public void hit_keliling() {
        keliling = 2 * (sisiAlas + sisiMiring);
        System.out.println("Keliling Jajar genjang adalah : "+keliling);
    }
    public void inputan() {
        Scanner jargen = new Scanner(System.in);
        System.out.println("Kalkulator menghitung luas dan keliling Jajar genjang : ");
        System.out.println("Masukan tinggi : ");
        tinggi = jargen.nextInt();
        System.out.println("Masukan sisi Alas : ");
        sisiAlas = jargen.nextInt();
        System.out.println("Masukan sisi Miring : ");
        sisiMiring = jargen.nextInt();
    }
}
