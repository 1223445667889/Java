
public class Singleclass {
	//Ԥ�ȴ�������
	//public static Singleclass singleClass = new Singleclass();
	
	//����ʽ
	private static Singleclass singleClass;
	
	Singleclass() {
		
	}
	
	public static Singleclass getSingleclass() {
		return singleClass;
		
	}
	
	public static Singleclass getSingleclass1() {
		if(singleClass == null) {
			singleClass = new Singleclass();
		}
		return singleClass;
		
	}
}
