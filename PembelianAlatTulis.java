import java.util.Map;

class PembelianAlatTulis extends Transaksi {
    @Override
    public void prosesTransaksi(DataPelanggan dataPelanggan, DaftarHarga daftarHarga, double jumlahUang) {
        Map<String, Double> hargaAlatTulis = daftarHarga.getHargaAlatTulis();
        String barangPilihan = dataPelanggan.getBarangPilihan();

        if (hargaAlatTulis.containsKey(barangPilihan)) {
            double hargaBarang = hargaAlatTulis.get(barangPilihan);

            if (jumlahUang >= hargaBarang) {
                double kembalian = jumlahUang - hargaBarang;

                // Menampilkan struk pembelian
                System.out.println("==== Struk Pembelian ====");
                System.out.println("Pelanggan: " + dataPelanggan.getNama());
                System.out.println("Barang yang dibeli: " + barangPilihan);
                System.out.println("Harga barang: " + hargaBarang);
                System.out.println("Jumlah uang: " + jumlahUang);
                System.out.println("Kembalian: " + kembalian);
            } else {
                System.out.println("Maaf, jumlah uang tidak mencukupi.");
            }
        } else {
            System.out.println("Barang tidak valid.");
        }
    }
}