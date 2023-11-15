import java.util.Scanner;

/**
 * Kelas ini merupakan kelas utama yang menjalankan aplikasi toko online sederhana.
 * Pengguna dapat memilih toko dan melakukan pembelian barang.
 */
public class MainTokoOnline {

    /**
     * Method utama untuk menjalankan aplikasi toko online.
     *
     * @param args Argumen baris perintah yang dapat diterima (tidak digunakan dalam aplikasi ini).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inisialisasi objek-objek toko dan pembelian
        TokoBaju tokoBaju = new TokoBaju("FashionStore");
        TokoMakanan tokoMakanan = new TokoMakanan("FoodMart");
        TokoSepatu tokoSepatu = new TokoSepatu("ShoeLand");

        Beli beli = new Beli();

        int pilihan;
        do {
            // Menampilkan menu pilihan toko kepada pengguna
            System.out.println("Pilih toko:");
            System.out.println("1. FashionStore (Toko Baju)");
            System.out.println("2. FoodMart (Toko Makanan)");
            System.out.println("3. ShoeLand (Toko Sepatu)");
            System.out.println("0. Keluar");

            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();
            
            // Melakukan tindakan berdasarkan pilihan pengguna
            switch (pilihan) {
                case 1:
                    // Menampilkan barang di Toko Baju
                    tokoBaju.tampilkanBarang();
                    // Memproses pembelian di Toko Baju
                    beli.prosesPembelian(scanner, tokoBaju, beli);
                    break;
                case 2:
                    // Menampilkan barang di Toko Makanan
                    tokoMakanan.tampilkanBarang();
                    // Memproses pembelian di Toko Makanan
                    beli.prosesPembelian(scanner, tokoMakanan, beli);
                    break;
                case 3:
                    // Menampilkan barang di Toko Sepatu
                    tokoSepatu.tampilkanBarang();
                    // Memproses pembelian di Toko Sepatu
                    beli.prosesPembelian(scanner, tokoSepatu, beli);
                    break;
                case 0:
                    // Menampilkan pesan keluar dari program
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;
                default:
                    // Menampilkan pesan jika pilihan tidak valid
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (pilihan != 0);

        // Menutup objek Scanner
        scanner.close();
    }
}
