
public class Javaclass1 {
	public static void main(String[] args) {
		//ѭ�����ã������ظ��Դ�������
		
		//�ж�һ�����ǲ�������
			int number = 13;
			boolean siZhishu = true;
			for(int i =2;i<number;i++) {
				if(number % i  ==0) {
					siZhishu = false;
				}
				if(siZhishu) {
					System.out.println(number+"������");
				}else {
					System.out.println(number+"��������");
				}
				break;
			}
		
		
		
		//��ӡÿ�е����ǣ�������������
		for(int i =1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//�žų˷���
		int number1 =9,product=0;
		for(int i=1;i<=number1;i++) {
			for(int j=1;j<=i;j++) {
				product = i*j;
				System.out.print(i+"*"+j+"="+product+"\t");
			}
			System.out.println("	");
		}
		
		//�׳˵ĺ�
		int number3 =1,sum=0 ;
		for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
				number3 *= j;
			}
			sum+=number3;
			number3 = 1;
		}
		System.out.println(sum);
		
		
		//��Ǯ��ټ� ����5��  ĸ��3��   С��1��3ֻ
		int gongji  = 100/5;
		for(int i = gongji;i>=0;i--) {
			int muji = (100-i*5)/3;
			for(int j = muji;j>=0;j--) {
				int xiaoji = (100-i*5-j*3)*3;
				if((i+j+xiaoji)==100) {
					System.out.println("��һ�ٿ�����һ��ֻ��:\t����:"+i+"\tĸ��:"+j+"\tС��:"+xiaoji);
				}
			}
		}
		
		//����������
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

