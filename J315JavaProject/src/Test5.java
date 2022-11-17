import java.util.Scanner;

/**
 * 
 * @author 郑俊杰
 *
 */
//定义类Text5  
public class Test5 {
	//main方法
	public static void main(String[] args) {
	//第一题	
		//定义一个int类型变量a,变量b,都赋值为20
		int a=20,b=20;
		
		//定义boolean类型变量bo , 判断++a 是否被3整除,并且a++ 是否被7整除,将结果赋值给bo
		boolean bo = (++a/3==0 && a++/7==0)?true:false;
		
		//输出a的值,bo的
		System.out.println(("a的值:"+a)+"\n"+("bo的值:"+bo));
		
		//. 定义boolean类型变量bo2 , 判断b++ 是否被3整除,并且++b 是否被7整除,将结果赋值给bo2
	    boolean bo2 = b++/3==0?++b/7==0?true:false:false;
	    
	    //. 输出b的值,bo2的值.
	    System.out.println(("b的值:"+b)+"\n"+("bo2的值:"+bo2));
	    
	    System.out.println("-------------------------");
	    
	    
   //第二题
	    //请输入一个数，判断这个数是不是5的倍数,输出结果
	    Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数:");
		double number = scanner.nextDouble();
		if(number/5==0) {
			System.out.println("是五的倍数");
		}else {
			System.out.println("不是五的倍数");
		}
		
		System.out.println("-------------------------");
		
	//第三题
		//请输入一个月份，和年份，判断这个月有多少天，如果是2月，还要根据判断闰年去获取天数
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("请输入一个年份:");
		int  year = scanner.nextInt();
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("请输入一个月份:");
		int  moon = scanner.nextInt();
		
	    if(moon>0 && moon<12) {//限制月份1——12
	    	if((year%4==0 && year%100!=0) || year % 400 == 0) {//判断闰年
				switch(moon) {//闰年
				      case 1:
				      case 3:
				      case 5:
				      case 7:
				      case 8:
				      case 10:
				      case 12:
				    	  System.out.println(year+"年的"+moon+"月是30天。");
				    	  break;
				      case 4:
				      case 6:
				      case 9:
				    	  System.out.println(year+"年的"+moon+"月是31天");
				    	  break;
				      default:
				    	  System.out.println(year+"年的"+moon+"月是28天");
				}
			}else {
				switch(moon) {//平年
			      case 1:
			      case 3:
			      case 5:
			      case 7:
			      case 8:
			      case 10:
			      case 12:
			    	  System.out.println(year+"年的"+moon+"月是30天。");
			    	  break;
			      case 4:
			      case 6:
			      case 9:
			    	  System.out.println(year+"年的"+moon+"月是31天");
			    	  break;
			      default:
			    	  System.out.println(year+"年的"+moon+"月是29天");
			}
	    }
	}else {
		System.out.println("对不起，没有这个月份！");
	}
	    
	    System.out.println("-------------------------");
	    
	    
	//第四题
	    //编写⼀个程序，获取⽤户输⼊的狗的年龄，通过程序显⽰其相当于⼈类的年龄是多少。如果⽤户输⼊负
	    //数，请显⽰⼀个提⽰信息。 （狗的前两年每⼀年相当于⼈类的10.5岁，之后每增加⼀年就增加四岁。）
	    Scanner scanner3 = new Scanner(System.in);
	    System.out.println("请输入狗的年龄:");
	    int dogold = scanner.nextInt();
	    if(dogold>0) {
	    	if(dogold==1) {
	    		double age = 10.5; 
	    	}else {
	    		double age = (dogold - 2)*4+21;
	    	}
	    	String age = null;
			System.out.println("狗的"+dogold+"年龄"+"转换为人类的年龄为：" + age);
	    }else {
	    	System.out.println("对不起，你输入的狗的年龄不正确，请重新输入！");
	    }
	    
	    System.out.println("-------------------------");
	    
	 //第五题   
	    Scanner scanner4 = new Scanner(System.in);
	    System.out.println("请输入小鱼游泳的初始和末始时间:");
	    double time = scanner.nextDouble();
	    System.out.print("	");
	    double time1 = scanner.nextDouble();
	    System.out.print("	");
	    double time2 = scanner.nextDouble();
	    System.out.print("	");
	    double time3 = scanner.nextDouble();
	    
	    double e,f;
	    if((time>0 && time<24) && (time1>0 && time1<60) && (time2>0 && time2<60) && (time3>0 && time3<60)) {
	        e =(int) (time2 - time);
	    	if(time1>time3) {
	    		e -= 1;
	    		time+=60;
	    	}
	    	f = (int) (time3 - time1);
	    	System.out.println(e+""+f);
	    }else {
	    	System.out.println("请输入正确的时间");
	    }
  }
}
