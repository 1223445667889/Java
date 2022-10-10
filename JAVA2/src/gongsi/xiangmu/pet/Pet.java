package gongsi.xiangmu.pet;

public class Pet {
    public String name;
    public int health;
    public int love;

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
        if(health<0) health =0;
        if(health>100) health =100;
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
        System.out.println("我的名字叫:"+name+",健康值是:"+health+",和主人的亲密度是:"+love);
    }

}
