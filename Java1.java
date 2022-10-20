import java.util.Scanner;

public class Java1 {
	public static void main(String[] args) {
//			System.out.println("书名\t作者\t价格\t销量\n三国\t罗贯中\t120\t1000");
//		
//			
//			int a =  153;
//			int a1 = 153/10 , a2 =153%10 , a3=a2*a2*a2 ;
//			int b1 = a1/10 , b2 = a1%10 , b3= b2*b2*b2 ;
//			int c1 = b1/10, c2 = b1%10 , c3 = c2*c2*c2;
//			String d = a3+b3+c3 == a?"是水仙花数":"不是水仙花数";
//			System.out.println(d);
//			
//			
//			System.out.println("Hello");
//			int i=1;
//			while(i<=10) {
//				System.out.println("Hello");
//				i++;
//			}System.out.println("循环结束");
//			
//			int a4 = 1;
//			int sum =0;
//			while(a4<=100) {
//				if(a4 % 2 == 0) {
//					sum += a4;
//				}
//				a4++;
//			}
//			System.out.println("aum的和为:"+sum);
//			
//			System.out.println("-----------------------");
			
			//猴子吃桃，每天吃一半多一个，第十天剩一个
//			int day = 10,count=1;
//			while(day>1) {
//				count = (count+1)*2;
//				day--;
//			}
//			System.out.println(count);
//			
//			//反推
//			int o =2 ;
//			int a7 = 1534;
//			while(o<=10) {
//				a7 = a7 / 2 -1;
//				o++;
//			}
//			System.out.print(a7);
			
			//输入一个数，乘等输入的数
		    //Scanner scanner = new Scanner(System.in);
//			System.out.println("请输入一个数:");
//			int num = scanner.nextInt();
//			int result = 1;
//			while(i <= num) {
//				result *=2;
//			}
//			System.out.println(result);
//			
			
			//猜数字
//			int number = 5;
//		    int guessNum;
//			do {
//				System.out.println("请猜数字:");
//				guessNum = scanner.nextInt();
//				if(guessNum == number) {
//					System.out.println("才对了");
//				}else {
//					System.out.println("猜错了");
//				}
//				
//			}while(guessNum == number); 
			
			
			//判断质数
//			String st = "是质数"; 
//			String st1 = null;
//			int count9 = 0;
//			int i =2;
//			do{
//				Scanner num3 = new Scanner(System.in);
//				System.out.println("请输入一个数：");
//				int number1 = num3.nextInt();
//				while(i<=number1) {
//					if(number1 % i == 0) {
//							System.out.println("是质数:"+number1);
//						}else {
//						st1 = "不是质数";
//						System.out.println("不是质数");
//					}
//					i++;
//			   }
//			}while(st == st1); 
//			System.out.println("结束循环");
			
			
			//所有的水仙花数
//			int shuishu = 100;
//			int count1 = 0,count2 = 0;
//			while((shuishu>=100) && (shuishu<999)) {
//				//三个数的平方求和
//				int shui = shuishu;
//				int i1 =1;
//				while(i1<=3) {
//					int shui1 = shui % 10;
//					int sum5 = shui1*shui1*shui1;
//				    count1 += sum5;
//				    shui /= 10;
//					i1++;
//				}
//				//判断是否相等
//				if(shuishu == count1) {
//					count2++;
//				}
//				count1 = 0;
//				shuishu++;
//			}
//			System.out.println("总水仙花数为:"+count2);
			
			
		//两个数的最大公约数
			Scanner scanner7 = new Scanner(System.in);
			System.out.println("请输入两个数:");
			int ik = scanner7.nextInt();
			int ik2 = scanner7.nextInt();
			int ik3 = ik < ik2 ? ik : ik2; 
			int ik4= ik > ik2 ? ik : ik2;
				if(ik4%ik3==0) {
					System.out.println("最大的公因数为:"+ik3);
				}else {
					for(int i8=ik3-1;i8>1;i8--)
					{
						if((ik3%i8==0)&&(ik4%i8==0)) {
							System.out.println("最大公因数为:"+i8);
							break;
						}
					}
					
				}
   }
}
