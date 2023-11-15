/**
 * Subclass TokoMakanan merupakan implementasi spesifik dari abstract class Toko.
 * TokoMakanan merepresentasikan sebuah toko yang menjual berbagai macam makanan.
 */
public class TokoMakanan extends Toko {

    /**
     * Konstruktor untuk membuat objek TokoMakanan.
     *
     * @param nama Nama toko makanan.
     */
    public TokoMakanan(String nama) {
        super(nama);
    }

    /**
     * {@inheritDoc}
     * Menampilkan daftar barang makanan di TokoMakanan.
     */
    @Override
    public void tampilkanBarang() {
        System.out.println("Daftar barang di " + getNama() + ": " + getDaftarBarang());
    }

    /**
     * {@inheritDoc}
     * Menginisialisasi daftar barang makanan di TokoMakanan.
     */
    @Override
    public void inisialisasiBarang() {
        getDaftarBarang().add(new Barang("Kue", 20000));
        getDaftarBarang().add(new Barang("Ayam_goreng", 10000));
        getDaftarBarang().add(new Barang("Kentang_goreng", 15000));
    }
}
