public class  Fujian3{
    //类名
    //public class School
    //属性
    //String name;
    //int jsNumber;//教室数目
    //int jfNumber;//机房数目
    //方法
    //public void show(){
    //    System.out.println("名称："+name+"，教室数目："+ jsNumber+",机房数目："+jsNumber);
    //}



    //游客信息
/*    String name;
    int age;
    public  void show(){
        if(age<=18) System.out.println(name+"的年龄为:"+age+"门票价格免费");
        else System.out.println(name+"的年龄为:"+age+"门票价格为:20");
    }*/



    //密码修改
    /*String name;
    String password;
    public  void show(){
        System.out.println("密码修改成功！，你的密码是："+password);
    }*/



    //客户积分反馈
    int jifen;
    String type;

    public void show(){
        System.out.println("你的类型卡："+type+"，积分:"+jifen);
        System.out.println("商场积分规则：如果金卡积分大于1000或者普卡积分大于5000，将额外回赠500积分");
    }

    public void huikui(){
        if(("金卡".equals(type) && jifen>1000) || ("普卡".equals(type) && jifen>5000)){
            jifen+=500;
            System.out.println("回馈积分加500分");
            System.out.println("当前积分为:"+jifen);
        }
        else
            System.out.println("当前积分为:"+jifen);
            System.out.println("谢谢光临");
    }
}
















