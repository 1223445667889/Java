import java.util.Scanner;

public class Java3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的姓名");
        String name =scanner.next();
        System.out.println("你输入的姓名是："+ name);
        System.out.println("请输入整数:");
        int age =scanner.nextInt();
        System.out.println("请输入整数:");
        double money =scanner.nextDouble();
        System.out.println("整数,"+ age + "小数，"+money);
        System.out.println("请输入张三三门功课的成绩：");
        System.out.println("JAVA：");
        int JAVA = scanner.nextInt();
        System.out.println("PS:");
        int PS = scanner.nextInt();
        System.out.println("SQL:");
        int SQL = scanner.nextInt();
        System.out.print("JAVA和SQL的差："+(JAVA-SQL));
        System.out.print("平均值："+((JAVA+PS+SQL)/3));
    }
}
