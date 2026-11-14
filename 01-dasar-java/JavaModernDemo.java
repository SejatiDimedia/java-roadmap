import java.util.*;

public class JavaModernDemo {

    // 1. RECORD: Model data ringkas 1 baris
    public record User(String nama, int umur, String role) {
    }

    public static void main(String[] args) {
        List<User> listUser = List.of(
                new User("Rian", 25, "USER"),
                new User("Siti", 17, "USER"),
                new User("Budi", 30, "ADMIN"),
                new User("Dewi", 19, "USER"));

        System.out.println("--- GAYA KLASIK (For-loop manual) ---");
        List<String> hasilKlasik = new ArrayList<>();
        for (User u : listUser) {
            if (u.umur() >= 18 && "USER".equals(u.role())) {
                hasilKlasik.add(u.nama().toUpperCase());
            }
        }
        System.out.println(hasilKlasik);

        System.out.println("\n--- GAYA MODERN (Stream API + Lambda) ---");
        // Sangat mudah dibaca seperti membaca kalimat
        List<String> hasilModern = listUser.stream()
                .filter(u -> u.umur() >= 18) // Saring: umur >= 18
                .filter(u -> "USER".equals(u.role())) // Saring: hanya role USER
                .map(u -> u.nama().toUpperCase()) // Ubah: ambil nama & huruf besar
                .toList(); // Kemas ke List

        System.out.println(hasilModern);
    }
}