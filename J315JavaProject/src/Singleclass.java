
public class Singleclass {
	//预先创建对象
	//public static Singleclass singleClass = new Singleclass();
	
	//懒汉式
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
