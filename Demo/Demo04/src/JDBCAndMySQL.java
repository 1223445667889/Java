import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCAndMySQL {
    public static void main(String[] args)throws Exception{
        //加载驱动类
        Class.forName("com.mysql.cj.jdbc.Driver");

        //url 统一资源定位符 协议 IP地址 端口 资源名(网页)
        //                协议 主机名 端口 数据库名(数据库)
        String url="jdbc:mysql://127.0.0.1:3306/day01_test01_market";
        String user = "root";
        String password = "123456789";

        Connection con = DriverManager.getConnection(url,user,password);
        System.out.println("连接成功，创建数据库的连接对象 = "+ con);

        //获取数据库操作对象
        Statement stmt = con.createStatement();

        //执行sql
        String sql = "insert into  company(id,name,location,buildDate) values('0','航天公司','北京二环','2000-09-01')";
        stmt.executeUpdate(sql);

        String sql1 ="delete  from company where id = 5";
        stmt.executeUpdate(sql1);
        System.out.println("删除成功！");

        con.close();

    }
}
