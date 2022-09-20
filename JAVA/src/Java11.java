import java.util.Scanner;

public class Java11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("->添加客户信息表");
        for(int i=0;i<=3;i++){
            System.out.print("->请输入四位会员号：");
            int id = scanner.nextInt();
            if(id < 1000 || id>9999)continue;
            System.out.print("生日(日/月):");
            String birth = scanner.next();
            if(birth.length() != 5) continue;
            System.out.print("你的积分：");
            int jifen = scanner.nextInt();
            if(jifen <0) continue;
            System.out.println("会员信息：\n" +  id + "\t" +birth +"\t" + jifen);
        }
        System.out.println("程序结束");
    }
}
