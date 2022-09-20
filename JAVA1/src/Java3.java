import java.util.Scanner;

public class Java3 {
    public static void main(String[] args){
        //将Fujian3中School类理解成一种引用数据类型，只不过是自定义的引用数据类型
        //声明
/*        Fujian3 fujian3;
        //分配空间
        fujian3 = new Fujian3();
        //用点访问方法
        fujian3.show();//null 0 0
        //用点访问属性
        fujian3.name = "德玛西亚学院";
        fujian3.jsNumber = 36;
        fujian3.jfNumber = 36;
        //用点访问方法
        fujian3.show();*/



        //游客信息
        /*Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("请输入你的姓名:");
            String name = scanner.next();
            if(name.equals("n"))break;
            System.out.println("请输入你的年龄:");
            int age = scanner.nextInt();
            Fujian3 fujian3 = new Fujian3();
            fujian3.name = name;
            fujian3.age = age;
            fujian3.show();
        }
        System.out.println("退出程序");*/


        //密码修改
        /*Fujian3 fujian3 = new Fujian3();
        fujian3.name="Ruidemi";
        fujian3.password="11111";

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的用户名:");
        String name = scanner.next();
        System.out.println("请输入你的密码:");
        String password = scanner.next();

        if(name.equals(fujian3.name) && password.equals(fujian3.password)){
            System.out.println("请输入你的新密码：");
            fujian3.password = scanner.next();
            System.out.println("密码修改成功！，你的密码是："+password);
        }
        else
            System.out.println("用户名或密码不正确！没有修改权限。");*/


        //客户积分回馈
        Scanner scanner = new Scanner(System.in);
        Fujian3 fujian3 = new Fujian3();
        System.out.print("请输入你的类型卡(金卡/普卡):");
        String type = scanner.next();
        fujian3.type = type;
        System.out.print("请输入你的积分:");
        int jifen = scanner.nextInt();
        fujian3.jifen = jifen;
        fujian3.show();
        fujian3.huikui();

    }
}
