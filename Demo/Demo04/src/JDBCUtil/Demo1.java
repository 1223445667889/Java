package JDBCUtil;

import MYSQL.Employee;

import java.util.Date;

public class Demo1 {
    public static void main(String[] args){
        Employee e = new Employee(9999,"xxx","yyy","男",new Date(),10000,10);//传参类型
        //Employee e1 = new Employee("张三","北京三环","男",new Date(2022-03-03),10000,1,1);
        EmployeeDao employeeDao = new EmployeeDao();
//        employeeDao.select(e);
//        employeeDao.deleteEmployee(e);
//        employeeDao.selectMapEmployee(e);
        employeeDao.updateEmployee(e);
    }
}
