import java.util.ArrayList;
import java.util.List;

/**
 * Abstract class Toko sebagai base class untuk merepresentasikan toko.
 */
public abstract class Toko {

    // Nama toko
    private String nama;

    // Daftar barang yang tersedia di toko
    private List<Barang> daftarBarang = new ArrayList<>();

    /**
     * Konstruktor untuk membuat toko baru dengan nama tertentu
     * dan menginisialisasi daftar barang.
     *
     * @param nama Nama toko.
     */
    public Toko(String nama) {
        this.nama = nama;
        inisialisasiBarang();
    }

    /**
     * Mendapatkan nama toko.
     *
     * @return Nama toko.
     */
    public String getNama() {
        return nama;
    }

    /**
     * Metode abstrak untuk menampilkan barang yang tersedia di toko.
     */
    public abstract void tampilkanBarang();

    /**
     * Metode abstrak untuk mengisi daftar barang di setiap toko.
     */
    public abstract void inisialisasiBarang();

    /**
     * Mendapatkan daftar barang yang tersedia di toko.
     *
     * @return Daftar barang.
     */
    public List<Barang> getDaftarBarang() {
        return daftarBarang;
    }
}
