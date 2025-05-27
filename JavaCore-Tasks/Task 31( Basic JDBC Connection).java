import java.sql.*;

public class JDBCBasicSelect {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:students.db"; // Use JDBC URL for your DB
        String query = "SELECT id, name FROM students";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                                   ", Name: " + rs.getString("name"));
            }

        } catch (SQLException e) {
            System.out.println("DB Error: " + e.getMessage());
        }
    }
}
