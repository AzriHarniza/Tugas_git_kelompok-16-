/**
 * Subclass TokoBaju merupakan implementasi spesifik dari abstract class Toko.
 * TokoBaju merepresentasikan sebuah toko yang menjual berbagai macam pakaian.
 */
public class TokoBaju extends Toko {

    /**
     * Konstruktor untuk membuat TokoBaju baru dengan nama tertentu
     * dan menginisialisasi daftar barang.
     *
     * @param nama Nama TokoBaju.
     */
    public TokoBaju(String nama) {
        super(nama);
    }

    /**
     * {@inheritDoc}
     * Metode untuk menampilkan daftar barang di TokoBaju.
     */
    @Override
    public void tampilkanBarang() {
        System.out.println("Daftar barang di " + getNama() + ": " + getDaftarBarang());
    }

    /**
     * {@inheritDoc}
     * Metode untuk menginisialisasi daftar barang di TokoBaju.
     */
    @Override
    public void inisialisasiBarang() {
        getDaftarBarang().add(new Barang("Baju", 50000));
        getDaftarBarang().add(new Barang("Jas", 150000));
        getDaftarBarang().add(new Barang("Jacket", 80000));
    }
}
