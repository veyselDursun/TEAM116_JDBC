package jdbcTest;

import java.sql.*;

public class JDBC_Query02 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://194.140.198.209/wonderworld_qa2",
                                "wonderworld_qawcollegeuser",
                                "1gvyfx6#Q");

        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        String query = "SELECT * FROM wonderworld_qa2.staff";

         i t e r a t o r

    }
}
