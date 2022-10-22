package Project.shili;

public class Java2 {
    public static void main(String[] args){
        int a1 = 10;
        int b1 = 20;
        AA a = new AA();
        int[] res = a.getSumAndSub(1,4);
        System.out.println(res[1]);
        System.out.println(res[0]);

        CC c = new CC();
        boolean c1 = c.f01(12);
        System.out.println("这个数是偶数："+c1);

        c.f02(3,4,'$');

        BB b = new BB();
        b.swap(a1,b1);
        System.out.println("a1:"+a1+"\tb1:"+b1);
    }
}
//一个方法最多返回一个值，要返回多个值，，就返回一个数组。
//返回类型可以为任意类型
class AA{
    public int[] getSumAndSub(int n1,int n2){
        int[] resArr = new int[2];
        resArr[0] = n1 + n2;
        resArr[1] = n1 - n2;
        return resArr;
    }

    //同一个类的方法可以直接调用
    public double f1(){
        getSumAndSub(10,20);
        return 3.1415926;
    }

    //跨类中的方法A类调用B类方法：需要通过对象名调用
    public void m1(){
        System.out.println("AA类中的m1先执行");
        BB b = new BB();
        b.ha();
        System.out.println("m1继续执行");
    }
}

class BB{
    public void ha(){
        System.out.println("BB类中的 hi()被执行");
    }

    //实现两个数的交换
    public void swap(double num1,double num2){
        double a;
        a = num1;
        num1 = num2;
        num2 = a;
        System.out.println("num1:"+num1+"\tnum2:"+num2);
    }
}

//编写一个类，有一个方法，判断一个属是奇数还是偶数，返回boolean
class CC{
    public boolean f01(int num1){
        boolean c = true;
        if(num1 % 2 == 0){
             c = true;
        }else
             c = false;
        return c;
    }

    public void f02(int num2,int num3,char num4){
        for(int i=0;i<=num2;i++){
            for(int j=0;j<=num3 ;j++){
                System.out.print(num4+"\t");
            }
            System.out.println();
        }
    }
}