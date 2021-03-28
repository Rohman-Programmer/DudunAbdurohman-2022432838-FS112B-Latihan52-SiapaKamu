/**
 * @author
 * NAMA     : Dudun Abdurohman
 * KELAS    : PBO2
 * NIM      : 2022432838
 * Deskripsi Program : Menampilkan diri Anda menggunakan sifat inheritance dan polymorphism
 *
 */
public class Main {
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.setNip("20555555555");
        dosen.setNama("Fernando Siboro");
        dosen.setUmur(29);
        dosen.setMataKuliah("PBO");

        System.out.println("NIP DOSEN : "+dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("67575655");
        mahasiswa.setNama("Dudun Abdurohman");
        mahasiswa.setUmur(21);
        mahasiswa.setKelas("PBO2");

        System.out.println("\nNIP MAHASISWA : "+mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }
}
