
public class Javaclass5 {
	public static void main(String[] args) {
		//根据类创建对象
		Person person = new Person("zhangsan",20,180);//构造方法在创建时
		Person person1 = new Person();
		Person p1 = person;//赋值的是person的地址,p1和person1指向同一个地址
		System.out.println();
		
		//获取属性值
		System.out.println(person.age);
		
		//修改属性值
		person.age = 10;
		person.high = 174.6;
		person.name = "admin";
		System.out.println(person.age);
		
		person1.name = "admin1";
		person1.age = 20;
		person1.high = 169.0;
		System.out.println(person1.age);
		
		p1.age = 20;
		System.out.println(person.age);
		
		person.eat();
		
		Singleclass s1 = Singleclass.getSingleclass();
		Singleclass s2 = Singleclass.getSingleclass1();
		System.out.println(s1==s2);
	}
}
