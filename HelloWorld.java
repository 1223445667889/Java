
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("HelloWorld!");
	
		//��������(Ҫ�����ڴ��п��ٿռ䣬������)
		
		//��������  ������
		int number=0;
		byte k=3;
		//�����������
		int a=2,b=3,c=5;
		double d = 3.1415926;
		int r = 0x32;
		long t = 234244223442L;
		float q = 10.23f;
		float v = 10;
		char l = 65535;//��Ҫ����65535������Ϊ��
		//��Χ���ݿ��Լ���С��Χ������,�Զ�ת��
		int w=k;
		//С��Χ��ת��Χ����Ҫǿת��������ת���λᾫ�ȶ�ʧ
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
