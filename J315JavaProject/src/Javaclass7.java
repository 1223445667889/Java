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
			System.out.println("����11λ��");
			char[] chars = str.toCharArray();//�ַ���ת��Ϊ�ַ�����
			for(int i=0;i<str.length();i++) {
				if(chars[i]>='0' && chars[i]<='9') {
					System.out.println("��������");
					
				}else {
				System.out.println("��������");
				break;
				}
			}
		}else {
		System.out.println("�ֻ��Ų�����11λ��");
		}
		
		
		//a? ǰ���Ԫ�س���0�λ�һ��
		//a+ ǰ���Ԫ�����ٳ���һ��
		//a* ǰ���Ԫ�س���0�λ���
		//a{n} ǰ���Ԫ�س���n��
		//a{n,m} ǰ���Ԫ�س���n-m��
		//a{n,} ǰ���Ԫ�����ٳ���n��
		
		//^ ��ʾ��ʲô��ͷ
		//$ ��ʾ��ʲô��β
		
		//��ʾ��Χ��
		//a|b|c  a����b����c
		//[abc]   ��abc�е�����һ��
		//[^abc]   ��abc����������ַ�
		//[a-z]   ��ʾ����һ��Сд��ĸ
		//[0-9]   ��ʾ����һ������
		//[A-Z] ��ʾ���Դ�д��ĸ
	    //[^a-z] a-z������ַ�
		
		//��ĸ
		// \d ��ʾ[0-9]
		// \D  ��ʾ[^0-9]
		
		String regex = "1[3-9][0-9]{9}";//������ʽ���ַ���
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
		System.out.println("��ʱ��"+(endTime-beginTime));
		
		
		Date date = new Date("2010/10/01");//������ʾ������
		System.out.println(date.getTime());
		
		//���ڸ�ʽ���ַ���֮���ת��
		String str5 = "2022-10-01 09:59:20";
		//�ַ���ת����
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date d = f.parse(str5);
			System.out.println(d.getTime());
		}catch(ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//������
		Calendar c = Calendar.getInstance();
		//ͨ��getָ����ȡ��Ӧ����Ϣ
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		
		c.set(Calendar.YEAR, 2000);
		c.set(Calendar.MONDAY, 10);
		c.set(Calendar.DATE,1);
		
		Date d = c.getTime();
		//��ȡ1970��ָ�������ڵĺ�����
	    c.getTimeInMillis();
	    
	    //��ѧ��ص���
	    Math.random();
	    Math.abs(-10);//����ֵ
	    double d1 = 10.34;
	    Math.floor(d1);//ȡ��
	    Math.round(d1);//��������
	    Math.pow(5, 3);//������
	    Math.sqrt(4);//ƽ����
		
		//����С��
	    BigDecimal bd = new BigDecimal(10.2378);
	    bd = bd.setScale(3,RoundingMode.HALF_UP);//�̶�������λ
	    String.format("%.2f", 3.14159265758);
	    
	    //�����
	    //Random
	    Random r = new Random();
	    System.out.println(r.nextInt(5));//��Χ��0����������������������
	    
	    
	    //UUID
        UUID uuid = UUID.randomUUID();//ͨ��Ψһ��ʶ��
	    
	    
	    //System.in/out
        System.gc();
        System.exit(0);
        System.currentTimeMillis();
        
        //Array ����������ڲ�������ĸ��ַ�����������������
	    int[] nums = {1,2,3,4,5,6};
	    nums = Arrays.copyOfRange(nums,1, 4);
	    
	    Arrays.fill(nums, 4);//ͳһ��ʼ��ֵ
	    
	    int[] ns = {1,2,3,4,5};
	    int index = Arrays.binarySearch(ns, 3);//���������в���
	    
	    
	    //����쳣
	    SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
	    Scanner scanner = new Scanner(System.in);
	    String strDate = scanner.next();
	    try {
	    	Date date1 = s.parse(strDate);//parse �����Ƕ��쳣
	    	//���ϴ���������쳣�������Զ�����һ���쳣����  Exception e = new Exception();����
	    	//catch��������������쳣����,try��֮��Ĵ��벻ִ��
	    	System.out.println("XXXX");
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
	    System.out.print("��������");
	    
	    
	    try {
	    	String str6 = "test";
	    	str6.toCharArray();
	    	str6.charAt(10);
	    	System.out.println("xxxx");
	    }catch(NullPointerException | StringIndexOutOfBoundsException e) {
	    	System.out.println("��ָ��");
	    }catch(RuntimeException e) {
	    	System.out.println("�쳣");
	    }
	    
	    
	    
//    	int c1 =10/0;
//    	try {
//    		test3(0,10);
//    	}catch(MyException e) {
//    		e.printStackTrace();
//    	}

	    
	}
	@Deprecated
	public static void test() {//������ʾ������
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
			IllegalArgumentException e = new IllegalArgumentException("����������Ϊ0");
		}
	}
	
	
	//�Զ����쳣
	@SuppressWarnings("serial")
	public class MyException extends Exception{
		public MyException() {}
		
		public MyException(String msg) {
			super(msg);
		}
	}
	
//	public static void test3(int a,int b) throws MyException{
//		if(a==0) {
//			throw new MyException("0������Ϊ������");
//		}
//	}
	
}



