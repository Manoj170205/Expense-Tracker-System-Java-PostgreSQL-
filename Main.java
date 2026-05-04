import java.sql.Connection;

public class Main {

    public static void main(String[] args) {

        System.out.println("🚀 Expense Tracker Started...\n");

        // 1. Check Database Connection
        Connection con = DBConnection.getConnection();

        if (con != null) {
            System.out.println("✅ Database Connected Successfully!\n");
        } else {
            System.out.println("❌ Database Connection Failed!");
            return;
        }

        // 2. Insert Transactions
        System.out.println("➕ Adding Transactions...\n");

        TransactionDAO.addTransaction(1, 1000, "Salary", "income");
        TransactionDAO.addTransaction(1, 250, "Food", "expense");
        TransactionDAO.addTransaction(1, 150, "Transport", "expense");

        // 3. Display All Transactions
        System.out.println("\n📊 All Transactions:\n");

        ViewTransactions.showTransactions();

        System.out.println("\n✅ Program Finished!");
    }
}