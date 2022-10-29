package Project.duixiang;

public class copyPerson {

    public static void main(String[] args) {

        //编写一方法copyPerson，可以复制Person对象，返回复制的对象
        //克隆对象，注意要求得到新对象和原来的对象是两个独立的对象，只是他们的属性相同
        Person p = new Person();
        p.name = "milan";
        p.age = 10;
        MyTools1 tools1 = new MyTools1();
        Person p2 = tools1.copyPerson(p);
        //p和p2是Person的对象，但是两个独立的对象，但属性相同
    }

}
class Person{
    String name;
    int age;
}

class  MyTools1{
    public Person copyPerson(Person p){
        Person p2 = new Person();
        p2.name = p.name;
        p2.age = p.age;

        return p2;
    }
}
