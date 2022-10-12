package gongsi.xiangmu.pet;

public class Master {
    //喂狗粮
    public void feed(Dog dog){
        dog.eat();
        dog.setHealth(dog.getHealth() + 3 ); ;
    }

    public void feed(Penguin penguin){
        penguin.eat();
        penguin.setHealth(penguin.getHealth() + 5 );
    }

    //喂养宠物
    public void feed(Pet pet){
        //编写代码的时候，必须保证Pet类中，至少要有应对的方法，否则编译报错
        //代码在执行的过程中，具体是调用狗的吃狗粮还是企鹅的吃鱼取决于实际的传参
        pet.eat();
        //设置或获取健康值的代码，都是在父类中才有，实际执行的就是父类代码
        pet.setHealth(pet.getHealth() + 5);
    }

}
