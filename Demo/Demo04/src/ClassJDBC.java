import java.sql.*;

public class ClassJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root123");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select name cName,location,buildDate,id from company");

    }
}
