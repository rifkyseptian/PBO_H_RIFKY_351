// Kelas Hewan merepresentasikan sebuah hewan dengan atribut nama, jenis, dan suara.
class Hewan {
    String nama;  // Menyimpan nama hewan
    String jenis; // Menyimpan jenis hewan (misalnya Mamalia, Reptil, dll.)
    String suara; // Menyimpan suara khas dari hewan

    // Konstruktor untuk menginisialisasi objek Hewan dengan nama, jenis, dan suara
    public Hewan(String nama, String jenis, String suara) {
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;
    }

    // Method untuk menampilkan informasi hewan
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Suara: " + suara);
        System.out.println(); // Baris kosong untuk pemisah tampilan
    }
}
// Kelas utama untuk menjalankan program
public class Main_1 {
    public static void main(String[] args) {
        // Membuat objek hewan pertama (Kucing)
        Hewan hewan1 = new Hewan("Kucing", "Mamalia", "nyaan~");

        // Membuat objek hewan kedua (Anjing)
        Hewan hewan2 = new Hewan("Anjing", "Mamalia", "woof-woof!!");

        // Menampilkan informasi dari masing-masing hewan
        hewan1.tampilkanInfo();
        hewan2.tampilkanInfo();
    }
}
