package pboif2.pkg10119052.latihan27.hurufbesarkecil;
import java.util.Scanner;
/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan perubahan
 * huruf secara acak menjadi besar kapital dan kecil menggunakan metode string
 * uppercase dan lowercase
 * 
 */
public class PBOIF210119052Latihan27HurufBesarKecil {

    public static void main(String[] args) {
        Scanner teks = new Scanner(System.in);
        String kalimat,besar,kecil;
        System.out.print("Masukkan Kalimat : ");
        kalimat = teks.nextLine();
        besar = kalimat.toUpperCase();
        kecil = kalimat.toLowerCase();
        System.out.println();
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : "+besar);
        System.out.println("Huruf Kecil : "+kecil);
    }
    
}
