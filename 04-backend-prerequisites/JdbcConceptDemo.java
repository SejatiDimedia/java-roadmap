
import java.util.*;

public class JdbcConceptDemo {

    // Model DTO yang menampung data
    public record OrderResponse(int orderId, String customerName, double totalAmount) {
    }

    public static void main(String[] args) {
        System.out.println("--- SIMULASI ALUR JDBC ---");

        // 1. Bayangkan ini adalah query SQL yang kita kirimkan ke Database
        String sqlQuery = """
                    SELECT orders.id AS order_id, users.name AS user_name, orders.total_amount
                    FROM orders
                    INNER JOIN users ON orders.user_id = users.id
                """;
        System.out.println("Query Terkirim:\n" + sqlQuery);

        // 2. Database mengembalikan baris-baris data (Di JDBC disebut 'ResultSet')
        // Ini simulasi data mentah yang datang dari database:
        List<Map<String, Object>> simulatedResultSet = List.of(
                Map.of("order_id", 101, "user_name", "Budi Santoso", "total_amount", 150000.0),
                Map.of("order_id", 102, "user_name", "Siti Aminah", "total_amount", 320000.0));

        // 3. PROSES MAPPING: Mengubah baris SQL menjadi List<OrderResponse> di Java
        List<OrderResponse> listOrder = new ArrayList<>();
        for (Map<String, Object> row : simulatedResultSet) {
            int id = (int) row.get("order_id");
            String nama = (String) row.get("user_name");
            double total = (double) row.get("total_amount");

            // Masukkan ke Objek Java
            listOrder.add(new OrderResponse(id, nama, total));
        }

        // 4. Data siap dipakai di layer Service atau dikembalikan ke Frontend via REST
        // API!
        System.out.println("\nHasil Mapping Java Objek:");
        listOrder.forEach(System.out::println);
    }
}