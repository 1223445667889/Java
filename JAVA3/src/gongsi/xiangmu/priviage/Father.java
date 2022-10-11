package gongsi.xiangmu.priviage;

public class Father {
    /*私有的，本内部才能访问；
    包级别的，同包的其它类中也能访问；
    保护的，同包的其它类中也能访问，子类也能访问；
    公有的任何类中都可以访问。*/

    private int a1 = 1;
    int a2 = 2;
    protected  int a3 = 3;
    public int a4 = 4;

    private void f1(){
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
    }
}
