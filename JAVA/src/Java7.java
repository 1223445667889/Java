import java.util.Scanner;

public class Java7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入名次：");
        int mingci = scanner.nextInt();
        switch (mingci){
            case 1:
                System.out.print("麻省理工夏令营");
                break;
            case 2:
                System.out.print("惠普笔记本电脑一部");
                break;
            case 3:
                System.out.print("移动硬盘一个");
                break;
            default:
                System.out.print("你将一无所有");
                break;
        }

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("请输入本次消费金额：");
        double money = scanner1.nextInt();
        System.out.println("是否换购：");
        System.out.println("1.满50，加两元换购商品1");
        System.out.println("2.满100，加三元换购商品2");
        System.out.println("3.满100，加十元换购商品3");
        System.out.println("4.满200，加十元换购商品4");
        System.out.println("5.满200，加二十元换购商品5");
        System.out.println("0.不换购");
        System.out.println("请选择：");
        int select = scanner1.nextInt();
        String goods = "不换购";
        switch(select){
            case 1:
                if(money>50){
                    money += 2;
                    goods = "商品1";
                }
                break;
            case 2:
                if(money>100){
                    money += 3;
                    goods = "商品2";
                }
                break;
            case 3:
                if(money>100){
                    money += 10;
                    goods = "商品3";
                }
                break;
            case 4:
                if(money>200){
                    money += 10;
                    goods = "商品4";
                }
                break;
            case 5:
                if(money>200){
                    money += 20;
                    goods = "商品5";
                }
                break;
        }
        System.out.println("消费金额："+money);
        System.out.println("成功换购："+goods);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的手机号：");
        String sh = scanner.next();
        if(sh.length() == 11 ){
            System.out.println("号码正确，请等待验证码");
        }
        else
            System.out.println("你输入的号码错误");
    }
}
