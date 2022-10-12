package text;

import gongsi.xiangmu.pet.Dog;
import gongsi.xiangmu.pet.Penguin;
import gongsi.xiangmu.pet.Pet;

public class Java2 {
    public static void main(String[] args){
        Dog dog = new Dog();//基本语法
        //penguin penguin = new Dong();//没有继承关系
        Penguin penguin = new Penguin();

        //但有继承关系，则支持向上的转型（可以用父类声明一个变量，指向子类的实例）
        Pet pet1 = new Dog();
        Pet pet2 = new Penguin();
    }
}
