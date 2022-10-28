
public class Javaclass4 {
	public static void main(String[] args) {
		print();
		sum(6,8);
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		sum("a",1,2,3);
	}
	
	public static void print() {
		for(int i=0;i<10;i++) {
			System.out.println("你好S");
		}
	}
	
	public static void sum(int a,int b) {
		System.out.println("和为:"+(a+b));
	} 
	
	public static void sort(int[][] sums) {
		for(int i=0;i<sums.length-1;i++) {
			for(int j=0;j<sums.length-i-1;j++) {
				if(sums[i][j]>sums[i][j+1]) {
					int c = 0;
					c = sums[i][j];
					sums[i][j]=sums[i][j+1];
					sums[i][j+1] = c;
				}
			}
		}
		for(int i=0;i<sums.length;i++) {
			for(int j=0;j<sums.length;j++) {
				System.out.println(sums[i][j]+"\t");
			}
		}
	}
	
	//可变参数
	public static void sum(String str,int... d) {
		for(int i:d) {
			System.out.println(i);
		}
	}	
	//在同一个类中，不允许有两个完全相同(方法名和参数类型)的方法存在
	//同一件事(方法名相同)，不同条件(参数列表不同) 方法的重载
	//重载和修饰符无关
	public static void print1(int a,String b,double c) {
		
	}
	public static void print1() {
		
	}
	
	//重载时 ，可变参数不能和数组共存
	

}
