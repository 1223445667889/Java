
public class Person {
	//在源文件中，可以有多个类，但只能有一个public的类
	//public的类必须和源文件名字一致，建议一个源文件只写一个类

	String name;
	int age;
	double high;
	
	public void eat() {
		String name = "dadad";
		System.out.println(name+"吃饭");
		System.out.println(this.name+"吃饭");
	}
	public void sleep() {
		System.out.println("睡觉");
	}
	public void run() {
		System.out.println("跑");
	}
	public void jump() {
		System.out.println("跳");
	}
	
	//构造方法
	public Person() {
		//每个类都有一个默认的无参构造方法
		System.out.println("构造方法");
	}
	
	public Person(String name,int age,int high) {
		this.name = name;
		this.age = age;
		this.high = high;
	}
	
}
