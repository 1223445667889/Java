package PK.game;

public class Arena {
	public static void main(String[] args) {
		//�������ĳ�ʼ��
		Nature[] altmans = new Nature[5];
		altmans[0] = new Nature("����",80,50,"���Ⲩ");
		altmans[1] = new Nature("��˹",90,60,"˹����ķ����");
		altmans[2] = new Nature("̩��",100,70,"÷����ķ���� ");
		altmans[3] = new Nature("��ŷ",100,70,"��������");
		altmans[4] = new Nature("����",95,60,":M87����");
		
		//���޵ĳ�ʼ��
		Nature[] monsters = new Nature[5];
		monsters[0] = new Nature("�׵���",90,50,"˦β");
		monsters[1] = new Nature("��Ī��",100,60,"����");
		monsters[2] = new Nature("�ܶ�",100,80,"��������");
		monsters[3] = new Nature("������",90,60,"����");
		monsters[4] = new Nature("Ī�����",70,40,"����");
		
		int a =0 ,b=5,d=1;
		boolean c=true;
		
		do {
			
			//������������±꣬�������±귶Χ��
			int num =(int)(Math.random()*b);
			System.out.println("----------------------------1");
			System.out.println("��"+d+"��");
			System.out.println(altmans[num].getName()+"PK"+monsters[num].getName());
			//������ֵ�ж�˭�ȳ���
			int numbers = (int)(Math.random()*10);
			if(numbers>5) {
				System.out.println(altmans[num].getName()+"�ȳ���");
				 a = 1;
			}else {
				System.out.println(monsters[num].getName()+"�ȳ���");
				 a = 2;
			}
			//����غ�
	    	int r=1;
		    do{//ÿ�ֵ�PK�غ����������˺�����ѭ����ֱ��˫��Ѫ����ʧ
		    	
		    	//��������˺�
				int number = (int)(Math.random()*10);			
				//ÿ2�غϷ���һ�μ���,������ܵ�MPֵС��20�����ܲ��ܷ���
				if(r%2==0) {
					if(altmans[num].getMP()>20 && monsters[num].getMP()>20) {
						number+=10;	//�������ܣ�����10���˺�				
						altmans[num].setMP(altmans[num].getMP()-20);
						monsters[num].setMP(monsters[num].getMP()-20);
					}
				}
				
				if(a==1) {//����������
					monsters[num].setPH(monsters[num].getPH()-number);
			        altmans[num].setPH(altmans[num].getPH()-number);
			        
				}else if(a==2){//��������
				altmans[num].setPH(altmans[num].getPH()-number);
				monsters[num].setPH(monsters[num].getPH()-number);
				}
		        r++;
			}while(altmans[num].getPH()>0 && monsters[num].getPH()>0);
		    System.out.println("������"+r+"���غ�");
		    
		    
	        System.out.println(altmans[num].getName()+"��Ѫ��Ϊ:"+altmans[num].getPH());
			System.out.println(monsters[num].getName()+"��Ѫ��Ϊ:"+monsters[num].getPH());
			
			//�жϻ�ʤ��
			if(altmans[num].getPH()> monsters[num].getPH()) {
				System.out.println(altmans[num].getName()+"ʤ��");
			}else if(altmans[num].getPH()< monsters[num].getPH()){
				System.out.println(monsters[num].getName()+"ʤ��");
			}else if(altmans[num].getPH()== monsters[num].getPH()) {
				System.out.println("ƽ��");
			}
		
			//����������͹��������������һ���������ѭ��������Ҫ�ڼ�����
			if(altmans.length==1) {
				c = false;
				break;
			}
			
			//�����������һ
			Nature[] altmans1 = new Nature[5];
			altmans1 = new Nature[altmans.length-1];
			for(int i=0;i<altmans.length;i++) {
				if(i<num) {
					altmans1[i] = altmans[i];
				}else if(i==num) {
					continue;
				}else {
					altmans1[i-1] = altmans[i];
				}
			}
			altmans = altmans1;
			
			//���������һ
			Nature[] monsters1 = new Nature[5];
			monsters1 = new Nature[monsters.length-1];
			for(int i=0;i<monsters.length;i++) {
				if(i<num) {
					monsters1[i] = monsters[i];
				}else if(i==num) {
					continue;
				}else {
					monsters1[i-1] = monsters[i];
				}
			}
			monsters = monsters1;
			
			b--;//����������±��������һ�ķ�Χ�ڣ���������ķ�Χ��4��������±귶ΧΪ5�������ͻ�����ֱ���
			d++;//�������
			System.out.println("-------------------------2");
		}while(c);
		
	}
}
