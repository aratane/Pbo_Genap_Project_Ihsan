package PreTest_PboGenap_Ihsan.Rumus;
import java.util.Scanner;
public class belahKetupat {
    int sisi, keliling;
    double diagonalSatu, diagonalDua, luas;

    public void hit_luas() {
        luas = diagonalSatu * diagonalDua * 0.5;
        System.out.println("Luas Belah ketupat adalah : "+luas);
    }
    public void hit_keliling() {
        keliling = 4 * sisi;
        System.out.println("keliling Belah ketupat adalah : "+keliling);
    }
    public void inputan() {
        Scanner kupat = new Scanner(System.in);
        System.out.println("Kalkulator menghitung luas dan keliling Belah ketupat : ");
        System.out.println("Masukan panjang sisi : ");
        sisi = kupat.nextInt();
        System.out.println("Masukan diagonal satu : ");
        diagonalSatu = kupat.nextDouble();
        System.out.println("Masukan diagonal dua : ");
        diagonalDua = kupat.nextDouble();
    }
}
