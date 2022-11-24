package JDBCUtil;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JDBCUtils {
    public static Connection conn;
    public static PreparedStatement ps;
    public static ResultSet rs;

    /**
     * 注册驱动包
     */
    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据库的链接
     */
    public static void getConnection(){
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","123456789");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * 释放资源
     */
    public static void closeConnection(){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(ps != null){
            try {
                ps.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    /**
     * 改
     * @param sql
     * @param objects
     */
    public static void update(String sql,Object ...objects){
        getConnection();
        try {
            ps = conn.prepareStatement(sql);
            if(objects != null){
                for(int i=0;i< objects.length;i++){
                    ps.setObject(i+1,objects[i]);
                }
            }
            int s = ps.executeUpdate();
            System.out.println(s);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    /**
     * 查询
     * @param sql
     * @param clazz
     * @param objects
     * @param <T>
     * @return
     */
    public static <T>ArrayList<T> select(String sql,Class<T> clazz,Object ...objects){
        getConnection();
        ArrayList<T> arrayList = new ArrayList<>();

        try {
            ps = conn.prepareStatement(sql);
            T t = clazz.newInstance();
            if(objects!=null){
                for(int i=0;i<objects.length;i++){
                    ps.setObject(i+1,objects[i]);
                }
            }
            //返回查询得数据
            rs = ps.executeQuery();
            ResultSetMetaData date = rs.getMetaData();

            while(rs.next()){
                System.out.println(clazz);
                for(int j=1;j<date.getColumnCount();j++){
                    //获取列名
                    String columnName = date.getColumnLabel(j);
                    Field field =null;
                    try {
                        field = clazz.getDeclaredField(columnName);
                        char[] chars = columnName.toCharArray();
                        chars[0] -= 32;
                        columnName = "set"+String.valueOf(chars);
                        //获取列值
                        Object o = rs.getObject(j);
                        Method method = clazz.getDeclaredMethod(columnName,field.getType());
                        try {
                            method.invoke(t,o);
                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    } catch (NoSuchFieldException e) {
                        e.printStackTrace();
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    }
                }
                arrayList.add(t);
            }
            return arrayList;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Map查询
     * @param sql
     * @param objects
     * @param <T>
     * @return
     */
    public static <T> ArrayList<Map> selectMap(String sql, Object ...objects){
        getConnection();
        ArrayList<Map> list = new ArrayList<>();

        try {
            ps = conn.prepareStatement(sql);
            if(objects!=null){
                for(int i=0;i<objects.length;i++){
                    ps.setObject(i+1,objects[i]);
                }
            }
            rs = ps.executeQuery();
            while(rs.next()){
                Map<String,Object> map = new HashMap<>();
                ResultSetMetaData date = rs.getMetaData();
                for(int j=1;j<=date.getColumnCount();j++){
                    String name = date.getColumnLabel(j);
                    Object o= rs.getObject(j);
                    map.put(name,o);
                }
                list.add(map);
            }
            return list;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
