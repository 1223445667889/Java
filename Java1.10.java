import java.util.Scanner;

public class Java10 {
    public static void main(String[] args){
        /*
        使用do-while循环实现输出摄氏度与华氏度的对照表，要求它从摄氏度0度到250度，每隔20度为一项，
        对照表中的条目不得超过10条
        转换关系：华氏度 = 摄氏度 * 9 / 5.0 +3;
        */
        double huashidu=0,sheshidu=0;
        int count = 0;
        do{
            huashidu = sheshidu * 9 / 5.0 + 3;
            System.out.println(sheshidu + " ---- " +huashidu);
            sheshidu += 20;
            count ++;
        }while(sheshidu <= 250 && count <=10);


        //求学生五门课的平均成绩
        Scanner scanner= new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name = scanner.next();
        int sum = 0;
        String xueke="0";
        int i;
        for( i =0;i<5;i+=1){
            switch(i){
                case 0:
                    xueke = "语文";
                    break;
                case 1:
                    xueke = "数学";
                    break;
                case 2:
                    xueke = "英语";
                    break;
                case 3:
                    xueke = "政治";
                    break;
                case 4:
                    xueke = "地理";
                    break;
            }
            System.out.print("请输入五门功课的 —— " + xueke + " —— 成绩:");
            int c = scanner.nextInt();
            if(c >= 0 && c <= 100 )
                sum += c;
            else
                break;
        }
        if(i!=5){
            System.out.println(name + "五门课程的平均分为" + "0");
            System.out.println("对不起，你输入的对象值错误");
        }
        else
            System.out.println(name + "五门课程的平均分为" + (sum / 5.0));
    }
}
