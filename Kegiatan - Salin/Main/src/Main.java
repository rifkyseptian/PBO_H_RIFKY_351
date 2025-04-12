import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Admin {
    String username = "Admin351";
    String password = "Password351";

    void login(String user, String pass) {
        if (user.equals(username) && pass.equals(password)) {
            System.out.println("Login Admin berhasil!");
            tampilkanWaktuLogin();
        } else {
            System.out.println("Login gagal! Username atau password salah.");
        }
    }

    void tampilkanWaktuLogin() {
        LocalDateTime waktu = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Waktu login: " + waktu.format(format));
    }
}

class Mahasiswa {
    String nama = "RIFKY SEPTIAN KUSUMA";
    String nim = "202410370110351";

    void login(String inputNama, String inputNim) {
        if (inputNama.equalsIgnoreCase(nama) && inputNim.equals(nim)) {
            System.out.println("Login Mahasiswa berhasil!");
            displayInfo();
            tampilkanWaktuLogin();
        } else {
            System.out.println("Login gagal! Nama atau NIM salah.");
        }
    }

    void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM : " + nim);
    }

    void tampilkanWaktuLogin() {
        LocalDateTime waktu = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Waktu login: " + waktu.format(format));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
        Mahasiswa siswa = new Mahasiswa();

        System.out.println("Pilih login:");
        System.out.println("1. Admin\n2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        String pilihan = scanner.nextLine();

        if (pilihan.equals("1")) {
            System.out.print("Masukkan username: ");
            String user = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String pass = scanner.nextLine();
            admin.login(user, pass);

        } else if (pilihan.equals("2")) {
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();
            siswa.login(nama, nim);
        }
        scanner.close();
    }
}