import java.util.Arrays;

public class Javaclass2 {
	public static void main(String[] args ) {
		int[] number = {12,123,42,345,13};
		
		//foreach��������
		for(int n : number) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		for(int i=0;i<number.length;i++) {
			System.out.print(number[i]+" ");
		}
		System.out.println();
		
		//�������飬д��һ�����滻������ ��ֵ
		int[] numbers = {2,4,6,8,10,12,14,16,18,20}; 
		int max = 19;
		for(int i=0;i<numbers.length;i++) {
			if(max < numbers[i]) {
				numbers[i-1] = max;
			}
		}
		//����
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
		}
		System.out.println();
		
		
		//�ҳ����ֵ
		int [] nums = {2,3,48,17,21,34};
		int max1 = nums[0];
		for(int i=0;i<=nums.length-1;i++) {
			if(max1<nums[i]) {
				max1=nums[i];
			}
		}
		System.out.println(max1);
		
		//ѡ������
		int[] arr = {1,4,8,5,2,10,20,16,14};
		for(int i=0;i<=arr.length-1;i++) {
			for(int j =0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int a = 0;
					a = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = a; 
				}
			}
		}
		for(int i=0;i<arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//JDK�Դ�����
		Arrays.sort(arr);
		
		
		//ð������
		int[] numb = {3,1,4,9,6,7,24,28,12};
		for(int i=0;i<numb.length-1;i++) {
			for(int j=0;j<numb.length-i-1;j++) {
				if(numb[j]>numb[j+1]) {
					int a = 0;
					a = numb[j];
					numb[j] = numb[j+1];
					numb[j+1] = a;
				}
			}
		}
		for(int i =0;i<numb.length;i++) {
			System.out.print(numb[i]+" ");
		}
		System.out.println();
		
		
		//�ַ���������
		String st = "asoirugsudpzsow";
		char[] chars = st.toCharArray();
		Arrays.sort(chars);
		for(int i =0;i<=chars.length-1;i++) {
			System.out.print(chars[i]+" ");
		}
		System.out.println();
		
		
		//��������ݺ����� ʹ������мӼ�
		int[] numr = {1,2,4};
		//Arrays.copyOf(original, newLength) Arrays.copyOf(ԭ����,��ʾ������ĳ���)
		int[] numrs = Arrays.copyOf(numr,numr.length+1);
		
		//numr = Arrays.copyOf(numr,numr.length+1);
		//System.out.println(numr==numrs);//��ַ��һ��
		
		int[] newnumr = new int[numr.length+1];
		for(int i=0;i<numr.length;i++) {
			newnumr[i] = numr[i];
		}
		
		//˳����ָ��λ�ò���Ԫ��
		int[] suv = {1,2,3,4,5};
		int a=2,b=6;
		int[] suvs = Arrays.copyOf(suv,suv.length+1);
		for(int i=0;i<suvs.length-1;i++) {
			suvs[i] = suv[i];
			if(i==a) {
				suvs[i] = b;//���±�Ϊ2ʱ����6
			}else if(i>2) {
				suvs[i] = suv[i];
				
			}
		}
		for(int i=0;i<suvs.length;i++) {
			System.out.print(suvs[i]+" ");
		}
		System.out.println();
	} 
}
