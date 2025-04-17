public class Penilaian {
    public Mahasiswa mahasiswa;
    public MataKuliah mataKuliah;
    public double nilaiTugas;
    public double nilaiUTS;
    public double nilaiUAS;
    public double nilaiAkhir;

    public Penilaian(Mahasiswa mahasiswa, MataKuliah mataKuliah, double tugas, double uts, double uas) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = tugas;
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;
        hitungNilaiAkhir();
    }

    public void hitungNilaiAkhir() {
        this.nilaiAkhir = (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }

    public void tampilPenilaian() {
        System.out.println("Nama: " + mahasiswa.nama + " | Mata Kuliah: " + mataKuliah.namaMK + " | Nilai Akhir: " + nilaiAkhir);
    }
}