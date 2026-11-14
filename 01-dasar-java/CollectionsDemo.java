import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        // 1. LIST: Boleh duplikat, terurut
        List<String> listBelanja = new ArrayList<>();
        listBelanja.add("Beras");
        listBelanja.add("Minyak");
        listBelanja.add("Beras"); // Boleh masuk lagi

        System.out.println("List: " + listBelanja);
        System.out.println("Item pertama: " + listBelanja.get(0));

        // 2. SET: Anti-duplikat
        Set<String> emailUnik = new HashSet<>();
        emailUnik.add("user@gmail.com");
        emailUnik.add("admin@gmail.com");
        emailUnik.add("user@gmail.com"); // Diabaikan otomatis

        System.out.println("Set (Ukuran: " + emailUnik.size() + "): " + emailUnik);

        // 3. MAP: Pasangan Key -> Value
        Map<String, Integer> stokBarang = new HashMap<>();
        stokBarang.put("Laptop", 10);
        stokBarang.put("Mouse", 25);
        stokBarang.put("Laptop", 15); // Key sama -> menimpa nilai lama (10 jadi 15)

        System.out.println("Stok Laptop: " + stokBarang.get("Laptop")); // 15
        System.out.println("Semua Key: " + stokBarang.keySet());
    }
}