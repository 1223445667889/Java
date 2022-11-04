import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class Javaclass7 {
	public static void main(String[] args) throws java.text.ParseException {
		String str = "12334579470"; 
		if(str.length() == 11) {
			System.out.println("满足11位数");
			char[] chars = str.toCharArray();//字符串转换为字符数组
			for(int i=0;i<str.length();i++) {
				if(chars[i]>='0' && chars[i]<='9') {
					System.out.println("都是数字");
					
				}else {
				System.out.println("不是数字");
				break;
				}
			}
		}else {
		System.out.println("手机号不满足11位数");
		}
		
		
		//a? 前面的元素出现0次或一次
		//a+ 前面的元素至少出现一次
		//a* 前面的元素出现0次或多次
		//a{n} 前面的元素出现n次
		//a{n,m} 前面的元素出现n-m次
		//a{n,} 前面的元素至少出现n次
		
		//^ 表示以什么开头
		//$ 表示以什么结尾
		
		//表示范围的
		//a|b|c  a或者b或者c
		//[abc]   在abc中的任意一个
		//[^abc]   在abc以外的任意字符
		//[a-z]   表示任意一个小写字母
		//[0-9]   表示任意一个数字
		//[A-Z] 表示人以大写字母
	    //[^a-z] a-z以外的字符
		
		//字母
		// \d 表示[0-9]
		// \D  表示[^0-9]
		
		String regex = "1[3-9][0-9]{9}";//正则表达式的字符串
		String in = "15712323465";
		boolean result = in.matches(regex);
		System.out.println(result);
		
		String str1 = "l2k4j2kh34h2ku4h3k2";
		str1 = str1.replaceAll("[0-9]"," ");
		System.out.println(str1);
		
		Date begin = new Date();
		long beginTime = begin.getTime();
		System.out.println(begin.getTime());
		String str4 = "hello";
		StringBuilder sb = new StringBuilder("hello");
		for(int i=0;i<10000;i++) {
			str4+="word";
			sb.append("world");
		}
		Date end = new Date();
		
		long endTime = end.getTime();
		System.out.println("耗时："+(endTime-beginTime));
		
		
		Date date = new Date("2010/10/01");//——表示以弃用
		System.out.println(date.getTime());
		
		//日期格式和字符串之间的转换
		String str5 = "2022-10-01 09:59:20";
		//字符串转日期
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date d = f.parse(str5);
			System.out.println(d.getTime());
		}catch(ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//日历类
		Calendar c = Calendar.getInstance();
		//通过get指定获取对应的信息
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		
		c.set(Calendar.YEAR, 2000);
		c.set(Calendar.MONDAY, 10);
		c.set(Calendar.DATE,1);
		
		Date d = c.getTime();
		//获取1970到指定的日期的毫秒数
	    c.getTimeInMillis();
	    
	    //数学相关的类
	    Math.random();
	    Math.abs(-10);//绝对值
	    double d1 = 10.34;
	    Math.floor(d1);//取整
	    Math.round(d1);//四舍五入
	    Math.pow(5, 3);//几次幂
	    Math.sqrt(4);//平方根
		
		//保留小数
	    BigDecimal bd = new BigDecimal(10.2378);
	    bd = bd.setScale(3,RoundingMode.HALF_UP);//固定保留几位
	    String.format("%.2f", 3.14159265758);
	    
	    //随机数
	    //Random
	    Random r = new Random();
	    System.out.println(r.nextInt(5));//范围，0到这个数，但不包含这个数
	    
	    
	    //UUID
        UUID uuid = UUID.randomUUID();//通用唯一标识码
	    
	    
	    //System.in/out
        System.gc();
        System.exit(0);
        System.currentTimeMillis();
        
        //Array 该类包含用于操作数组的各种方法（如排序，搜索）
	    int[] nums = {1,2,3,4,5,6};
	    nums = Arrays.copyOfRange(nums,1, 4);
	    
	    Arrays.fill(nums, 4);//统一初始化值
	    
	    int[] ns = {1,2,3,4,5};
	    int index = Arrays.binarySearch(ns, 3);//有序数组中查找
	    
	    
	    //检查异常
	    SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
	    Scanner scanner = new Scanner(System.in);
	    String strDate = scanner.next();
	    try {
	    	Date date1 = s.parse(strDate);//parse 给我们丢异常
	    	//以上代码如果有异常，将会自动产生一个异常对象  Exception e = new Exception();调用
	    	//catch方法，传入这个异常对象,try块之后的代码不执行
	    	System.out.println("XXXX");
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
	    System.out.print("正常运行");
	    
	    
	    try {
	    	String str6 = "test";
	    	str6.toCharArray();
	    	str6.charAt(10);
	    	System.out.println("xxxx");
	    }catch(NullPointerException | StringIndexOutOfBoundsException e) {
	    	System.out.println("空指针");
	    }catch(RuntimeException e) {
	    	System.out.println("异常");
	    }
	    
	    
	    
//    	int c1 =10/0;
//    	try {
//    		test3(0,10);
//    	}catch(MyException e) {
//    		e.printStackTrace();
//    	}

	    
	}
	@Deprecated
	public static void test() {//——表示以弃用
		System.out.println("Test");
	}
	
	
	public void test1() throws RuntimeException,Exception{
		Class.forName("xxx");
	}
	
	
	class A{
		public void a() throws RuntimeException {
			System.out.println("a");
		}
	}
	class B extends A{
		public void a() {
			System.out.println("b");
		}
	}

	Scanner scanner1 = new Scanner(System.in);
	int a = scanner1.nextInt();
	public static void chu(int a,int b) throws ClassNotFoundException{
		if(a==0) {
			IllegalArgumentException e = new IllegalArgumentException("被除数不能为0");
		}
	}
	
	
	//自定义异常
	@SuppressWarnings("serial")
	public class MyException extends Exception{
		public MyException() {}
		
		public MyException(String msg) {
			super(msg);
		}
	}
	
//	public static void test3(int a,int b) throws MyException{
//		if(a==0) {
//			throw new MyException("0不能作为被除数");
//		}
//	}
	
}



