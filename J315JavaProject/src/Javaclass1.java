
public class Javaclass1 {
	public static void main(String[] args) {
		//循环作用，决解重复性代码问题
		
		//判断一个数是不是质数
			int number = 13;
			boolean siZhishu = true;
			for(int i =2;i<number;i++) {
				if(number % i  ==0) {
					siZhishu = false;
				}
				if(siZhishu) {
					System.out.println(number+"是质数");
				}else {
					System.out.println(number+"不是质数");
				}
				break;
			}
		
		
		
		//打印每行的星星，行数等于星数
		for(int i =1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//九九乘法表
		int number1 =9,product=0;
		for(int i=1;i<=number1;i++) {
			for(int j=1;j<=i;j++) {
				product = i*j;
				System.out.print(i+"*"+j+"="+product+"\t");
			}
			System.out.println("	");
		}
		
		//阶乘的和
		int number3 =1,sum=0 ;
		for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
				number3 *= j;
			}
			sum+=number3;
			number3 = 1;
		}
		System.out.println(sum);
		
		
		//百钱买百鸡 公鸡5块  母鸡3块   小鸡1快3只
		int gongji  = 100/5;
		for(int i = gongji;i>=0;i--) {
			int muji = (100-i*5)/3;
			for(int j = muji;j>=0;j--) {
				int xiaoji = (100-i*5-j*3)*3;
				if((i+j+xiaoji)==100) {
					System.out.println("用一百块买了一百只鸡:\t公鸡:"+i+"\t母鸡:"+j+"\t小鸡:"+xiaoji);
				}
			}
		}
		
		//等腰三角形
		for(int i=10;i>=0;i--) {
			for(int j =1;j<=i;j++) {
				System.out.print(" ");
			}
	
			for(int j=i;j<=10;j++) {
				System.out.print("*");
			}
			
			for(int j=i+1;j<=10;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}

