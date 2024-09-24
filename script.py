# Definisi kelas Mahasiswa
class Mahasiswa:
    # Konstruktor kelas untuk inisialisasi objek
    def __init__(self, name, alamat, lulusan):
        self.name = name
        self.alamat = alamat
        self.lulusan = lulusan

    # Metode untuk menampilkan aktivitas belajar
    def belajar(self):
        print(f"{self.name} sedang belajar.")

# Implementasi penggunaan kelas Mahasiswa
mahasiswa1 = Mahasiswa("santi", "Cirebon", "SMA")
mahasiswa2 = Mahasiswa("ayu", "Bekasi", "SMK")

# Menggunakan metode objek
mahasiswa1.belajar()  # Output: Budi sedang belajar.
mahasiswa2.belajar()  # Output: Ani sedang belajar.