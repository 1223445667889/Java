package OOP.Example.Test;

public class AccountTest {
        private String name;
        private String password;
        private int surplus;

        public AccountTest(){}

        public AccountTest(String name, String password, int surplus) {
            this.setName(name);
            this.setPassword(password);
            this.setSurplus(surplus);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            if(name.length()>=2 && name.length()<=4){
                this.name = name;
            }else{
                System.out.println("请输入的名字在(2-4)个字符之间");
                this.name = "无名";
            }

        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            if(password.length()==6) {
                this.password = password;
            }else{
                System.out.println("密码必须为6，否则默认为0");
                this.password = "0";
            }
        }

        public int getSurplus() {
            return surplus;
        }

        public void setSurplus(int surplus) {
            if(surplus>20){
                this.surplus = surplus;
            }else{
                System.out.println("余额必须大于20，否则余额为1");
                this.surplus = 1;
            }

        }

        public void showInfo(){
            System.out.println("账号信息 name="+name+ ",密码="+password+ ",余额= "+surplus);
        }
}
