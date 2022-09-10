import java.util.Scanner;

public class Java8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数相加求和的数：");
        int math = scanner.nextInt();
        int i =1,sun=0;
        while(i<=math){
            sun+=i;
            i++;
        }
        System.out.println("求和得："+sun);

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("请输入偶数相加求和的数：");
        int math1 = scanner1.nextInt();
        int a=0,sum=0;
        do{
            sum += a;
            a+=2;
        }while(a<=math1);
        System.out.println("数中偶数相加求和得值："+sum);

        int b=0;
        for(int c=0;c<=100;c+=2){
            b+=c;
        }
        System.out.print("偶数和："+b);
    }
}
