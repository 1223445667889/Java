package Txte;

import Gongsi.xiangmu.Dog1;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Java3 {
    @Test
    public void f01(){
        List list = new ArrayList();

        list.add(new Dog1("大大","雪纳瑞"));
        list.add(new Dog1("啊啊","拉布拉多"));
        list.add(new Dog1("等等","土狗"));
        list.add(new Dog1("弟弟","藏獒"));
        list.add(new Dog1("威尔","柯基"));

        System.out.println("共有"+list.size() +"条狗");
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //contains,remove如果不在Dog1中改写equals,那它就是比较的是地址，不会比较字符串，会出现false。
        System.out.println(list.contains(new Dog1("威尔","柯基")));
        System.out.println("---------------");

        list.remove(new Dog1("啊啊","拉布拉多"));//返回的是真假
        //list.remove(2);//返回的是Dog1("啊啊","拉布拉多")
        System.out.println(new Dog1("啊啊","拉布拉多"));
        System.out.println("----------------");
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    @Test
    public void f02(){
        LinkedList list1 = new LinkedList();

        list1.add(new Dog1("大大","雪纳瑞"));
        list1.add(new Dog1("啊啊","拉布拉多"));
        list1.add(new Dog1("等等","土狗"));
        list1.add(new Dog1("弟弟","藏獒"));
        list1.add(new Dog1("威尔","柯基"));

        //首尾各增加一个
        list1.addFirst(new Dog1("简爱","牧羊犬")) ;
        list1.addLast(new Dog1("浪漫","二哈")) ;

        for(int i = 0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }

        //首尾各读取一个()
        System.out.println("-------------");
        Dog1 dog1First = (Dog1)list1.getFirst();
        Dog1 dog1Last = (Dog1)list1.getLast();
        System.out.println(dog1First);
        System.out.println(dog1Last);

        for(int i = 0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }
    }
}
