import java.util.Scanner;
import java.time.LocalDate;

public class codelab {
    public static void main(String[] args){
        // Deklarasi variabel untuk menyimpan data pengguna
        String nama;
        int tahunlahir, umur;
        LocalDate today = LocalDate.now(); // Mendapatkan tanggal saat ini

        String gender, genderfull;

        // Membuat objek scanner untuk input dari pengguna
        Scanner scan = new Scanner(System.in);
        System.out.print("masukan nama anda : ");
        nama = scan.nextLine(); // Membaca input nama

        System.out.print("masukan gender :(l/p) ");
        gender = scan.nextLine(); // Membaca input gender

        System.out.print("masukan tahun lahir anda :");
        tahunlahir = scan.nextInt(); // Membaca input tahun lahir

        // Konversi input gender menjadi format yang lebih panjang
        switch (gender.toLowerCase()) { // Mengubah input menjadi huruf kecil agar case insensitive
            case "l":
                genderfull = "laki laki"; // Jika input "l", maka gender laki-laki
                break;
            case "p":
                genderfull = "perempuan"; // Jika input "p", maka gender perempuan
                break;
            default:
                genderfull = "tidak diketahui"; // Jika input tidak valid
        }

        // Menghitung umur berdasarkan tahun lahir dan tahun saat ini
        umur = today.getYear() - tahunlahir;

        // Menampilkan data yang telah dimasukkan
        System.out.println("DATA DIRI");
        System.out.println("nama anda adalah : " + nama);
        System.out.println("umur   anda adalah : " + umur);
        System.out.println("gender anda adalah : " + genderfull);
    }
}