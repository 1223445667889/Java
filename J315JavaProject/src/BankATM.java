import java.util.Arrays;
import java.util.Scanner;

public class BankATM {
	public static void main(String[] args) {
		
		//����Ա�û���������
		String str = "admin"; 
		
		boolean b = true,b1 = true;
		
		//�û���ʼ��
		String[] user1 = new String[]{"zhangsan","123456","1000","����"};
		String[] user2 = new String[]{"lisi","123456","1000","����"};
		String[][] users = {user1,user2};
		
		//��ʼ��¼
		do {
			b1 = true;//�Ƿ������¼
			Scanner scanner = new Scanner(System.in);
			System.out.println("1.����Ա��¼   2.��ͨ�û���¼   3.�˳� ");
			int shu = scanner.nextInt();
			switch(shu) {
			//����Ա
			case 1:
				do {
					System.out.println("���������Ա�û���������:");
					while(b1) {
						System.out.println("����Ա�˻���:");
						String adminuser = scanner.next();
						System.out.println("����Ա����:");
						String pwuser = scanner.next();
						if((adminuser.equals(str)) && (pwuser.equals(str))) {
							System.out.println("��¼�ɹ�����ѡ�����Ա����:");		
							boolean b2= true;
							do {
								System.out.println("1.����  2.ע��  3.�鿴�����û����  4.�����û�  5.����������");
								int shu1 = scanner.nextInt();
								switch(shu1) {
								case 1:
									//����
									String[][] users1 = Arrays.copyOf(users,users.length+1);//users��1,����ֵ��users1
									String[] user3 = new String[4];//�����û�3
									System.out.println("�������û���:");
									String str1 = scanner.next();
									System.out.println("�������û�����:");
									String str2 = scanner.next();
									user3[0] = str1;
									user3[1] = str2;
									user3[2] = "0";
									user3[3] = "����";
									//��ӡuser3
									for(int i=0;i<user3.length;i++) {
										System.out.print(user3[i]+" ");
									}
									System.out.println();
									
									
									//���û�3�Ž��û��б���
									users1[users1.length-1] = user3;
								    users = users1;							
									System.out.println("�����ɹ���");
									break;
								case 2:
									//����
									System.out.println("������Ҫע�����˻�:");
									String accunt = scanner.next();
									int index =-1;
									do {
										for(int i=0;i<users.length;i++) {
											if(accunt.equals(users[i][0])) {
												index=i;
											}
											if(index==-1) {
												System.out.println("�û�������");
											}
										}
									}while(index==-1);
									
									//String[][] users2 = Arrays.copyOf(users,users.length-1);
									String[][] newUsers = new String[users.length-1][];
									//����Ԫ��
									for(int i=0;i<users.length;i++) {
										if(i<index) {
											newUsers[i] = users[i];
										}else if(i==index) {
											continue;
										}else {
											newUsers[i-1] = users[i];
										}
									}
									users = newUsers;
									System.out.println("�����ɹ�");
									break;
								case 3:
									//��ӡ�û���Ϣ
									System.out.println("��ӡ�û���Ϣ");
								    for(int i=0;i<users.length;i++) {
								    	for(int j=0;j<4;j++) {
								    		System.out.print(users[i][j]+" ");
								    	}
								    	System.out.println();
								    }
									break;
								case 4:
									// �����û�
									System.out.println("�����붳����û��˺�:");
									String str3 = scanner.next();
									for(int i=0;i<users.length;i++) {
										if(users[i][0].equals(str3)) {//�ж��Ƿ��и��û�
											if(users[i][3].equals("����")) {
												users[i][3] = "����";
											}else {
												System.out.println("���û��ѱ�����");
											}
										} 
									}
									break;
								case 5:
									System.out.println("����������");
									//�˳�����Աģʽ
									b2 = false;
									b1 = false;
									break;
							  }
							}while(b2);
							
						}else {
							System.out.println("�˻��������������������:");
						}
					}
					break;
				}while(true);
				break;
			//��ͨ�û�	
			case 2:
				boolean b3 = true;
				do {
					//�����˺�
					System.out.println("��ͨ�û���¼,�������˻�:");
					String userName = scanner.next();
					System.out.println("����������:");
					String userPw = scanner.next();
					//�����������ʲ���
					for(int i=0;i<users.length;i++) {
						if(userName.equals(users[i][0]) && userPw.equals(users[i][1])) {
							int sb = 0;
							if(users[i][3].equals("����")) {
								System.out.println("���û��ѱ����ᣬ������ⶳ��");
								sb = -1;
								b3 = false;
							}
							if(sb==0) {
								boolean b4 = true;
								do {
									
									System.out.println("��¼�ɹ�����ѡ���û�����:");
									System.out.println("1.�鿴���  2.ת��  3.ȡǮ  4.��Ǯ  5.����������");
									int shu2 = scanner.nextInt();
									switch(shu2) {
									//�鿴���
									     case 1:
									    	 System.out.println("�鿴"+users[i][0]+"�����");
									         System.out.println("���Ϊ��"+users[i][2]);
									         break;
									     //ת��
									     case 2:
									    	 int a = 0;
									    	 System.out.println("������ת���˻�:");
									    	 String account = scanner.next();
									    	 System.out.println("������ת�˽��:");
									    	 int money = scanner.nextInt();
									    	 int money1 = Integer.parseInt(users[i][2]);//�ַ���תΪ����
											 //��ת�ˣ�ȡ�����������ж�
									    	 if(money1<money) {
									    		 System.out.println("��Ľ���!");
									    	 }else {
									    		 money1 -= money;
										    	 users[i][2] = Integer.toString(money1);
										    	 System.out.println("�û�"+users[i][0]+"�����Ϊ:"+users[i][2]);
										    	 while(a<(users.length)) {//�ڿ��в���ת���û�
										    		 if(users[a][0].equals(account)) {
											    		 int money2 = Integer.parseInt(users[a][2]);
												    	 money2 += money;
												    	 users[a][2] = Integer.toString(money2);
												    	 System.out.println("�û�"+users[a][0]+"�����Ϊ:"+users[a][2]);
											    	 }
										    		 a++;
										    	 }
									    	 }
									    	 break;
									    //ȡǮ
									    case 3:
									    	 System.out.println("������ȡ����:");
									    	 int money3 = scanner.nextInt();
									    	 int money4 = Integer.parseInt(users[i][2]);
											 //��ת�ˣ�ȡ�����������ж�
									    	 if(money4<money3) {
									    		 System.out.println("��Ľ���!");
									    	 }else {
										    	 money4 -= money3;
										    	 users[i][2] = Integer.toString(money4);
										    	 System.out.println("�û�"+users[i][0]+"�����Ϊ:"+users[i][2]);
									    	 }
									    	 break;
								    	//��Ǯ
									    case 4:
									    	System.out.println("����������:");
									    	 int money5 = scanner.nextInt();
									    	 int money6 = Integer.parseInt(users[i][2]);
									    	 money6 += money5;
									    	 users[i][2] = Integer.toString(money6);
									    	 System.out.println("�û�"+users[i][0]+"�����Ϊ:"+users[i][2]);
									    	 break;
									    //����������
									    //�˳���ͨ�û�ģʽ
									    case 5:
									    	System.out.println("����������");
											b4 = false;
											b3 = false;
											break;
									}
								}while(b4);
							}
						}
				    }
				}while(b3);				
				break;
			//�˳�
			//�˳�����ѭ��
			case 3:
				System.out.println("�˳�");
				if(shu==3) {
					b = false;
				}
			}
		}while(b);
		
	}
}
