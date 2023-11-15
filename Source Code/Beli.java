import java.util.Scanner;

/**
 * Kelas Beli merepresentasikan proses pembelian barang di sebuah toko.
 */
public class Beli {

    /**
     * Method untuk memproses pembelian barang.
     *
     * @param scanner Objek Scanner untuk input pengguna.
     * @param toko Objek Toko yang berisi daftar barang.
     * @param beli Objek Beli yang digunakan untuk melakukan pembelian.
     */
    public void prosesPembelian(Scanner scanner, Toko toko, Beli beli) {
        System.out.print("Masukkan nama barang yang ingin dibeli: ");
        String namaBarang = scanner.next();
        
        // Menggunakan Stream API untuk mencari barang dalam daftar barang toko 
        Barang barang = toko.getDaftarBarang()
                .stream()
                .filter(b -> b.getNama().equalsIgnoreCase(namaBarang))
                .findFirst()
                .orElse(null);
        
        // Jika barang ditemukan, lakukan proses pembelian
        if (barang != null) {
            beli.pembelian(toko, barang);
        } else {
            // Jika barang tidak ditemukan, beri tahu pengguna
            System.out.println("Barang tidak ditemukan. Silakan pilih barang yang valid.");
        }
    }

    /**
     * Method untuk melakukan pembelian barang dan menampilkan informasi pembelian.
     *
     * @param toko Objek Toko tempat pembelian dilakukan.
     * @param barang Objek Barang yang dibeli.
     */
    public void pembelian(Toko toko, Barang barang) {
        System.out.println("Pelanggan membeli " + barang.getNama() + " dari " + toko.getNama() +
                " seharga Rp " + barang.getHarga());
    }
}
