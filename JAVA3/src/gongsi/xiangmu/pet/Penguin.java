package gongsi.xiangmu.pet;

public class Penguin extends Pet{
    public static final String SEX_MALE = "男仔";
    public static final String SEX_FEMALE = "靓女";
    private String sex;

    public Penguin() {
    }

    public Penguin(String name, int health, int love, String sex) {
        super(name, health, love);
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(",性别是："+sex);
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "sex='" + sex + '\'' +
                "} " + super.toString();
    }

    @Override
    public void eat(){
        System.out.println("吃鱼");
    }
}
