package gongsi.xiangmu.pet;

public class Dog extends Pet{
    private String strain;

    public Dog() {
    }

    public Dog(String name, int health, int love, String strain) {
        super(name, health, love);
        this.strain = strain;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    @Override//标识，重写父类的方法，检查你重写的方法名是否正确
    public void print() {
        super.setName("哈哈啊哈");
        super.print();
        System.out.println(",我是一只"+strain);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "strain='" + strain + '\'' +
                "} " + super.toString();
    }
}
