package JDBC;

import java.util.ArrayList;

/**
 * Service层接口
 */
public interface StudentService{
    //查询所有学生的信息
    public abstract ArrayList<WorkStudent> findAll();
    //条件查询，根据id获取学生的信息
    public abstract WorkStudent findById(Integer id);
    //新增学生信息
    public abstract int insert(WorkStudent stu);
    //修改学生信息
    public abstract int update(WorkStudent stu);
    //删除学生信息
    public abstract int delete(Integer id);


}
