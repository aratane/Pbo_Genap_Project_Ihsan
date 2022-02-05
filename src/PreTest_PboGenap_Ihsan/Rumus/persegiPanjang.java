package PreTest_PboGenap_Ihsan.Rumus;
import java.util.Scanner;
public class persegiPanjang {
    int panjang, lebar, luas, keliling;

    public void hit_luas() {
        luas = panjang * lebar;
        System.out.println("Luas Persegi panjnag adalah : "+luas);
    }
    public void hit_keliling() {
        keliling = 2 * (panjang + lebar);
        System.out.println("Keliling Persegi panjang adalah : "+keliling);
    }
    public void inputan() {
        Scanner segipan = new Scanner(System.in);
        System.out.println("Kalkulator menghitung luas dan keliling Persegi panjang : ");
        System.out.println("Masukan Panjang : ");
        panjang = segipan.nextInt();
        System.out.println("Masukan Lebar : ");
        lebar = segipan.nextInt();
    }
}
