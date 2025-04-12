// Program simulasi pertarungan antara Pahlawan dan Musuh

    public class Codelab {
        public static void main(String[] args) {
            // Membuat objek karakter umum, pahlawan, dan musuh
            KarakterGame karakterUmum = new KarakterGame("Karakter Umum", 100);
            Pahlawan pahlawan = new Pahlawan("Brimstone", 150);
            Musuh musuh = new Musuh("Viper", 200);

            // Menampilkan status awal kesehatan pahlawan dan musuh
            System.out.println("Status awal:");
            System.out.println(pahlawan.getNama() + " memiliki kesehatan: " + pahlawan.getKesehatan());
            System.out.println(musuh.getNama() + " memiliki kesehatan: " + musuh.getKesehatan());

            // Simulasi pertarungan:
            // Pahlawan menyerang musuh, lalu musuh menyerang pahlawan
            pahlawan.serang(musuh);
            musuh.serang(pahlawan);
        }
    }

    // Kelas dasar KarakterGame
    class KarakterGame {
        // Atribut nama dan kesehatan (private)
        private String nama;
        private int kesehatan;

        // Constructor untuk menginisialisasi nama dan kesehatan
        public KarakterGame(String nama, int kesehatan) {
            this.nama = nama;
            this.kesehatan = kesehatan;
        }

        // Getter dan setter untuk nama
        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        // Getter dan setter untuk kesehatan
        public int getKesehatan() {
            return kesehatan;
        }

        public void setKesehatan(int kesehatan) {
            this.kesehatan = kesehatan;
        }

        // Method serang() yang akan dioverride oleh subclass
        public void serang(KarakterGame target) {
            // Kosong, karena akan dioverride
        }
    }

    // Subclass Pahlawan yang mewarisi KarakterGame
    class Pahlawan extends KarakterGame {
        // Constructor dengan memanggil constructor superclass
        public Pahlawan(String nama, int kesehatan) {
            super(nama, kesehatan);
        }

        // Override method serang() untuk pahlawan
        @Override
        public void serang(KarakterGame target) {
            System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan Orbital Strike!");
            target.setKesehatan(target.getKesehatan() - 20); // Mengurangi 20 poin kesehatan target
            System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
        }
    }

    // Subclass Musuh yang mewarisi KarakterGame
    class Musuh extends KarakterGame {
        // Constructor dengan memanggil constructor superclass
        public Musuh(String nama, int kesehatan) {
            super(nama, kesehatan);
        }

        // Override method serang() untuk musuh
        @Override
        public void serang(KarakterGame target) {
            System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan Snake Bite!");
            target.setKesehatan(target.getKesehatan() - 15); // Mengurangi 15 poin kesehatan target
            System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
        }
    }
