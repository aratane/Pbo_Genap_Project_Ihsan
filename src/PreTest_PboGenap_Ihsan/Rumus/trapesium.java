package PreTest_PboGenap_Ihsan.Rumus;
import java.util.Scanner;
public class trapesium {
    int sisiPanjang, sisiPendek, tinggi, sisiMiringSatu, sisiMiringDua;
    double luas, keliling;

    public void hit_luas() {
        luas = (sisiPanjang + sisiPendek) * tinggi / 2;
        System.out.println("Luas Trapesium adalah : "+luas);
    }
    public void hit_keliling() {
        keliling = sisiPanjang + sisiPendek + sisiMiringSatu + sisiMiringDua;
        System.out.println("Keliling Trapesium adalah : "+keliling);
    }
    public void inputan() {
        Scanner trape = new Scanner(System.in);
        System.out.println("Kalkulator menghitung luas dan keliling Trapesium : ");
        System.out.println("Hitung Luas : ");
        System.out.println("Sisi panjang : ");
        sisiPanjang = trape.nextInt();
        System.out.println("Sisi pendek : ");
        sisiPendek = trape.nextInt();
        System.out.println("Tinggi : ");
        tinggi = trape.nextInt();
        System.out.println("Hitung Keliling : ");
        System.out.println("Sisi miring satu : ");
        sisiMiringSatu = trape.nextInt();
        System.out.println("Sisi miring dua : ");
        sisiMiringDua = trape.nextInt();
    }
}
