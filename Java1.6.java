import java.util.Scanner;

public class Java6 {
    public static void main(String[] args){
        //幸运抽奖
        Scanner scanner = new Scanner(System.in);
        System.out.println("幸运抽奖：\n");
        System.out.println("请输入四位会员号：");
        int id =scanner.nextInt();
        int baiwei = id / 100 % 10;
        int luck = (int)(Math.random()*10);
        System.out.println("你的幸运数字是："+luck);
        if(baiwei == luck)System.out.println("奖励MP3一个。");
        else System.out.println("感谢下次光临。");

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("请输入是否是会员(Y/N): ");
        String yesno = scanner.next();
        System.out.println("请输入购物金额: ");
        int money = scanner.nextInt();
        double zk = 1.0;
        if(yesno.equals("Y")){
            System.out.println("是会员");
            if(money >= 200) zk = 0.75;
            else  zk =0.8;
        }else{
            System.out.println("不是会员");
            if(money >= 100) zk = 0.9;
        }
        System.out.println("实际支付："+ money * zk);
    }
}

