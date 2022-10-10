package text;

import animal.colact.dog.Dog;
import animal.colact.penguin.Penguin;

public class Java2 {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.name = "哈哈";
        dog.health = 90;
        dog.love = 4;
        dog.strain = "西藏纯血藏獒";
        //有参函数
        Dog dog1 = new Dog("好好",100,3,"德国牧羊犬");

        Penguin penguin = new Penguin();
        penguin.name = "妙妙";
        penguin.health = 93;
        penguin.love = 4;
        penguin.sex = "Q妹";

        dog.print();
        penguin.print();
    }
}
