import java.util.Arrays;
import java.util.Scanner;

public class Java12 {
    public static void main(String[] args){

        //比较两个数相加是否相等

        final double jingdu = 0.0001;//小数是模拟出来的数，近似值，无法用==  != 进行比较     定义精度范围
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个值：");
        double d1 = scanner.nextDouble();
        System.out.print("请输入第一个值：");
        double d2 = scanner.nextDouble();
        System.out.print("请输入第一个值：");
        double d3 = scanner.nextDouble();
        if(d1+d2 <= d3 + jingdu && d1+d2>=d3-jingdu)
            System.out.println("d1+d2==d3");
        else
            System.out.println("d1+d2!=d3");
        System.out.println("程序结束 \n\n");

        //给出五名成员的成绩

        int[] arr;
        arr = new int[]{60,60,60,60,60,60};
        int[] arr2 = {12,13,14,15,15,156};//可省略new int[]
        //arr[1] = 60;
        //arr[2] = 60;
        //arr[3] = 60;
        //arr[4] = 60;
        //arr[5] = 60;
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);

        System.out.println(args.length);
        int[] arr3 = {81,82,83,84,85,86,87,89,90};
        System.out.println("数组里面的信息：");
        int sum = 0;
        for(int i =0;i<arr.length;i++){
            sum+=arr3[i];
            System.out.println(arr3[i]);
        }
        System.out.println(sum);
        System.out.println("请输入一个数：");
        int number = scanner.nextInt();
        boolean bFound = false;
        for (int i = 0; i < arr3.length; i++) {
            if(number == arr3[i]){
                bFound = true;
                break;
            }
        }
        System.out.println(bFound?"找到了\n\n":"没有找到\n\n");

        //以表格的形式输出五笔购物金额及总金额

        Scanner scanner2 = new Scanner(System.in);
        double[] arr4 = new double[5];
        for (int i = 1; i <= arr4.length; i++) {
            System.out.println("请输入第" + i + "笔的金额：");
            arr4[i-1] = scanner2.nextDouble();
        }
        System.out.println("序号\t金额");
        double sum1 = 0.0;
        for (int i = 1; i <= arr4.length; i++) {
            System.out.println(i + "\t" + arr4[i-1]);
            sum1+=arr4[i-1];
        }
        System.out.println("总金额为：" + sum1);

        int arr5[] = {1,3,2,5,46,23};
        Arrays.sort(arr5);//排序
        System.out.println(arr5);//打印数组名时，输出的是，[表示数组，I表示的是整数，@8位十六进制代表的内存地址
        System.out.println(Arrays.toString(arr5));
    }
}
