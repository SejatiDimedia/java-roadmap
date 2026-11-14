import java.util.*;

public class ManajemenBukuApp {
    public record Buku(String id, String judul, String kategori, double harga, int stok) {
    }

    public static class TokoBukuService {
        // 1. Simpan daftar buku menggunakan List
        private final List<Buku> daftarBuku = new ArrayList<>();

        // 2. Method Tambah Buku dengan Validasi (Exception Handling)
        public void tambahBuku(Buku buku) {
            if (buku == null) {
                throw new IllegalArgumentException("Data buku tidak boleh null!");
            }
            if (buku.harga() <= 0) {
                throw new IllegalArgumentException("Harga buku harus lebih dari 0!");
            }
            if (buku.stok() < 0) {
                throw new IllegalArgumentException("Stok buku tidak boleh negatif!");
            }

            daftarBuku.add(buku);
            System.out.println("✅ Berhasil menambahkan buku: " + buku.judul());
        }

        // 3. Method Cari Buku berdasarkan Kategori (Menggunakan Stream API)
        public List<Buku> cariBerdasarkanKategori(String kategori) {
            return daftarBuku.stream()
                    .filter(b -> b.kategori().equalsIgnoreCase(kategori))
                    .toList();
        }

        // 4. Method Hitung Total Nilai Aset (Stream API: mapToDouble & sum)
        public double hitungTotalNilaiAset() {
            return daftarBuku.stream()
                    .mapToDouble(b -> b.harga() * b.stok()) // Harga dikali jumlah stok
                    .sum();
        }
    }

    public static void main(String[] args) {
        TokoBukuService service = new TokoBukuService();

        try {
            service.tambahBuku(new Buku("001", "Pemrograman Dasar", "TEKNOLOGI", 100000, 10));
            service.tambahBuku(new Buku("002", "Cara Berbisnis Pemula", "BISNIS", 80000, 10));
            service.tambahBuku(new Buku("003", "Buku Rusak", "TEKNOLOGI", -5000, 10));

            List<Buku> bukuTeknologi = service.cariBerdasarkanKategori("TEKNOLOGI");
            System.out.println(bukuTeknologi);
            System.out.println(service.hitungTotalNilaiAset());
        } catch (IllegalArgumentException e) {
            System.out.println("⚠️  Validasi Berhasil Menangkap Error: " + e.getMessage());
        }
    }

}
