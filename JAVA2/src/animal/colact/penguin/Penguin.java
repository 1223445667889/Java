package animal.colact.penguin;

public class Penguin {
    public String name;
    public int health;
    public int love;
    public String sex;

    public void print(){
        System.out.println("宠物的自白");
        System.out.println("我的名字叫:"+name+",健康值是:"+health+",和主人的亲密度是:"+love+",性别是:"+sex);
    }
}
