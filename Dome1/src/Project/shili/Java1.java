package Project.shili;

import java.util.Arrays;

public class Java1 {
    public static void main(String[] args){
        //创建类
        class Cat {
            String name;
            int age;
            String color;
        }
        class Person{
            String name;
            int age;
        }

        String cat1Name = "小白";
        int cat1age = 3;
        String cat1Color = "白色";

        String cat2Name = "小花";
        int cat2age = 100;
        String cat2Color = "花色";

        String[] cat1 = {"小白","3","白色"};
        String[] cat2 = {"小花","100","花色"};
        System.out.println(Arrays.toString(cat1));
        System.out.println(Arrays.toString(cat2));

        //实例化对象猫
        Cat cat3 = new Cat();
        cat3.name = "小童";
        cat3.age = 4;
        cat3.color = "黑色";

        System.out.println("一只猫："+cat3.name+"\t"+cat3.age+"\t"+cat3.color);

        Person p1 = new Person();
        p1.age=23;
        p1.name ="王小明";
        Person  p2 = p1;
        p1.name = "李明";
        System.out.println(p2.name);

        Person a = new Person();
        a.age=10;
        a.name="小明";
        Person b =  a;
        System.out.println(b.name);
        b.age=200;
        b=null;
        System.out.println(a.age);
        //System.out.println(b.age);//报错

        Person1 ps1 = new Person1();
        ps1.speak();
        ps1.cal01();
        ps1.cal02(10);
        int returnnum = ps1.getSum(2,4);
        System.out.println(returnnum);

        int[][] map = {{0,1,2},{3,4,5},{6,7,8}};

//        for(int i=0;i<map.length;i++){
//            for(int j =0;j<map[i].length;j++){
//                System.out.print(map[i][j]+" ");
//            }
//            System.out.println();
//        }
        MyTools tool = new MyTools();
        tool.printArr(map);
    }
}


class Person1{
    String name;
    int age;
    //方法
    //添加speak 成员方法
    //speak():speak是方法名 ()形参列表
    //{} 方法体，写代码块
    public void speak(){
        System.out.println("你是一个好人！");
    }

    public void cal01(){
        int sum = 0;
        for(int i=0;i<=1000;i++){
            sum+=i;

        }
        System.out.println("cal01结果为:"+sum);
    }

    //(int n)表示当前有一个形参，可以接受用户输入
    public void cal02(int n){
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum+=i;

        }
        System.out.println("cal02结果为:"+sum);
    }

    public int getSum(int num3,int num4){
        int sum = num3 + num4;
        return sum;
    }

}


class MyTools{
    public void printArr(int[][] map){
        //对传入的数组进行输出
        for(int i=0;i<map.length;i++){
            for(int j =0;j<map[i].length;j++){
                System.out.print(map[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
