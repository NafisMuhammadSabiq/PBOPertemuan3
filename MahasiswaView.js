class MahasiswaView {
    render(mahasiswa) {
        return `
            <div class="mahasiswa-card">
                <h2>${mahasiswa.name}</h2>
                <p>NIM: ${mahasiswa.alamat}</p>
                <p>Jurusan: ${mahasiswa.lulusan}</p>
            </div>
        `;
    }
}