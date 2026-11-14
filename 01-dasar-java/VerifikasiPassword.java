
public class VerifikasiPassword {
    public static void main(String[] args) {
        String masterPass = "Rahasia123";
        String inputPass = new String("Rahasia123");

        if (masterPass == inputPass) {
            System.out.println("Password Benar (Memori Sama)");
        }

        if (masterPass.equals(inputPass)) {
            System.out.println("Password Benar (Isi Sama)");
        } else {
            System.out.println("Password Salah");
        }
    }

}
