package animal.colact.dog;

public class Dog {
    public String name;
    public int health;
    public int love;
    public String strain;

    //无参函数
    public Dog() {
    }


    public Dog(String name, int health, int love, String strain) {
        this.name = name;
        this.health = health;
        this.love = love;
        this.strain = strain;
    }

    //Getter and Setter
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
        this.health = health;
    }

    public int getLove() {
        //添加控制代码
        if(health<0) health = 0;
        if(health>100) health = 100;
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    public void print(){
        System.out.println("宠物的自白");
        System.out.println("我的名字叫:"+name+",健康值是:"+health+",和主人的亲密度是:"+love+",我是一只"+strain);
    }
}
