
public class Javaclass5 {
	public static void main(String[] args) {
		//�����ഴ������
		Person person = new Person("zhangsan",20,180);//���췽���ڴ���ʱ
		Person person1 = new Person();
		Person p1 = person;//��ֵ����person�ĵ�ַ,p1��person1ָ��ͬһ����ַ
		System.out.println();
		
		//��ȡ����ֵ
		System.out.println(person.age);
		
		//�޸�����ֵ
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
