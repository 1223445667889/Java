import java.util.Scanner;

public class Java1 {
	public static void main(String[] args) {
//			System.out.println("����\t����\t�۸�\t����\n����\t�޹���\t120\t1000");
//		
//			
//			int a =  153;
//			int a1 = 153/10 , a2 =153%10 , a3=a2*a2*a2 ;
//			int b1 = a1/10 , b2 = a1%10 , b3= b2*b2*b2 ;
//			int c1 = b1/10, c2 = b1%10 , c3 = c2*c2*c2;
//			String d = a3+b3+c3 == a?"��ˮ�ɻ���":"����ˮ�ɻ���";
//			System.out.println(d);
//			
//			
//			System.out.println("Hello");
//			int i=1;
//			while(i<=10) {
//				System.out.println("Hello");
//				i++;
//			}System.out.println("ѭ������");
//			
//			int a4 = 1;
//			int sum =0;
//			while(a4<=100) {
//				if(a4 % 2 == 0) {
//					sum += a4;
//				}
//				a4++;
//			}
//			System.out.println("aum�ĺ�Ϊ:"+sum);
//			
//			System.out.println("-----------------------");
			
			//���ӳ��ң�ÿ���һ���һ������ʮ��ʣһ��
//			int day = 10,count=1;
//			while(day>1) {
//				count = (count+1)*2;
//				day--;
//			}
//			System.out.println(count);
//			
//			//����
//			int o =2 ;
//			int a7 = 1534;
//			while(o<=10) {
//				a7 = a7 / 2 -1;
//				o++;
//			}
//			System.out.print(a7);
			
			//����һ�������˵��������
		    //Scanner scanner = new Scanner(System.in);
//			System.out.println("������һ����:");
//			int num = scanner.nextInt();
//			int result = 1;
//			while(i <= num) {
//				result *=2;
//			}
//			System.out.println(result);
//			
			
			//������
//			int number = 5;
//		    int guessNum;
//			do {
//				System.out.println("�������:");
//				guessNum = scanner.nextInt();
//				if(guessNum == number) {
//					System.out.println("�Ŷ���");
//				}else {
//					System.out.println("�´���");
//				}
//				
//			}while(guessNum == number); 
			
			
			//�ж�����
//			String st = "������"; 
//			String st1 = null;
//			int count9 = 0;
//			int i =2;
//			do{
//				Scanner num3 = new Scanner(System.in);
//				System.out.println("������һ������");
//				int number1 = num3.nextInt();
//				while(i<=number1) {
//					if(number1 % i == 0) {
//							System.out.println("������:"+number1);
//						}else {
//						st1 = "��������";
//						System.out.println("��������");
//					}
//					i++;
//			   }
//			}while(st == st1); 
//			System.out.println("����ѭ��");
			
			
			//���е�ˮ�ɻ���
//			int shuishu = 100;
//			int count1 = 0,count2 = 0;
//			while((shuishu>=100) && (shuishu<999)) {
//				//��������ƽ�����
//				int shui = shuishu;
//				int i1 =1;
//				while(i1<=3) {
//					int shui1 = shui % 10;
//					int sum5 = shui1*shui1*shui1;
//				    count1 += sum5;
//				    shui /= 10;
//					i1++;
//				}
//				//�ж��Ƿ����
//				if(shuishu == count1) {
//					count2++;
//				}
//				count1 = 0;
//				shuishu++;
//			}
//			System.out.println("��ˮ�ɻ���Ϊ:"+count2);
			
			
		//�����������Լ��
			Scanner scanner7 = new Scanner(System.in);
			System.out.println("������������:");
			int ik = scanner7.nextInt();
			int ik2 = scanner7.nextInt();
			int ik3 = ik < ik2 ? ik : ik2; 
			int ik4= ik > ik2 ? ik : ik2;
				if(ik4%ik3==0) {
					System.out.println("���Ĺ�����Ϊ:"+ik3);
				}else {
					for(int i8=ik3-1;i8>1;i8--)
					{
						if((ik3%i8==0)&&(ik4%i8==0)) {
							System.out.println("�������Ϊ:"+i8);
							break;
						}
					}
					
				}
   }
}
