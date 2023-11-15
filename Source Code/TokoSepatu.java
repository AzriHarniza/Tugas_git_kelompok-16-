/**
 * Subclass TokoSepatu merupakan implementasi spesifik dari abstract class Toko.
 * TokoSepatu merepresentasikan sebuah toko yang menjual berbagai macam sepatu.
 */
public class TokoSepatu extends Toko {

    /**
     * Konstruktor untuk membuat objek TokoSepatu.
     *
     * @param nama Nama toko sepatu.
     */
    public TokoSepatu(String nama) {
        super(nama);
    }

    /**
     * {@inheritDoc}
     * Menampilkan daftar barang sepatu di TokoSepatu.
     */
    @Override
    public void tampilkanBarang() {
        System.out.println("Daftar barang di " + getNama() + ": " + getDaftarBarang());
    }

    /**
     * {@inheritDoc}
     * Menginisialisasi daftar barang sepatu di TokoSepatu.
     */
    @Override
    public void inisialisasiBarang() {
        getDaftarBarang().add(new Barang("Sepatu_Nike", 120000));
        getDaftarBarang().add(new Barang("Sepatu_Adidas", 100000));
        
    }
}
