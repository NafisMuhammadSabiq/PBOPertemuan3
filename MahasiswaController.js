class MahasiswaController {
    constructor(model, view) {
        this.model = model;
        this.view = view;
    }

    tampilkanMahasiswa() {
        const mahasiswa = new this.model("santi", "Cirebon", "SMA");
        document.getElementById("output").innerHTML = this.view.render(mahasiswa);
    }
}

// Inisialisasi dan Penggunaan
const mahasiswaController = new MahasiswaController(Mahasiswa, MahasiswaView);
mahasiswaController.tampilkanMahasiswa();