// Definisi kelas Mahasiswa
public class Mahasiswa {
    // Atribut kelas
    private String name;
    private String alamat;
    private String lulusan;

    // Konstruktor kelas untuk inisialisasi objek
    public Mahasiswa(String name, String alamat, String lulusan) {
        this.name = name;
        this.alamat = alamat;
        this.lulusan = lulusan;
    }

    // Metode untuk mendapatkan nama mahasiswa
    public String getNama() {
        return name;
    }

    // Metode untuk mengubah nama mahasiswa
    public void setNama(String name) {
        this.name = name;
    }

    // Metode untuk menampilkan aktivitas belajar
    public void belajar() {
        System.out.println(name + " sedang belajar.");
    }
}

// Implementasi penggunaan kelas Mahasiswa
public class Main {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("santi", "Cirebon", "SMA");
        Mahasiswa mahasiswa2 = new Mahasiswa("ayu", "Bekasi", "SMK");

        // Menggunakan metode objek
        mahasiswa1.belajar();  // Output: Budi sedang belajar.
        mahasiswa2.belajar();  // Output: Ani sedang belajar.
    }
}
