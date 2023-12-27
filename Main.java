import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DaftarHarga daftarHarga = new DaftarHargaAlatTulis();
        Transaksi transaksi = new PembelianAlatTulis();
        DataPelanggan dataPelanggan = null;
        System.out.println("Selamat Datang di Fotokopi Irma");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        while (true) {
            System.out.println("========== Menu Pilihan ========");
            System.out.println("a. Lihat daftar harga alat tulis");
            System.out.println("b. Pengisian data pelanggan");
            System.out.println("c. Transaksi pembelian");
            System.out.println("d. Selesai");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            System.out.print("Pilih opsi (a/b/c/d): ");
            char opsi = scanner.next().charAt(0);

            switch (opsi) {
                case 'a':
                    // Menampilkan daftar harga alat tulis
                    System.out.println("====== Daftar Harga Alat Tulis ======");
                    Map<String, Double> hargaAlatTulis = daftarHarga.getHargaAlatTulis();
                    for (Map.Entry<String, Double> entry : hargaAlatTulis.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                    break;

                case 'b':
                    // Pengisian data pelanggan
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("        Data Pelanggan          ");
                    System.out.print("Masukkan nama pelanggan: ");
                    String namaPelanggan = scanner.next();

                    System.out.print("Masukkan barang yang akan dibeli: ");
                    String barangPilihan = scanner.next();

                    dataPelanggan = new DataPelanggan(namaPelanggan, barangPilihan);
                    System.out.println("Data pelanggan berhasil diisi.");
                    break;

                case 'c':
                    // Transaksi pembelian
                    if (dataPelanggan != null) {
                        System.out.print("Masukkan jumlah uang: ");
                        double jumlahUang = scanner.nextDouble();

                        transaksi.prosesTransaksi(dataPelanggan, daftarHarga, jumlahUang);
                    } else {
                        System.out.println("Harap isi data pelanggan terlebih dahulu.");
                    }
                    break;


                case 'd':
                    // Selesai
                    System.out.println("Terima kasih!");
                    System.exit(0);

                default:
                    System.out.println("Opsi tidak valid. Silakan pilih opsi yang benar.");
            }
        }
    }
}