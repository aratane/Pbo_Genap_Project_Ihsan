package PreTest_PboGenap_Ihsan.Rumus;
import java.util.Scanner;
public class layangLayang {
    int sisiA, sisiB, sisiC, sisiD, keliling;
    double luas, diagonalSatu, diagonalDua;
    public void hit_luas() {
        luas = diagonalSatu * diagonalDua * 0.5;
        System.out.println("Luas Layang - layang adalah : "+luas);
    }
    public void hit_keliling() {
        keliling = sisiA + sisiB + sisiC + sisiD;
        System.out.println("Keliling Layang - layang adalah : "+keliling);
    }
    public void inputan() {
        Scanner layang = new Scanner(System.in);
        System.out.println("Kalkulator menghitung luas dan keliling Layang - layang : ");
        System.out.println("Hitung Luas : ");
        System.out.println("Masukan diagonal satu : ");
        diagonalSatu = layang.nextDouble();
        System.out.println("Masukan diagonal dua : ");
        diagonalDua = layang.nextDouble();
        System.out.println("Hitung Keliling : ");
        System.out.println("Masukan sisi A : ");
        sisiA = layang.nextInt();
        System.out.println("Masukan sisi B : ");
        sisiB = layang.nextInt();
        System.out.println("Masukan sisi C : ");
        sisiC = layang.nextInt();
        System.out.println("Masukan sisi D : ");
        sisiD = layang.nextInt();
    }
}
