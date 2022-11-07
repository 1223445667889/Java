package OOP.Test.Test;

/**
 * 构造器(Constructor): 对对象的初始化，没有返回值，方法名和类名一致，创建对象时，系统会自动调用该类，完成对象的初始化。
 *                     [修饰符] 方法名(形参列表){方法体};
 *                     一个类可以定义多个不同的构造器
 *                     如果没有定义构造器，系统会自动生成一个默认的无参的构造器
 *                     一旦定义了自己的构造器，会覆盖默认的构造器。
 *
 * this关键字:java虚拟机会给每一个对象分配this，代表当前对象，使用this解决当前变量命名的问题。
 */
public class ElementaryKnowledge1 {
    public static void main(String[] args){
        Person p = new Person();
        System.out.println(p.age);
    }
}

/**
 * 构造器的例子及语法
 */
class Person{
    String name;
    int age;
    public Person(){//无参的构造器
        age = 18;//固定年龄
    }
    public Person(String pName,int pAge){
        name = pName;
        age = pAge;
    }
    public Person(String pName){//构造器的重载
        name = pName;
    }
}

/**
 * this的例子及应用
 */
class D{
    String name;
    int age;
    public D(String name,int age){
        this.name = name;
        this.age = age;
    }
}