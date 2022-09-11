import java.util.Scanner;

public class Java9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("购物结算");
        System.out.println("请选择商品编号：");
        System.out.println("1.T恤  2.网球鞋  3.网球拍");

        //方法一：
        String jx = "Y";
        while(jx.equals("Y")){
            System.out.print("请输入商品编号：");
            int selact = scanner.nextInt();
            switch(selact){
                case 1:
                    System.out.println("T恤 100元");
                    break;
                case 2:
                    System.out.println("网球鞋  200元");
                    break;
                case 3:
                    System.out.println("网球怕  300元");
                    break;
            }
            System.out.println("是否继续(Y/N):");
            jx = scanner.next();
        }
        System.out.print("结束");


        //方法二：
        String jx1;
        do{
            System.out.print("输入商品编号：");
            int selact1 = scanner.nextInt();
            switch(selact1){
                case 1:
                    System.out.println("T恤 100元");
                    break;
                case 2:
                    System.out.println("网球鞋  200元");
                    break;
                case 3:
                    System.out.println("网球怕  300元");
                    break;
            }
            System.out.println("是否继续(Y/N):");
            jx1 = scanner.next();
        }while(jx1.equals("Y"));
        System.out.print("结束");
    }
}
