import java.util.Scanner;

public class SistemAkademik {

    static Scanner scanner = new Scanner(System.in);

    static Mahasiswa[] daftarMahasiswa = {
        new Mahasiswa("22001", "Ali Rahman", "Informatika"),
        new Mahasiswa("22002", "Budi Santoso", "Informatika"),
        new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis")
    };

    static MataKuliah[] daftarMataKuliah = {
        new MataKuliah("MK001", "Struktur Data", 3),
        new MataKuliah("MK002", "Basis Data", 3),
        new MataKuliah("MK003", "Desain Web", 3)
    };

    static Penilaian[] daftarPenilaian = {
        new Penilaian(daftarMahasiswa[0], daftarMataKuliah[0], 80, 85, 90),
        new Penilaian(daftarMahasiswa[0], daftarMataKuliah[1], 60, 75, 70),
        new Penilaian(daftarMahasiswa[1], daftarMataKuliah[0], 75, 70, 80),
        new Penilaian(daftarMahasiswa[1], daftarMataKuliah[1], 85, 90, 95),
        new Penilaian(daftarMahasiswa[2], daftarMataKuliah[0], 80, 90, 65)
    };
    
    static int jumlahMahasiswa = daftarMahasiswa.length;
    static int jumlahMataKuliah = daftarMataKuliah.length;
    static int jumlahPenilaian = daftarPenilaian.length;

    public static void tampilkanDaftarMahasiswa() {
        System.out.println("\nDaftar Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            daftarMahasiswa[i].tampilMahasiswa();
        }
    }

    public static void tampilkanDaftarMataKuliah() {
        System.out.println("\nDaftar Mata Kuliah:");
        for (int i = 0; i < jumlahMataKuliah; i++) {
            daftarMataKuliah[i].tampilMatakuliah();
        }
    }

    public static void tampilkanDataPenilaian() {
        System.out.println("\nData Penilaian:");
        for (int i = 0; i < jumlahPenilaian; i++) {
            daftarPenilaian[i].tampilPenilaian();
        }
    }

    public static void urutkanMahasiswaBerdasarkanNilai() {
        Penilaian[] tempPenilaian = new Penilaian[jumlahPenilaian];
        for (int i = 0; i < jumlahPenilaian; i++) {
            tempPenilaian[i] = daftarPenilaian[i];
        }
        
        for (int i = 0; i < jumlahPenilaian - 1; i++) {
            for (int j = 0; j < jumlahPenilaian - i - 1; j++) {
                if (tempPenilaian[j].nilaiAkhir < tempPenilaian[j + 1].nilaiAkhir) {
                    Penilaian temp = tempPenilaian[j];
                    tempPenilaian[j] = tempPenilaian[j + 1];
                    tempPenilaian[j + 1] = temp;
                }
            }
        }

        System.out.println("\nData Penilaian:");
        for (int i = 0; i < jumlahPenilaian; i++) {
            tempPenilaian[i].tampilPenilaian();
        }
    }

    public static void cariMahasiswaBerdasarkanNIM() {
        System.out.print("Masukkan NIM mahasiswa yang dicari: ");
        String nimCari = scanner.next();
        
        boolean ditemukan = false;
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (daftarMahasiswa[i].NIM.equals(nimCari)) {
                daftarMahasiswa[i].tampilMahasiswa();
                ditemukan = true;
                break;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan.");
        }
    }

    public static void main(String[] args) {        
        while (true) {
            System.out.println("\n=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            
            int pilihan = scanner.nextInt();
            
            switch (pilihan) {
                case 1:
                    tampilkanDaftarMahasiswa();
                    break;
                case 2:
                    tampilkanDaftarMataKuliah();
                    break;
                case 3:
                    tampilkanDataPenilaian();
                    break;
                case 4:
                    urutkanMahasiswaBerdasarkanNilai();
                    break;
                case 5:
                    cariMahasiswaBerdasarkanNIM();
                    break;
                case 0:
                    System.out.println("\n================================================");
                    System.out.println("Terima kasih telah menggunakan sistem akademik.");
                    System.out.println("================================================");
                    return;
                default:
                    System.out.println("Menu tidak valid!");
            }
        }
    }
}