package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCAndMySQL {
    public static void main(String[] args)throws Exception{
        //加载驱动类
        Class.forName("com.Mysql.jdbc.Driver");

        //url 统一资源定位符 协议 IP地址 端口 资源名(网页)
        //                协议 主机名 端口 数据库名(数据库)
        String url="jdbc:mysql57://127.0.0.1:3306/day01_test01_market";
        String user = "root";
        String password = "3453543";

        Connection con = DriverManager.getConnection(url,user,password);
        System.out.println("连接成功，创建数据库的连接对象 = "+ con);

        //获取数据库操作对象
        Statement stmt = con.createStatement();

        //执行sql
        String sql = "insert into dept dept(deptno,dname,loc) values(50,'人事部','北京')";
        //专门执行的MDl语句的(insert delete update)
        //返回值是
        int count = stmt.executeUpdate(sql);
        System.out.println(count == 1?"保存成功":"保存失败");


        //释放资源
        if(stmt != null){
            stmt.close();
        }
        if(stmt != null){
            con.close();
        }
    }
}
