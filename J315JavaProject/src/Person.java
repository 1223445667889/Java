
public class Person {
	//��Դ�ļ��У������ж���࣬��ֻ����һ��public����
	//public��������Դ�ļ�����һ�£�����һ��Դ�ļ�ֻдһ����

	String name;
	int age;
	double high;
	
	public void eat() {
		String name = "dadad";
		System.out.println(name+"�Է�");
		System.out.println(this.name+"�Է�");
	}
	public void sleep() {
		System.out.println("˯��");
	}
	public void run() {
		System.out.println("��");
	}
	public void jump() {
		System.out.println("��");
	}
	
	//���췽��
	public Person() {
		//ÿ���඼��һ��Ĭ�ϵ��޲ι��췽��
		System.out.println("���췽��");
	}
	
	public Person(String name,int age,int high) {
		this.name = name;
		this.age = age;
		this.high = high;
	}
	
}
