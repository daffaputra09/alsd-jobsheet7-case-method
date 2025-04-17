public class MataKuliah {
    public String kodeMK;
    public String namaMK;
    public int sks;

    public MataKuliah(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    public void tampilMatakuliah() {
        System.out.println("Kode: " + kodeMK + " | Mata Kuliah: " + namaMK + " | SKS: " + sks);
    }
}