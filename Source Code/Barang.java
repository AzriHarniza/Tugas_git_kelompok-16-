/**
 * Kelas Barang merepresentasikan sebuah barang dengan informasi nama dan harga.
 * Objek dari kelas ini dapat digunakan untuk menyimpan data terkait barang.
 */
public class Barang {
    // Variabel instance untuk menyimpan nama barang
    private String nama;
    
    // Variabel instance untuk menyimpan harga barang
    private double harga;

    /**
     * Konstruktor untuk membuat objek Barang dengan nama dan harga tertentu.
     *
     * @param nama Nama barang.
     * @param harga Harga barang dalam bentuk bilangan desimal.
     */
    public Barang(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    /**
     * Method untuk mendapatkan nama barang.
     *
     * @return Nama barang.
     */
    public String getNama() {
        return nama;
    }

    /**
     * Method untuk mendapatkan harga barang.
     *
     * @return Harga barang dalam bentuk bilangan desimal.
     */
    public double getHarga() {
        return harga;
    }

    /**
     * Method untuk representasi string dari objek Barang.
     *
     * @return Representasi string yang mencakup nama dan harga barang.
     */
    @Override
    public String toString() {
        return nama + " (Rp " + harga + ")";
    }
}
