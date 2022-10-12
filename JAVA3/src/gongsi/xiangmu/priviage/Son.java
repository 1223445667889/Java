package gongsi.xiangmu.priviage;

import gongsi.xiangmu.priviage.Father;

public class Son extends Father {
    public void f1(){
        System.out.println(super.a3);
        System.out.println(super.a2);//同包可以访问
        System.out.println(super.a4);
    }
}
