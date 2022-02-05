package PreTest_PboGenap_Ihsan.Rumus;
import java.util.Scanner;

public class segitiga {
    int a, t;
    double luas, m, keliling;

    public void hit_Luas() {
        luas = 0.5 * a * t;
        System.out.println("Luas segitiga adalah : "+luas);
    }
    public void hit_Keliling() {
        m = ((a*a)+(t*t));
        keliling = a + t + m;
        System.out.println("Keliling segitiga adalah : "+keliling);
    }
    public void inputan() {
        Scanner keli = new Scanner(System.in);
        System.out.println("Kalkulator menghitung luas dan keliling segitiga : ");
        System.out.println("Masukan alas : ");
        a = keli.nextInt();
        System.out.println("Masukan tinggi : ");
        t = keli.nextInt();
    }
}
