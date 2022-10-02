import java.util.Arrays;
import java.util.Scanner;

public class Java1 {
    public static void main(String[] args){
        //矩形
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        int a = 5;
        int sum = 0;
        for(int i =1;i<=a;i++){
            for(int j =1;j<=a;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        //直角
        for(int i=1;i<=a;i++){
            for(int j = 1;j<=i;j++){//for(int j = 1;j<=i*2-1;j++)  //for(int j = 1;j<=a-1;j++)
                System.out.print("*");
            }
            System.out.println();
        }

        //等腰
        for(int i =1;i<=a;i++){
            for(int j=1;j<=a-i;j++){
                System.out.print("   ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j>1 && j<2*i-1 && i<a){
                    System.out.print("   ");
                }
                else
                    System.out.print(" * ");
            }
            for(int j=1;j<=a-i;j++){
                System.out.print("   ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j>1 && j<2*i-1 && i<a){
                    System.out.print("   ");
                }
                else
                    System.out.print(" * ");
            }

            System.out.println(" ");
        }

        //九九乘法表
        for(int i = 1;i<=9;i++)
        {
            for(int j = 1; j<=i;j++)
            {
                int sum1 = i * j;
                System.out.print(j+"*"+i+"="+sum1+"  ");
            }
            System.out.println( );
        }
        System.out.println( );


        // 冒泡排序
        int[] arr={118,23,87,4,16,58,8};
        for(int i=0;i<arr.length-1;i++) {
            for(int j=0;j<arr.length-1-i;j++) {
                if(arr[j]>arr[j+1]) {
                    int c = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=c;
                }
            }
        }
        System.out.println(Arrays.toString(arr));


        //二维数组
        int[][] arr2={
                {3,56,7,87,93,26,13,-3},
                {1,4,67,843,234,76,2,-32},
                {12,3245,67,84,88,4,8},
        };
        for(int i =0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j]+"\t");
            }
            System.out.println();
        }
        
        //心
        for(float y = 1.5f;y>-1.5f;y-=1.0f){
            for(float x=-1.5f;x<1.5f;x+=0.05f){
                float a = x*x+y*y-1;
                if((a*a*a-x*x*y*y*y)<0.0f){
                    System.out.print("*");
                }
                else{
                    System.out.print("");
                }
            }
            System.out.print("\t");
        }
    }
}
