package JDBC;

import java.util.ArrayList;

public class StudentServiceImpl implements StudentService{

    private StudentDao dao = new StudentDaoImpl();

    @Override
    public ArrayList<WorkStudent> findAll() {
        return dao.findAll();
    }

    @Override
    public WorkStudent findById(Integer id) {
        return dao.findById(id);
    }

    //新增学生信息
    @Override
    public int insert(WorkStudent stu) {
        return dao.insert(stu);
    }

    //修改学生信息
    @Override
    public int update(WorkStudent stu) {
        return dao.update(stu);
    }

    //删除学生信息
    @Override
    public int delete(Integer id) {
        return dao.delete(id);
    }
}
