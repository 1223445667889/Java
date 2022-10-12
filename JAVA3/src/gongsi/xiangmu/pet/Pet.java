package gongsi.xiangmu.pet;

public abstract class Pet extends Object {
    private String name;
    private int health;
    private int love;

    public Pet() {
    }

    public Pet(String name, int health, int love) {
        this.name = name;
        this.health = health;
        this.love = love;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health<0) health = 0;
        if(health>100) health = 100;
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public void print(){
        System.out.println("宠物的自白");
        System.out.print("我的名字叫："+name+"，健康值是："+health+",和主人的亲密度是："+love);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", love=" + love +
                '}';
    }

    //声明一个抽象方法(宠物不知道自己要吃什么，吃什么有子类来确定)
    public abstract void eat();
}
