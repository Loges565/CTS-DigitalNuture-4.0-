import java.sql.*;

public class TransactionExample {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:bank.db";

        try (Connection conn = DriverManager.getConnection(url)) {
            conn.setAutoCommit(false);

            try (
                PreparedStatement debit = conn.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
                PreparedStatement credit = conn.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?")
            ) {
                int fromId = 1, toId = 2;
                double amount = 100.0;

                debit.setDouble(1, amount);
                debit.setInt(2, fromId);
                debit.executeUpdate();

                credit.setDouble(1, amount);
                credit.setInt(2, toId);
                credit.executeUpdate();

                conn.commit();
                System.out.println("Transaction committed successfully.");
            } catch (SQLException e) {
                conn.rollback();
                System.out.println("Transaction failed. Rolled back.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
