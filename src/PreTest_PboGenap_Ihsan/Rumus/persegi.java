package PreTest_PboGenap_Ihsan.Rumus;
import java.util.Scanner;
public class persegi {
    int sisi, luas, keliling;

    public void hit_luas() {
        luas = sisi * sisi;
        System.out.println("===================================");
        System.out.println("Luas Persegi adalah : "+luas);
        System.out.println("Penjelasan : ");
        System.out.println("Luas dihitung dengan "+ sisi + " dikali "+ sisi + " dan hasilnya sama dengan -"+luas);
        System.out.println("===================================");
    }
    public void hit_keliling() {
        keliling = 4 * sisi;
        System.out.println("Keliling Persegi adalah : "+keliling);
        System.out.println("Penjelasan : ");
        System.out.println("Keliling dihitung dengan 4 dikalikan "+ sisi + " dan hasilnya sama dengan "+keliling);
    }
    public void inputan() {
        Scanner ambo = new Scanner(System.in);
        System.out.println("Kalkulator menghitung luas dan keliling Persegi : ");
        System.out.println("Masukan sisi : ");
        sisi = ambo.nextInt();
    }
}
