import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.println("Masukkan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " +sisi+" satuan adalah "+bs.hitungLuas(sisi));
    }
}

/*tidak bisa memproses method dan tidak mengeluarkan
apapun yang ada di BujurSangkar karena
superclass nya tidak memuat implementasi dari method hitung luas
harus diimplementasi di setiap subclass dari superclass BangunDatar*/