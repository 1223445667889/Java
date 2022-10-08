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
        int a = scanner1.nextInt();
        for(int i =1;i<a;i++){
            for(int j =1;j<a-i-1;j++){
                System.out.print(" ");
            }
            for(int k =0;k<a+1;k++){
                System.out.print("*");
            }
            System.out.println( );
        }
        
        
        int[] a={1,2,3,3,1,3,12};
        for(int i = 1;i<10;i++){
            System.out.println(a[i]);
        }
        
        int sum=0;
        for(int i = 0 ;i<100;i+=8){
            for(int j =0;j<100;j-=i){
                sum = i + j;
                System.out.println();
            }
        }
        
        Scanner scanner3 = new Scanner(System.in);
        System.out,println("请输入你的口令:");
        String ha = scanner.next();
        int i=0;
        while(ha=="诺克萨斯"){
            System.out.print("你好！我们是英雄联盟。");
            do{
                Suystem.out.print("德玛西亚万岁");
                i++;
            }while(i<10);
        }
        
        
        Scanner scanner4= new Scanner(System.in);
        System.out.println("请输入你的序号：");
        int hao = scanner4.Intnext();
        int i =1;
        while(i!=0){
            switch(hao!=0){
                case 1:
                    i+=1;
                    System.out.println("你好！我是你的智能服务主机。");
                    break;
                case 2:
                    i+=4;
                    System.out.println("请问你需要帮助吗？");
                    break;
                case 4:
                    i++;
                    System.out.println("需要餐纸吗？");
                case 5:
                    i++;
                    System.out.println("需要点餐吗？");
                case 6:
                    i++;
                    System.out.println("需要围裙吗？");
                    break;
                case 7:
                    i+=5;
                    Systm.out.println("需要付款吗？");
                    break;
                case 8:
                    System.out.println("欢迎下次光临！");
                    if(i>=10){
                        hao=0;
                        i=0;
                    }
                    break;
            }
        }
        
        int a= 10;
        double b=5;
        public int sum(int a,double d){
            int sumd = c+d;
            System.out.println(sumd);
        }
        System.out.println("值得和为："+sum());
    }
}
