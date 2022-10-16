package Text;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Java4 {
    @Test
    public void f01(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(new Integer(1));
        System.out.println(list);
    }
    @Test
    public void f02(){
        Integer i1 = 1;
        Integer i2 = new Integer(1);
        System.out.println(i1==i2);//false
    }
    @Test
    public void f03(){
        Integer i1 = 1;
        Integer i2 = 1;
        System.out.println(i1==i2);//true,值超过范围为false
    }
    @Test
    public void f04(){
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        System.out.println(i1==i2);//false
    }

    @Test
    public void f05(){
        //Integer -> 字符串
        Integer i1 = 123;
        String s = Integer.toString(i1);
        String s1 = String.valueOf(i1);
        System.out.println(s);
        System.out.println(s1);
    }
    public void f06(){
        //字符串 -> Integer 可能产生异常
        String i1 = "123";
        Integer s = Integer.parseInt(i1);//parse解析
        System.out.println(s);
    }

    //装箱和卸箱
    @Test
    public void f07(){
        int a=0;
        Integer i = new Integer(a);
        a = i.intValue();//手动完成
    }

    @Test
    public void f08(){
        int a = 0;
        Integer i = a;//自动装箱(JDK5开始支持)
        a = i;//自动卸箱
    }

    @Test
    public void f09(){
        String s1 = "abc";
        String s2 = "abc";
        String s3 = "abc";
        //s1,s2,s3共享一块空间
        String s4 = new String("abc");//开辟新的空间
    }
}
