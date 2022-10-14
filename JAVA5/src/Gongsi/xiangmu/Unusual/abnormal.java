package Gongsi.xiangmu.Unusual;

import java.util.Scanner;

public class abnormal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        /*异常也是一个类
        java.util.InputMismatchException
        java.lang.NullPointerException 空指针异常
        java.lang.ArrayIndexOutOfBoundsException 下标越界异常
        java.lang.ArithmeticException
        */
        System.out.println("请输入一个数字：");
        int number = scanner.nextInt();
        System.out.println();
        System.out.println("数字是："+number);
    }
}
