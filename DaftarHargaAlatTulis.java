import java.util.HashMap;
import java.util.Map;

class DaftarHargaAlatTulis implements DaftarHarga {
    private Map<String, Double> hargaAlatTulis;

    public DaftarHargaAlatTulis() {
        hargaAlatTulis = new HashMap<>();
        hargaAlatTulis.put("Pensil", 2000.0);
        hargaAlatTulis.put("Buku Tulis", 5000.0);
        hargaAlatTulis.put("Penghapus", 3000.0);
        hargaAlatTulis.put("Penggaris", 7000.0);
        hargaAlatTulis.put("Rautan", 5000.0);
    }

    @Override
    public Map<String, Double> getHargaAlatTulis() {
        return hargaAlatTulis;
    }
}