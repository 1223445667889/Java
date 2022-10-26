package Project.shili;

public class Java3 {
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        a.say();
        a.print(3);
        a.mi();
        int a1 =10;
        int b1 =20;
        a.asd(a1,b1);
        System.out.println("a和b的值："+a1+"\t"+b1);
        b.text(arr);
        Person p = new Person();
        p.name="ads";
        p.age = 10;
        b.text1(p);
        System.out.println(p.age);

    }
}
class A{
    public void print(int n){
        System.out.println("print()方法被调用"+n);
    }

    public void say(){
        print(10);
        System.out.println("say继续执行");
    }
    public void mi(){
        B b = new B();
        b.hi();
        say();
    }
    public void asd(int a,int b){
        System.out.println("a和b值交换前:"+a+"\t"+b);
        int c = a;
        a=b;
        b=c;
        System.out.println("a和b的值交换后:"+a+"\t"+b);
    }
}
class B{
    public void hi(){
        System.out.println("hi类被调用");
    }
    public boolean mun(int numb){
        return numb%2!=0?true:false;
    }
    public void text(int[] arr){
        arr[0] =200;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
    public void text1(Person p){
        //p.age = 100;
        //p = null;//没有把主方法的p置空，是把自己指向一个空地址
        p = new Person();//在堆中产生一个新的地址空间，切断了与原来对象空间的联系，完了之后会被回收
        p.name="Tom";
        p.age = 99;
    }
}
class Person{
    String name;
    int age;
}
