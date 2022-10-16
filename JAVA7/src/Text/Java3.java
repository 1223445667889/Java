package Text;

import Gongsi.xiangmu.meiju.Sex;
import Gongsi.xiangmu.meiju.Student;

public class Java3 {
    public static void main(String[] args){
        Student student = new Student();
        student.sex = Sex.FEMAIL;//限定其值，防止乱写
        System.out.println(student.sex);
        student.sex = Sex.MAIL;
        System.out.println(student.sex);
    }
}
