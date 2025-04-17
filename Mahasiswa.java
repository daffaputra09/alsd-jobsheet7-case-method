public class Mahasiswa {
    public String NIM;
    public String nama;
    public String prodi;

    public Mahasiswa(String NIM, String nama, String prodi) {
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void tampilMahasiswa() {
        System.out.println("NIM: " + NIM + " | Nama: " + nama + " | Prodi: " + prodi);
    }
}