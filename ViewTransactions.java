import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewTransactions {

    public static void showTransactions() {

        try {
            Connection con = DBConnection.getConnection();

            String query = "SELECT * FROM transactions";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getInt("user_id") + " | " +
                        rs.getDouble("amount") + " | " +
                        rs.getString("category") + " | " +
                        rs.getString("type") + " | " +
                        rs.getTimestamp("date")
                );
            }

        } catch (Exception e) {
            System.out.println("❌ Error fetching transactions");
            e.printStackTrace();
        }
    }
}