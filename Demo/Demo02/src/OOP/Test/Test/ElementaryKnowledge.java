package OOP.Test.Test;

/**
 * 重载(Burden):方法名相同，参数列表类型不同、顺序不同。
 *
 * 可变参数(Variable Parameters):将一个类中多个同名，同功能，参数列表不同的方法，封装成一个方法。
 *                              使用可变参数时，可当作数组类使用。
 *                              可变参数的实参可以为数组。
 *                              可变参数可以和普通参数类型放在一起，但可变参数必须在最后且不可以有多个可变参数。
 *
 * 作用域(scope):成员变量和局部变量的范围，局部变量一般在成员方法中定义，而成员变量定义在整个类中，全局变量可以不赋值，有默认值，
 *              而局部变量必须赋值。
 *              属性和局部变量可以重名，同意作用域中不可以重名，访问时遵循就近原则。
 *              属性生命周期较长，伴随对象的创建而创建，随对象的消失而消失，局部变量生命周期较短，随方法的创建而创建，随方法的消失而消失。
 *              全局变量可以被本类使用，或其他类使用，而局部变量只能在本方法中使用。
 *              全局变量的属性可以加修饰符，而局部变量不可以。
 *
 */
public class ElementaryKnowledge {
    public static void main(String[] args){
        MyCalculator m = new MyCalculator();
        int m1 = m.calculate(1,2);
        double m2 = m.calculate(1,1.2);
        double m3 = m.calculate(2,3);
        double m4 = m.calculate(143,5,7);
        System.out.println("m1:"+m1);
        System.out.println("m2:"+m2);
        System.out.println("m3:"+m3);
        System.out.println("m4:"+m4);

        Methods me = new Methods();
        System.out.println(me.m(3));
        System.out.println(me.m(68,8));
        System.out.println(me.m("I like you"));

        System.out.println(me.max(2,6));
        System.out.println(me.max(3.1415926,3.14159265857));
        System.out.println(me.max(1.3,1.4,1.2));

        System.out.println("============================");

        VP vp = new VP();
        System.out.println(vp.sum(2,4,46,61));
        int[] arr = {1,2,3};
        vp.f01(arr);

        HspMethod h = new HspMethod();
        System.out.println(h.showScore("王刚",89,78));

        Cat c = new Cat();
        c.cry();
        c.eat();
        String t1 = c.name;

        T t = new T();
        t.test1(t1);
    }
}

/**
 * 重载的例子及书写格式
 */
class MyCalculator{
    public int calculate(int n1,int n2){
        return n1+n2;
    }
    public double calculate(int n1,double n2){
        return n1+n2;
    }
    public double calculate(double n1,int n2){
        return n1+n2;
    }
    public int calculate(int n1,int n2,int n3){
        return n1+n2+n3;
    }
}

/**
 * 重载的练习
 */
class Methods{
    public int m(int i){
        return i*i;
    }
    public int m(int i,int n){
        return i*n;
    }
    public String m(String s){
        return s;
    }

    public int max(int n ,int n1){
        return n>n1 ? n:n1;
    }
    public double max(double n,double n1){
        return n>n1 ? n:n1;
    }
    public double max(double n,double n1,double n2){
        return n>n1 ? n1>n2 ? n1:n2 :n1;
    }
}

/**
 * 可变参数的例子及书写格式
 */
class VP{
    public int sum(int... nums){
        int res = 0;
        for(int i=0;i<nums.length;i++){
            res += nums[i];
        }
        return res;
    }

    public void f01(int... nums){
        System.out.println("长度："+nums.length);
    }
    public void f02(String n,int... n1){
    }
}

/**
 * 可变参数的练习
 */
class HspMethod{
    public String showScore(String name,double... score){
        double sum =0;
        for(int i=0;i<score.length;i++){
            sum += score[i];
        }
        return name+score.length+"门课的成绩总分："+sum;
    }
}

/**
 *作用域的例子及相应格式
 */
class Cat{
    protected int age = 10;//成员变量
    String name = "曹操";
    {
        int number = 100;//局部变量
    }
    public void cry(){
        int age = 100;
        String name = "王德法";
        System.out.println("cry中的属性："+name+"的年龄"+age);
    }
    public void eat(){
        System.out.println("在eat中的属性："+name+"\t"+age);
    }
    public void say(){
        String name = "Tone";
        System.out.println("say() name="+name);
    }
}
class T{
    public void test(){
        Cat c = new Cat();
        System.out.println(c.name);
    }
    public void test1(String t1){
        String t2 = t1;
        System.out.println("test1 name:"+t2);
    }
}


























