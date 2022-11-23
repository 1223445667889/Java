package JDBC;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

/**
 * 定义控制层 StudentController,提前准备好对应的测试方法
 */
public class StudentController{
    private StudentService service = new StudentServiceImpl();

    @Test
    public void findAll(){
        //查询所有学生信息
        ArrayList<WorkStudent> list = service.findAll();
        for(WorkStudent s : list){
            System.out.println(s);
        }
    }
    @Test
    public void findById(){
        //条件查询,根据Id查询学生信息
        WorkStudent w =service.findById(3);
        System.out.println(w);
    }
    @Test
    public void insert(){
        //新增学生信息
        WorkStudent stu = new WorkStudent(5,"2022-03-02",23,new Date());
        int result = service.insert(stu);
        if(result != 0){
            System.out.println("新增成功");
        }else{
            System.out.println("新增失败");
        }
    }
    @Test
    public void update(){
        //修改学生信息
        WorkStudent s = service.findById(5);
        s.setName("大苏打");
        int result = service.update(s);
        if(result != 0){
            System.out.println("修改成功");
        }else{
            System.out.println("修改失败");
        }
    }
    @Test
    public void delete(){
        //删除学生信息
        int result = service.delete(5);

        if(result != 0){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
    }

}
