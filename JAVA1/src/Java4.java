import java.util.Scanner;

public class Java4 {
    public static void main(String[] args){
        //Object 生命类型
        //System.out.printf("八进制:%o，十进制:%d,十六进制:%x",20,20,20);//Ctrl+p(paranter(参数))

        //狮子
        /*Fujian4 fujian4 = new Fujian4();
        System.out.println(fujian4.show());
        fujian4.run();
        fujian4.jiao();
        System.out.println(fujian4.show()+"抢了一个"+fujian4.robBall());*/

        //各科成绩的总和与平均值
        /*Scanner scanner= new Scanner(System.in);
        Fujian4 fujian4 = new Fujian4();
        System.out.println("请输入java的成绩:");
        fujian4.java = scanner.nextInt();
        System.out.println("请输入c的成绩:");
        fujian4.c = scanner.nextInt();
        System.out.println("请输入db的成绩:");
        fujian4.db = scanner.nextInt();
        fujian4.sum();
        fujian4.average();*/

        //圆
        /*Scanner scanner= new Scanner(System.in);
        Fujian4 fujian4 = new Fujian4();
        System.out.println("请输入圆的半径:");
        fujian4.r = scanner.nextDouble();
        fujian4.c();
        fujian4.s();*/

        //榨汁
        /*Fujian4 fujian4 = new Fujian4();
        System.out.println(fujian4.zhazhi("苹果"));
        System.out.println(fujian4.zhazhi("菠萝"));
        System.out.println(fujian4.zhazhi("西瓜"));*/

        //学生信息管理表
        Fujian4 fujian4 = new Fujian4();
        fujian4.addName("张三");
        fujian4.addName("李四");
        fujian4.addName("王五");
        fujian4.show();
        System.out.println(fujian4.findName(0,4,"李四"));
    }
}
