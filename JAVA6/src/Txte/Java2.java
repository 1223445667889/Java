package Txte;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Java2 {
    //保证它是公有的没有返回值的，没有参数的
    //外部的库 External Libraries 主要是帮助代码生成.class文件
    //外部的库 External Libraries 其次是帮助代码能进行单元测试
    @Test
    public void f01(){
        //声明的时候，最好采用父类的形式，也就是以父父接口去声明
        //原因是因为，关于可重复有序的操作方法，都是在接口中已经定义好了的
        //不利于多态
        List list = new ArrayList();
        //增
        list.add("中国");
        list.add("日本");
        list.add("中国");
        //查
        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    @Test
    public void f02(){
        //声明的时候，最好采用父类的形式，也就是以父父接口去声明
        //原因是因为，关于可重复有序的操作方法，都是在接口中已经定义好了的
        //不利于多态
        List list = new ArrayList();
        //增
        list.add("中国");
        list.add("日本");
        list.add("中国");
        //删
        list.remove(1);

        //查
        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    @Test
    public void f03(){
        //声明的时候，最好采用父类的形式，也就是以父父接口去声明
        //原因是因为，关于可重复有序的操作方法，都是在接口中已经定义好了的
        //不利于多态
        List list = new ArrayList();
        //增
        list.add("中国");
        list.add("日本");
        list.add("中国");
        //改
        list.set(1,"中华人名共和国");

        //查
        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
