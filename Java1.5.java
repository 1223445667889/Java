import java.util.Scanner;

public class Java5 {
    public static void main(String[] args){
        char c1 = '中';
        int i =1;
        int c2 = (int)(c1+i);
        System.out.println(c2);
        //关系运算符 < > <= >= == !=
        int a = 10;
        int b = 10;
        boolean r1 = a>=b;
        System.out.println(r1);

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入成绩：");
        int score = scanner.nextInt() ;
        boolean flag = score > 60;
        if(flag){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int score1 = scanner1.nextInt();
        if(score1>=90){
            System.out.println("优秀");
        }
        System.out.println("over");


        Scanner scanner2 = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int score2 = scanner2.nextInt();
        if(score2 >= 90 && score2 <= 100){
            System.out.println("牛逼");
        }else if(score2 >= 80 && score2 < 90){
            System.out.println("漂亮");
        }else if(score2 >= 70 && score2 < 80){
            System.out.println("精彩");
        }else if (score2 >= 60 && score2 < 70){
            System.out.println("可以");
        }else{
            System.out.println("革命尚未成功，同志仍需努力");
        }

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("请输入名次(1~3)：");
        int mingci = scanner3.nextInt();
        if(mingci == 1) System.out.println("麻省理工夏令营");
        else if(mingci == 2) System.out.println("暗夜精灵笔记本一台");
        else if(mingci == 3) System.out.println("移动硬盘一个");
        else System.out.println("你将一无所有");

    }
}
