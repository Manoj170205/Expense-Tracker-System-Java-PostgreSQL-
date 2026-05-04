import java.sql.Connection;
import java.sql.PreparedStatement;

public class TransactionDAO {

    public static void addTransaction(int userId, double amount, String category, String type) {

        try {
            Connection con = DBConnection.getConnection();

            String query = "INSERT INTO transactions(user_id, amount, category, type) VALUES (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, userId);
            ps.setDouble(2, amount);
            ps.setString(3, category);
            ps.setString(4, type);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("✅ Transaction Added!");
            }

        } catch (Exception e) {
            System.out.println("❌ Error inserting transaction");
            e.printStackTrace();
        }
    }
}