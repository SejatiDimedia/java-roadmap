public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("--- Mulai Transaksi ---");

        try {
            int saldo = 50_000;
            int transfer = 100_000;

            if (transfer > saldo) {
                // Melempar error logika secara eksplisit
                throw new IllegalArgumentException("Saldo tidak cukup! Saldo: " + saldo + ", Diminta: " + transfer);
            }

            System.out.println("Transfer berhasil!");

        } catch (IllegalArgumentException e) {
            // Tangani error dengan elegan (misal: di backend ini nanti jadi response HTTP
            // 400 Bad Request)
            System.err.println("Gagal Transfer: " + e.getMessage());

        } finally {
            // Selalu jalan apapun yang terjadi
            System.out.println("Log: Sesi transaksi selesai.");
        }

        System.out.println("--- Aplikasi tetap berjalan normal (tidak crash) ---");
    }
}