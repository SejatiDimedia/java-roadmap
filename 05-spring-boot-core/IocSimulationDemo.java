public class IocSimulationDemo {

    // 1. Interface Kontrak
    public interface MessageSender {
        void send(String to, String message);
    }

    // 2. Komponen / Service (Calon Spring Bean)
    public static class WhatsappSender implements MessageSender {
        @Override
        public void send(String to, String message) {
            System.out.println("📱 [WhatsApp] Mengirim ke " + to + ": " + message);
        }
    }

    public static class EmailSender implements MessageSender {
        @Override
        public void send(String to, String message) {
            System.out.println("[EMAIL_ADDRESS] mengirim ke " + to + ": " + message);
        }
    }

    // 3. Service yang membutuhkan MessageSender (Dependency)
    public static class UserService {
        private final MessageSender messageSender;

        // CONSTRUCTOR INJECTION (Praktek Terbaik di Spring Boot Modern)
        public UserService(MessageSender messageSender) {
            this.messageSender = messageSender;
        }

        public void register(String username, String phone) {
            System.out.println("💾 Simpan user " + username + " ke database.");
            messageSender.send(phone, "Selamat datang, " + username + "!");
        }
    }

    // 4. SIMULASI SPRING CONTAINER (IoC Container)
    public static void main(String[] args) {
        System.out.println("=== SISTEM MENYALA (Spring IoC Container Bekerja) ===");

        // Di Spring Boot, 2 baris di bawah ini dijalankan OTOMATIS oleh Spring saat
        // aplikasi start:
        MessageSender whatsappBean = new WhatsappSender(); // 1. Spring membuat Bean
        MessageSender emailSenderBean = new EmailSender(); // 1. Spring membuat Bean
        UserService userServiceBean = new UserService(emailSenderBean); // 2. Spring menyuntikkan (Inject) Bean

        System.out.println("=== APLIKASI SIAP MENERIMA REQUEST ===");
        // Saat ada user mendaftar:
        userServiceBean.register("Rian Sejati", "08123456789");
    }
}