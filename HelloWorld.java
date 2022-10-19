
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("HelloWorld!");
	
		//声明变量(要求在内存中开辟空间，并命名)
		
		//数据类型  变量名
		int number=0;
		byte k=3;
		//声明多个变量
		int a=2,b=3,c=5;
		double d = 3.1415926;
		int r = 0x32;
		long t = 234244223442L;
		float q = 10.23f;
		float v = 10;
		char l = 65535;//不要超过65535，不能为负
		//大范围数据可以兼容小范围的数据,自动转换
		int w=k;
		//小范围的转大范围，需要强转。浮点型转整形会精度丢失
		byte o = (byte)w;
		
		
		int w2 = 157;
		int q1,m,z,sum;
		q1 = w2%10;
	    w2 /= 10;
		m = w2%10;
		w2/= 10;
		z = w2%10;
		sum = q1*q1*q1+m*m*m+z*z*z;
		System.out.println(sum);
		
  }
}
