public class BankTransfer {
    public static void prosesTransfer(String rekeningTujuan, int nominal) {
        System.out.println("---Mulai Transaksi---");

        if (nominal <= 0) {
            throw new IllegalArgumentException("Nominal harus lebih dari 0");
        }

        if (rekeningTujuan == null || rekeningTujuan.length() < 5) {
            throw new IllegalArgumentException("Nomor rekening tidak valid");
        }

        System.out.println("Transfer sebesar Rp " + nominal + " ke " + rekeningTujuan + " BERHASIL!");

        System.out.println("---Transaksi Selesai---");

    }

    public static void main(String[] args) {
        try {
            prosesTransfer("12345", 5000);
            prosesTransfer("123", -1000);
        } catch (IllegalArgumentException e) {
            System.out.println("Gagal transfer: " + e.getMessage());
        }
    }
}
