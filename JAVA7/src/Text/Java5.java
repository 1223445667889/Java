package Text;

import org.junit.Test;

public class Java5 {
    @Test
    public void f01(){
        String s1 = "abc";
        String s2  = "qwe";
        //字符串的 长度，比较字符串，大小写转换，拼接，方法
        System.out.println("s1的长度："+s1.length());
        if(s1.equals("abc")){
            System.out.println("相等");
        }else{
            System.out.println("不相等");
        }
        if(s1.equalsIgnoreCase("abc")){
            System.out.println("相等");
        }else{
            System.out.println("不相等");
        }
        System.out.println("转成小写"+s1.toLowerCase());
        System.out.println("转成小写"+s1.toUpperCase());
        System.out.println("拼接后的字符串时"+(s1+s2));
        System.out.println("拼接后的字符串时"+(s1.concat(s2)));//concat 拼接
    }
    @Test
    public void f02(){
        String str = "撒虽然菲尔额撒";
        int pos1 = str.indexOf('菲');
        int pos2 = str.indexOf('撒',6);
        int pos3 = str.indexOf("虽然");
        int pos4 = str.indexOf("虽然",4);
        System.out.println("pos1:"+pos1);
        System.out.println("pos2:"+pos2);
        System.out.println("pos3:"+pos3);
        System.out.println("pos4:"+pos4);
    }
}
