package text;

import gongsi.xiangmu.pet.Dog;
import gongsi.xiangmu.pet.Penguin;

public class Java1 {
    public static  void main(String[] args){
        Dog dog = new Dog("汪汪",60,34,"牧羊犬");
        dog.print();
        System.out.println(dog.toString());

        Penguin penguin = new Penguin("好好",90,4,Penguin.SEX_FEMALE);
        penguin.print();
        System.out.println(penguin.toString());
        //打印出Dog{strain='牧羊犬'} Pet{name='哈哈啊哈', health=60, love=34}要在父类和子类中加toString
    }
}
