import java.util.Scanner;

public class Kegiatan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String usernameAdmin = "Admin100";
        String passwordAdmin = "password 123";
        String namaMahasiswa = "Rifky Septian Kusuma";
        String nimMahasiswa = "202410370110351";

        //Menampilkan menu pilihan
        System.out.println("=== Sistem Login Sederhana ===");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Pilih jenis login (1/2): ");
        int pilihan = input.nextInt();
        input.nextLine();

        //Proses login admin
        if (pilihan == 1) {
            System.out.print("Masukkan Username: ");
            String username = input.nextLine();
            System.out.print("Masukkan Password: ");
            String password = input.nextLine();

            if (username.equals(usernameAdmin) && password.equals(passwordAdmin)) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }

            //Proses login mahasiswa
        } else if (pilihan == 2) {
            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = input.nextLine();

            if (nama.equals(namaMahasiswa) && nim.equals(nimMahasiswa)) {
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}
