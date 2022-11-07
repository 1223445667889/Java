package OOP.Test.Test;

import OOP.Example.Test.AccountTest;
import OOP.Example.Test.EncapsulationTest;

/**
 * 封装(encapsulation):把抽象出来的数据[属性]和对数据的操作[方法]封装在一起，数据保护在内部，
 *                    程序的其他部分只能通过被授权的操作，才能对数据进行操作。
 *                    隐藏实现的细节，可以对数据进行验证，保证安全合理。
 *                    步骤：属性的私有化，提供一个公共的set方法，由于对属性的判断并赋值，提供一个公共的get方法，获取数据。
 *
 */
public class Encapsulation {
    public static void main(String[] args){
        EncapsulationTest et = new EncapsulationTest("风",23,1200000,"刺客");
//        et.setName("刘皮");
//        et.setAge(22);
//        et.setJob("护士");
//        et.setSalary(10000);
        System.out.println(et.info());
    }
}

class Account{
    public static void main(String[] args){
        AccountTest at = new AccountTest("张三","123456",2000);
        at.showInfo();
    }
}