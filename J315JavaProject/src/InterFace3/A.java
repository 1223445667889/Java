package InterFace3;

public interface A {
	void showA();
	
	static void show10(String str) {
		System.out.println(str);
		for(int i=0;i<10;i++) {
			System.out.println("str");
		}
	}
	
	public static void showB10() {
		show10("static BBBB");
	}
	
	public static void showC10() {
		show10("static CCCC");
	}
}
