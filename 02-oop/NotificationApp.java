
public class NotificationApp {
    public interface NotificationService {
        void kirimPesan(String penerima, String pesan);
    }

    class EmailNotificationService implements NotificationService {
        @Override
        public void kirimPesan(String penerima, String pesan) {
            System.out.println("Mengirim Email ke " + penerima + " dengan pesan : " + pesan);
        }
    }

    class SMSNotificationService implements NotificationService {
        @Override
        public void kirimPesan(String penerima, String pesan) {
            System.out.println("Mengirim SMS ke " + penerima + " dengan pesan : " + pesan);
        }
    }

    public void registerUser(String nama, String kontak, NotificationService notificationService) {
        System.out.println("User " + nama + " berhasil terdaftar di database.");
        notificationService.kirimPesan(kontak, "Selamat datang, " + nama + "!");
    }

    public static void main(String[] args) {
        NotificationApp app = new NotificationApp();
        NotificationService email = app.new EmailNotificationService();
        NotificationService sms = app.new SMSNotificationService();

        app.registerUser("Andi", "andi@email.com", email);
        app.registerUser("Budi", "08123456789", sms);
    }
}
