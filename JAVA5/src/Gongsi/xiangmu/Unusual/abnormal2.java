package Gongsi.xiangmu.Unusual;

import java.util.InputMismatchException;
import java.util.Scanner;

public class abnormal2 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

     //   解决异常的思路：try catch
        try{
            System.out.println("请输入第一个数字(分子):");
            int number1 = scanner.nextInt();
            System.out.println("请输入第一个数字(分母):");
            int number2 = scanner.nextInt();
            System.out.println(number1+"/"+number2+"="+(number1/number2));
            System.exit(0);

        }catch(InputMismatchException ex){
            System.out.println("请输入正确的数字:");
            //ex.printStackTrace();//打印异常的栈信息
            System.out.println(ex.getMessage());//打印异常的信息 null
        }catch(ArithmeticException ex){
            System.out.println("分母不能为0!");
            System.out.println(ex.getMessage());//打印异常的信息 /by zero
        }finally{//finally 最终  如果出现异常，没有抓取到 也要执行这段代码 return也挡不住
           /* try{睡眠
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }*/
            System.out.println("资源释放");
        }
        System.out.println("程序结束!");
    }
}
