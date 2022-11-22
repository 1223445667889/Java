import java.sql.*;

public class WorkeJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","123456789");
        Statement st = con.createStatement();

        String sql = "select * from department where companyId = (select id from company where name like '%国信安%')";
        ResultSet rs = st.executeQuery(sql);

        while(rs.next()){
            System.out.println(rs.getInt("id")+" "+rs.getString("name"));
        }

        //增
        String sql1 ="create table student(\n" +
                "           id int primary key auto_increment,\n" +
                "           name varchar(20),\n" +
                "\t\t\t\t\t age int,\n" +
                "\t\t\t\t\t birthday Date\n" +
                ")";
        st.execute(sql1);




        rs.close();
        st.close();
        con.close();

    }
}
