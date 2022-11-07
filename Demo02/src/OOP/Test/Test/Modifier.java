package OOP.Test.Test;


import OOP.Example.Test.ModifierTest;

/**
 * 访问修饰符(Access modifier):用于控制方法和属性的访问权限
 *                           有 public ：可访问同类，同包，子类，不同包
 *                              protected  ：可访问同类，同包，子类
 *                              默认(没有符号修饰,向同一个包的类公开) ：可访问同类和同包
 *                              private：只能访问同类
 *                           只有默认和public才能修饰类
 */
public class Modifier {

    public static void main(String[] args){
        ModifierTest m = new  ModifierTest();
        System.out.println(m.n);
        m.cr();
    }
}
