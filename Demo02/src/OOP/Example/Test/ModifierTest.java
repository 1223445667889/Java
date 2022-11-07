package OOP.Example.Test;

public class ModifierTest {
    public int n = 100;
    protected int a = 200;
    int  d = 300;
    private int f = 400;

    public void cr(){
        //四个属性都能访问
        System.out.println(n+a+d+f);
        fd();
        me();
        ad();
    }
    protected void me(){
        System.out.println("受保护的");
    }
    void fd(){
        System.out.println("默认的");
    }
    private void ad(){
        System.out.println("私有的");
    }
}
