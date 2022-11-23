package JDBC;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class StudentDaoImpl implements StudentDao{
   public static void main(String[] args){

   }

    //查询所有学生的信息
    @Override
    public ArrayList<WorkStudent> findAll() {
       ArrayList<WorkStudent> list = new ArrayList<>();
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        try {
            //注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取数据库连接
            conn = DriverManager.getConnection("jdbc；mysql://localhost:3306/demo","root","123456789");
            //获取执行者对象
            stat = conn.createStatement();
            //执行sql语句，并接收返回的结果集
            String sql = "select * from student";
            rs = stat.executeQuery(sql);

            //处理结果集
            while(rs.next()){
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                Integer age = rs.getInt("age");
                Date birthday = rs.getDate("birthday");

                //封装对象
                WorkStudent ws = new WorkStudent(id,name,age,birthday);
                //将WorkStudent保存在集合中
                list.add(ws);

            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            //释放资源
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(stat != null){
                try {
                    stat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        //将集合对象返回
        return null;
    }

    //条件查询，根据id获取学生的信息
    @Override
    public WorkStudent findById(Integer sid) {
        WorkStudent ws = new WorkStudent();
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        try {
            //注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取数据库连接
            conn = DriverManager.getConnection("jdbc；mysql://localhost:3306/demo","root","123456789");
            //获取执行者对象
            stat = conn.createStatement();
            //执行sql语句，并接收返回的结果集
            String sql = "select * from student where id = '"+sid+"'";
            rs = stat.executeQuery(sql);

            //处理结果集
            while(rs.next()){
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                Integer age = rs.getInt("age");
                Date birthday = rs.getDate("birthday");

                //封装对象
                ws.setId(id);
                ws.setName(name);
                ws.setAge(age);
                ws.setBirthday(birthday);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            //释放资源
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(stat != null){
                try {
                    stat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        //将集合对象返回
        return ws;
    }

    //添加学生信息
    @Override
    public int insert(WorkStudent stu) {
        Connection conn = null;
        Statement stat = null;
        int result = 0;
        try {
            //注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取数据库连接
            conn = DriverManager.getConnection("jdbc；mysql://localhost:3306/demo","root","123456789");
            //获取执行者对象
            stat = conn.createStatement();

            //执行sql语句，并接收返回的结果集
            Date d = stu.getBirthday();
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
           String birthday = sdf.format(d);
           String sql = "insert into student values ('"+stu.getId()+"','"+stu.getName()+"','"+stu.getAge()+"','"+birthday+"')";
           result = stat.executeUpdate(sql);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            //释放资源
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(stat != null){
                try {
                    stat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        //将结果返回
        return result;
    }

    //修改学生信息
    @Override
    public int update(WorkStudent stu) {
       Connection conn = null;
       Statement stat = null;
       int result =  0;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","123456789");
            stat = conn.createStatement();
            Date d = stu.getBirthday();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String birthday = sdf.format(d);
            String sql = "update student set id='"+stu.getId()+"','"+stu.getName()+"','"+stu.getAge()+"',birthday='"+birthday+"' where id='"+stu.getId()+"'";
            result = stat.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(stat != null){
                try {
                    stat.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return result;
    }


    //删除数据
    @Override
    public int delete(Integer sid) {
       Connection conn = null;
       Statement stat = null;
       int result = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","123456789");
            stat = conn.createStatement();
            String sql = "delete from student where id = '"+sid+"'";
            result = stat.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(stat != null){
                try {
                    stat.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return result;
    }
}




















