import jdk.jshell.EvalException;

import java.util.Arrays;
import java.util.Scanner;

public class Java13 {
    public static void main(String[] args){
        int arr[] = {5,3,1,23,355,4657};
        int arr1[] = {5,3,1,23,355,4657};
        System.out.println(Arrays.equals(arr,arr1));//Arrays.equals()
        Arrays.fill(arr1,11);//Arrays.fill()
        System.out.println(Arrays.toString(arr));
        int[] arr2 = Arrays.copyOf(arr1,8);//Arrays.copyOf()
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr);//升序
        System.out.println(Arrays.toString(arr));
        int pos = Arrays.binarySearch(arr,13);//Arrays.binarySearch()没有找到，返回插入点的下标取负再-1
        System.out.println("pos:"+pos);

        //升序与降序

        char[] arr3 = {'a','c','g','t','n','s','z'};
        System.out.print("原字符序列：");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + "    ");
        }
        System.out.println();
        Arrays.sort(arr3);
        System.out.print("升序序列:");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+"   ");
        }
        System.out.println();
        System.out.print("降序序列:");
        for (int i = arr3.length - 1; i >= 0; i--) {
            System.out.print(arr3[i]+"   ");
        }
        System.out.println(" \n ");

        //双重循环  3个班，输入各班4各成员的成绩，求个班的平均成绩

        Scanner scanner = new Scanner(System.in);
        for(int i =1;i<=3;i++){
            System.out.println("请输入第"+i+"各班的学生成绩：");
            int sum = 0;
            for(int j = 1;j<=4;j++){
                System.out.print("第"+j+"个学生的成绩：");
                int cj = scanner.nextInt();
                sum += cj;
            }
            System.out.println("第"+i+"的平均成绩为："+(sum/4));
            System.out.println(" \n ");
        }
    }
}
