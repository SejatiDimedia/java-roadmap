public class MemoryStringDemo {
    public static void main(String[] args) {
        // 1. String Literal (masuk String Constant Pool)
        String teks1 = "Kopi";
        String teks2 = "Kopi";

        // teks1 dan teks2 menunjuk ke objek yang SAMA di SCP
        System.out.println("teks1 == teks2: " + (teks1 == teks2)); // true
        System.out.println("teks1.equals(teks2): " + teks1.equals(teks2)); // true

        // 2. String dengan kata kunci 'new' (Objek baru di Heap reguler)
        String teks3 = new String("Kopi");

        // Alamat memorinya BERBEDA
        System.out.println("teks1 == teks3: " + (teks1 == teks3)); // false
        // Tapi isinya SAMA
        System.out.println("teks1.equals(teks3): " + teks1.equals(teks3)); // true
    }
}