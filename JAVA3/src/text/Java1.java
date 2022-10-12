package text;

import gongsi.xiangmu.pet.Dog;
import gongsi.xiangmu.pet.Master;
import gongsi.xiangmu.pet.Penguin;

public class Java1 {
    public static  void main(String[] args){
        Master master = new Master();
        Dog dog = new Dog("汪汪",60,34,"牧羊犬");
        dog.print();
        master.feed(dog);
        dog.print();

        System.out.println();
        //System.out.println(dog.toString());
        //打印出Dog{strain='牧羊犬'} Pet{name='哈哈啊哈', health=60, love=34}要在父类和子类中加toString

        Penguin penguin = new Penguin("好好",90,4,Penguin.SEX_FEMALE);
        penguin.print();
        master.feed(penguin);
        penguin.print();
        //System.out.println(penguin.toString());

    }
}
