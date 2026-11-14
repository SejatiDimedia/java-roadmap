import java.util.*;

public class FilterTransaksi {

    public record Transaksi(String id, String kategori, double nominal, String status) {
    }

    public static void main(String[] args) {
        List<Transaksi> transaksiList = List.of(
                new Transaksi("T01", "ELEKTRONIK", 150000, "BERHASIL"),
                new Transaksi("T02", "MAKANAN", 50000, "BERHASIL"),
                new Transaksi("T03", "ELEKTRONIK", 75000, "GAGAL"),
                new Transaksi("T04", "PAKAIAN", 30000, "BERHASIL"),
                new Transaksi("T05", "ELEKTRONIK", 50000, "BERHASIL"));

        List<String> idElektronikBerhasil = transaksiList.stream()
                .filter(k -> k.kategori().equals("ELEKTRONIK"))
                .filter(k -> k.status().equals("BERHASIL"))
                .map(k -> k.id())
                .toList();

        System.out.println(idElektronikBerhasil);

        double totalUangMasuk = transaksiList.stream()
                .filter(t -> "BERHASIL".equals(t.status()))
                .mapToDouble(t -> t.nominal())
                .sum();

        System.out.println(totalUangMasuk);
    }
}
