
public class Javaclass4 {
	public static void main(String[] args) {
		print();
		sum(6,8);
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		sum("a",1,2,3);
	}
	
	public static void print() {
		for(int i=0;i<10;i++) {
			System.out.println("���S");
		}
	}
	
	public static void sum(int a,int b) {
		System.out.println("��Ϊ:"+(a+b));
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
	
	//�ɱ����
	public static void sum(String str,int... d) {
		for(int i:d) {
			System.out.println(i);
		}
	}	
	//��ͬһ�����У���������������ȫ��ͬ(�������Ͳ�������)�ķ�������
	//ͬһ����(��������ͬ)����ͬ����(�����б�ͬ) ����������
	//���غ����η��޹�
	public static void print1(int a,String b,double c) {
		
	}
	public static void print1() {
		
	}
	
	//����ʱ ���ɱ�������ܺ����鹲��
	

}
