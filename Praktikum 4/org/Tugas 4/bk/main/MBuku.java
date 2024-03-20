package bk.main;
import bk.bukuFiksi.*;
import bk.bukunonFiksi.*;

public class MBuku {
    public static void main(String[] args) {
        bukuFiksi buku1 = new bukuFiksi("Snow White", "Red Spark", "1990", "fantasy", 100, 20500);
        System.out.println("------Informasi Buku Fiksi------");
        buku1.view();

        bukuNonFiksi buku2 = new bukuNonFiksi("Ilmu Pengetahuan dan Anak-anak", "Suci Irawati", "2020", "Sains", 65, 50000);
        System.out.println("\n------Informasi Buku NonFiksi-----");
        buku2.view();

        bukuNovel bukuNovel = new bukuNovel("Mencari Cinta Sejati", "Ilya Andrea", "2021", "romance", 240, 60700);
        System.out.println("\n------Informasi Buku Novel------");
        bukuNovel.view();

        bukuAkademik bukuAkademik = new bukuAkademik("Hukum dan Dunia", "Salim Andrea", "2021", "Sosial Humaniora", 200, 20500);
        System.out.println("\n------Informasi Buku Novel------");
        bukuAkademik.view();
    }
}
