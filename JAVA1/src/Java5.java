public class Java5 {

    public static void main(String[] args){
    /*    Fujian5 st = new Fujian5();
        st.addStudent(11,"张三",19,96);
        st.addStudent(12,"李四",20,94);
        st.addStudent(13,"王五",21,92);
        st.showStudent();*/


        //升级版
        Fujian5 st = new Fujian5();
        st.showStudent();
        Student5 sts1 = new Student5();
        Student5 sts2 = new Student5();
        Student5 sts3 = new Student5();
        sts1.id = 202201;
        sts1.name = "张三";
        sts1.age = 19;
        sts1.score = 90;
        sts1.address="北京";

        sts2.id = 202202;
        sts2.name = "李四";
        sts2.age = 20;
        sts2.score = 92;
        sts2.address = "上海";

        sts3.id = 202203;
        sts3.name = "王五";
        sts3.age = 18;
        sts3.score = 93;
        sts3.address = "广州";

        st.addStudent(sts1);
        st.addStudent(sts2);
        st.addStudent(sts3);
        st.showStudent();
        
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i =1;i<a;i++){
            for(int j =1;j<a-i-1;j++){
                System.out.print(" ");
            }
            for(int k =0;k<a+1;k++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
