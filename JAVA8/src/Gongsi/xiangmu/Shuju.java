package Gongsi.xiangmu;

import java.util.Scanner;

public class Shuju {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a =1;
        do {
            try {
                System.out.println("请输入int类型的数据：");
                int i = scanner.nextInt();
                System.out.println(i);
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("请输入正确int类型的数据：");
        }while(a>1);
    }
}
