package Gongsi.xiangmu.Unusual;

import java.util.Scanner;

public class abnormal1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

            System.out.println("请输入一个数字：");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                System.out.println("数字是:" + number);
            } else {
                System.out.println("请输入正确的数字：");
            }
    }
}
