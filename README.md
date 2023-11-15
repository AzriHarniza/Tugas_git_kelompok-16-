# Tugas_git_kelompok16

## Informasi proyek

- Topik : Toko Online

- Fenomena : Seorang pelanggan ingin membeli barang pada sebuah toko online, ia ingin mengetahui apa saja toko yang ada serta barang apa saja yang dijual pada toko tersebut.

![alt text](https://github.com/AzriHarniza/Tugas_git_kelompok-16-/blob/main/gambar%20model%20diagram%20blueJ.png?raw=true)
Aplikasi ini dibangun dengan menerapkan keempat konsep Pemrograman Berorientasi Objek (PBO), yaitu:

1. *Enkapsulasi:* Data di dalam kelas diatur sebagai private untuk mengontrol akses. Misalnya, atribut `nama` pada kelas `Toko` bersifat private.

2. *Abstraksi:* Kelas `Toko` diimplementasikan sebagai kelas abstrak, dan metode `inisialisasiBarang` dan `tampilkanBarang` diambil sebagai contoh abstraksi. Ini memungkinkan untuk definisi umum tanpa mengimplementasikan detail di kelas abstrak.

3. *Inheritance:* Kelas `TokoBaju`, `TokoMakanan`, dan `TokoSepatu` mewarisi sifat dan metode dari kelas abstrak `Toko`. Ini memungkinkan untuk menggunakan kembali kode dan mengatur struktur hierarki kelas.

4. *Polimorfisme:* Metode `inisialisasiBarang` diimplementasikan ulang di setiap subclass `TokoBaju`, `TokoMakanan`, dan `TokoSepatu`. Metode ini menunjukkan polimorfisme karena metode yang sama dapat menghasilkan perilaku yang berbeda pada setiap subclass.

## Authors

- Azri Harniza (2208107010034)
- Fadli Ahmad Yazid (2208107010032)

## Date

15 November 2023

## Fitur Aplikasi
- Pilih Toko: Nikmati pengalaman berbelanja di berbagai toko, seperti FashionStore, FoodMart, dan ShoeLand.
- Lihat Daftar Barang: Setiap toko memiliki daftar barang yang unik. Cek daftar barang sebelum memutuskan untuk berbelanja.
- Proses Pembelian: Pilih barang yang ingin Anda beli dan saksikan proses pembelian yang cepat dan mudah.

## Cara Menjalankan Aplikasi

1. Pastikan Anda memiliki Java Development Kit (JDK) terinstal di komputer Anda.
2. Clone repositori ini ke komputer Anda.
3. Buka terminal atau command prompt dan navigasi ke direktori proyek.
4. Compile dan jalankan `MainTokoOnline.java`.

```bash
javac MainTokoOnline.java
java MainTokoOnline
