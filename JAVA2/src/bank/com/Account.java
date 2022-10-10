package bank.com;

//银行账户业务
public class Account {
        double yuE;

        @Override
        public String toString() {
            return "***当前余额为："+ yuE +"元***";
        }

        public void qukuan(double money) {
            yuE -= money;
        }

        public void cunkuan(double money){
            yuE += money;
        }
}
