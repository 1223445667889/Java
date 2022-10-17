package Text;

import java.util.Arrays;
import java.util.Scanner;

public class Java1 {
    public static void main(String[] args){
      /*  Scanner scanner = new Scanner(System.in);*/

      /*  do {
            System.out.println("请输入一个数字：");
            Scanner scanner = new Scanner(System.in);//如果不放在循环内 scanner.hasNextInt()的值就一直为上一个创建的值，就会死循环
            if (scanner.hasNextInt()) {//
                int number = scanner.nextInt();
                System.out.println("数字是:" + number);
                break;
            } else {
                System.out.println("请输入正确的数字：");
            }
        }while(1>0);*/


 /*       Scanner input = new Scanner(System.in);

        System.out.println("请输入长度为6的字符串：");

        String str = input.nextLine();

        while (str.length() != 6) {

             System.out.println("请输入长度为6的字符串：");

             str = input.nextLine();

        }
        System.out.println("程序退出，你输入了：" + str);*/


        int[] Arr1 = {1,6,2,7,9,3,5};
        for(int i=0;i<Arr1.length-1;i++){
            for(int j=0;j<Arr1.length-i-1;j++){
                if (Arr1[j] > Arr1[j+1]){
                    int c=Arr1[j];
                    Arr1[j]=Arr1[j+1];
                    Arr1[j+1]=c;
                }
            }
        }
        System.out.println(Arrays.toString(Arr1));


        int[][] Arr = {{4,2,6},{3,1,5},{9,7,10},{11,8,12}};
        for(int i=0;i<Arr.length-1;i++){
            for(int j=0;j<Arr.length-i-1;j++){
                for(int k =j-1;k<2;k++){
                    if(Arr[j][k]>Arr[j+1][k]){
                        int arr[][] = new int[1][1];
                        arr[0][0] = Arr[j][j+1];
                        Arr[j][j+1] = Arr[j+1][1];
                        Arr[j+1][1] =arr[0][0];
                    }
                }
            }
        }
        System.out.println(Arrays.toString(Arr));
        for(int i=0; i<Arr.length; i++) {
            for(int j=0; j<Arr[i].length; j++) {
                System.out.println(Arr[i][j]+" ");
            }
        }
    }
}
