package text;

//银行账户业务
import bank.com.Account;

import javax.security.auth.login.AccountException;
import java.util.Scanner;

public class Java1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();

        boolean isLoop = true;
        do{
            System.out.println("0.退出 1.存款 2.取款");
            System.out.println("请选择：");
            int select = scanner.nextInt();
            switch(select){
                case 1:
                    System.out.println("你的存款金额为：");
                    account.cunkuan(scanner.nextDouble());
                    System.out.println(account.toString());
                    break;
                case 2:
                    System.out.println("你的取款金额为：");
                    account.qukuan(scanner.nextDouble());
                    System.out.println(account.toString());
                    break;
                default:
                    isLoop = false;
                    break;
            }
        }while(isLoop);
        System.out.println("谢谢使用！");
    }
}
