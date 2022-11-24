package JDBCUtil;

import MYSQL.Employee;

import java.util.ArrayList;
import java.util.Map;

public class EmployeeDao {

    /***
     * 添加员工
     */
    public void addEmployee(Employee e){
        String sql = "insert into employee value(?,?,?,?,?,?,?)";
        Object[] objects={e.getId(),e.getName(),e.getLocation(),e.getSex(),e.getJoinDate(),e.getSalary(),e.getDeptId()};
        JDBCUtils.update(sql,objects);
    }

    /**
     * 根据查询ID删除员工
     * @param e
     */
    public void deleteEmployee(Employee e){
        String sql = "delete from employee where id = ?";
        JDBCUtils.update(sql,e.getId());
    }

    /**
     * 修改员工数据
     * @param e
     */
    public void updateEmployee(Employee e){
        String sql = "update employee set name=?,location=?,ismale=?,joinDate=?,salary=?,where id = ?";
        Object[] objects = {e.getName(),e.getLocation(),e.getSex(),e.getJoinDate(),e.getSalary(),e.getDeptId(),e.getId()};
        JDBCUtils.update(sql,objects);
    }

    /**
     * 查询员工信息
     * @param e
     */
    public void selectEmployee(Employee e){
        String sql = "select * from employee where id = ?";
        Class<?> clazz = e.getClass();
        System.out.println(clazz);
        ArrayList<?> list = JDBCUtils.select(sql,clazz,e.getId());
        for(Object o:list){
            System.out.println(o);
        }
    }

    /**
     * Map查询
     * @param e
     */
    public void selectMapEmployee(Employee e){
        String sql = "select * from employee where id = ?";
        ArrayList<Map> list = JDBCUtils.selectMap(sql,e.getId());

        for(Map<String,Object> map:list){
            for(Map.Entry<String,Object> entry : map.entrySet()){
                System.out.println(entry);
            }
        }
    }

    public void select(Employee e){
        String sql = "select e.*,d.name dname from employee e,department d where e.id=? ";
        ArrayList<Map> list = JDBCUtils.selectMap(sql,e.getId());
        for(Map<String,Object> map:list){
            for(Map.Entry<String,Object> entry:map.entrySet()){
                System.out.println(entry);
            }
        }
    }
}
