import java.util.*;

public class ManajemenDataSiswa {
    public static void main(String[] args) {
        List<String> antreanPendaftar = new ArrayList<>();

        antreanPendaftar.add("Andi");
        antreanPendaftar.add("Budi");
        antreanPendaftar.add("Citra");
        antreanPendaftar.add("Andi");

        System.out.println("Daftar Pendaftar :" + antreanPendaftar);
        System.out.println("Jumlah Pendaftar :" + antreanPendaftar.size());

        Set<String> siswaTerdaftar = new HashSet<>(antreanPendaftar);
        System.out.println("Data Unik: " + siswaTerdaftar);
        System.out.println("Jumlah Unik: " + siswaTerdaftar.size());

        Map<String, String> nilaiSiswa = new HashMap<>();
        nilaiSiswa.put("Andi", "Lulus");
        nilaiSiswa.put("Budi", "Remedial");
        nilaiSiswa.put("Citra", "Lulus");

        System.out.println("Nilai Andi: " + nilaiSiswa.get("Andi"));
        System.out.println("Nilai Budi: " + nilaiSiswa.get("Budi"));
        System.out.println("Nilai Citra: " + nilaiSiswa.get("Citra"));
    }
}
