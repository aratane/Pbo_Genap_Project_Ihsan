package PreTest_PboGenap_Ihsan.Rumus;

import java.util.Scanner;

public class lingkaran {
    double luas, r, k, phi = 3.14;

    public void hit_Luas() {
        luas = phi * r * r;
        System.out.println("Luas Lingkaran adalah : "+luas);
    }

    public void hit_Keliling() {
        k = 2 * phi * r;
        System.out.println("keliling lingkaran adalah : "+k);
    }
    public void inputanku() {
        Scanner lu = new Scanner(System.in);
        System.out.println("Kalkulator menghitung luas dan keliling lingkaran : ");
        System.out.println("Masukan jari-Jari : ");
        r = lu.nextDouble();
    }
}
