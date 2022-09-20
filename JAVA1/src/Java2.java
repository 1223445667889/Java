import java.io.File;
import java.util.Arrays;

public class Java2 {
    public static void main(String[] args){
        f01(1);
        f01(0.2);
        f03(18,"张三");
        int[] arr= new int[]{1,3,5,7,9};
        f04(arr);
        System.out.println(Arrays.toString(arr));
        //f04();
        f04(1);
        f04(31,33);
        f04(34,54,66);
        showFiles(new File("D:\\course\\JAVA"));
        count(100);
        System.out.println(count(100));
    }
    public static void f01(double money){
        System.out.println("fo1(double money)被调用");
    }

    public static void f01(int age) {
        System.out.println("f01(int age)被调用");
    }

    public static void f03(int age,String name){
        System.out.println("f01(int age)被调用");
        System.out.println("年龄:"+age+"   姓名:"+name);
    }

    //函数可变参数
    public static void f04(int... y){
        System.out.println("f01(int...)被调用");
        System.out.println(Arrays.toString(y));
        //自动循环x数组，也知道何时结束，每次去出一个送到变量x上
        if(y!=null) {
            for (int i : y) {//foreach输出（增强版for循环）没有下标
                System.out.println(i);
            }
            y[0]++;//引用变量存储的地址值
            System.out.println(Arrays.toString(y));
            y = null;//值得传递，赋值；
            System.out.println(Arrays.toString(y));
        }
        else
            System.out.println("没有值");
    }


    //展示文件夹下所有文件，包含子文件夹下的文件
    public static void showFiles(File file){
        File[] files = file.listFiles();//枚举该文件夹file对象下的文件或文件夹的对象
        for(File f : files){
            if(f.isFile())
                System.out.println(f.getName());//文件
            if(f.isDirectory())
                showFiles(f);//递归调用文件夹
        }
    }


    //1加100的递归
    public static int count(int shu){
        if(shu==1) return 1;
        return count(shu-1)+shu;
    }
}
