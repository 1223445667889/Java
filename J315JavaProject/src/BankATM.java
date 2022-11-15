import java.util.Arrays;
import java.util.Scanner;

public class BankATM {
	public static void main(String[] args) {
		
		//管理员用户名和密码
		String str = "admin"; 
		
		boolean b = true,b1 = true;
		
		//用户初始化
		String[] user1 = new String[]{"zhangsan","123456","1000","正常"};
		String[] user2 = new String[]{"lisi","123456","1000","冻结"};
		String[][] users = {user1,user2};
		
		//开始登录
		do {
			b1 = true;//是否继续登录
			Scanner scanner = new Scanner(System.in);
			System.out.println("1.管理员登录   2.普通用户登录   3.退出 ");
			int shu = scanner.nextInt();
			switch(shu) {
			//管理员
			case 1:
				do {
					System.out.println("请输入管理员用户名和密码:");
					while(b1) {
						System.out.println("管理员账户名:");
						String adminuser = scanner.next();
						System.out.println("管理员密码:");
						String pwuser = scanner.next();
						if((adminuser.equals(str)) && (pwuser.equals(str))) {
							System.out.println("登录成功！请选择管理员功能:");		
							boolean b2= true;
							do {
								System.out.println("1.开卡  2.注销  3.查看所有用户类表  4.冻结用户  5.返回主界面");
								int shu1 = scanner.nextInt();
								switch(shu1) {
								case 1:
									//开户
									String[][] users1 = Arrays.copyOf(users,users.length+1);//users扩1,并赋值给users1
									String[] user3 = new String[4];//创建用户3
									System.out.println("请输入用户名:");
									String str1 = scanner.next();
									System.out.println("请输入用户密码:");
									String str2 = scanner.next();
									user3[0] = str1;
									user3[1] = str2;
									user3[2] = "0";
									user3[3] = "正常";
									//打印user3
									for(int i=0;i<user3.length;i++) {
										System.out.print(user3[i]+" ");
									}
									System.out.println();
									
									
									//将用户3放进用户列表中
									users1[users1.length-1] = user3;
								    users = users1;							
									System.out.println("开户成功！");
									break;
								case 2:
									//销户
									System.out.println("请输入要注销的账户:");
									String accunt = scanner.next();
									int index =-1;
									do {
										for(int i=0;i<users.length;i++) {
											if(accunt.equals(users[i][0])) {
												index=i;
											}
											if(index==-1) {
												System.out.println("用户不存在");
											}
										}
									}while(index==-1);
									
									//String[][] users2 = Arrays.copyOf(users,users.length-1);
									String[][] newUsers = new String[users.length-1][];
									//拷贝元素
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
									System.out.println("销户成功");
									break;
								case 3:
									//打印用户信息
									System.out.println("打印用户信息");
								    for(int i=0;i<users.length;i++) {
								    	for(int j=0;j<4;j++) {
								    		System.out.print(users[i][j]+" ");
								    	}
								    	System.out.println();
								    }
									break;
								case 4:
									// 冻结用户
									System.out.println("请输入冻结的用户账号:");
									String str3 = scanner.next();
									for(int i=0;i<users.length;i++) {
										if(users[i][0].equals(str3)) {//判断是否有改用户
											if(users[i][3].equals("正常")) {
												users[i][3] = "冻结";
											}else {
												System.out.println("该用户已被冻结");
											}
										} 
									}
									break;
								case 5:
									System.out.println("返回主界面");
									//退出管理员模式
									b2 = false;
									b1 = false;
									break;
							  }
							}while(b2);
							
						}else {
							System.out.println("账户或密码错误，请重新输入:");
						}
					}
					break;
				}while(true);
				break;
			//普通用户	
			case 2:
				boolean b3 = true;
				do {
					//输入账号
					System.out.println("普通用户登录,请输入账户:");
					String userName = scanner.next();
					System.out.println("请输入密码:");
					String userPw = scanner.next();
					//如果冻结则访问不了
					for(int i=0;i<users.length;i++) {
						if(userName.equals(users[i][0]) && userPw.equals(users[i][1])) {
							int sb = 0;
							if(users[i][3].equals("冻结")) {
								System.out.println("该用户已被冻结，请申请解冻！");
								sb = -1;
								b3 = false;
							}
							if(sb==0) {
								boolean b4 = true;
								do {
									
									System.out.println("登录成功，请选择用户功能:");
									System.out.println("1.查看余额  2.转账  3.取钱  4.存钱  5.返回主界面");
									int shu2 = scanner.nextInt();
									switch(shu2) {
									//查看余额
									     case 1:
									    	 System.out.println("查看"+users[i][0]+"的余额");
									         System.out.println("余额为："+users[i][2]);
									         break;
									     //转账
									     case 2:
									    	 int a = 0;
									    	 System.out.println("请输入转入账户:");
									    	 String account = scanner.next();
									    	 System.out.println("请输入转账金额:");
									    	 int money = scanner.nextInt();
									    	 int money1 = Integer.parseInt(users[i][2]);//字符穿转为整形
											 //再转账，取款，余额不足的条件判断
									    	 if(money1<money) {
									    		 System.out.println("你的金额不足!");
									    	 }else {
									    		 money1 -= money;
										    	 users[i][2] = Integer.toString(money1);
										    	 System.out.println("用户"+users[i][0]+"的余额为:"+users[i][2]);
										    	 while(a<(users.length)) {//在库中查找转入用户
										    		 if(users[a][0].equals(account)) {
											    		 int money2 = Integer.parseInt(users[a][2]);
												    	 money2 += money;
												    	 users[a][2] = Integer.toString(money2);
												    	 System.out.println("用户"+users[a][0]+"的余额为:"+users[a][2]);
											    	 }
										    		 a++;
										    	 }
									    	 }
									    	 break;
									    //取钱
									    case 3:
									    	 System.out.println("请输入取款金额:");
									    	 int money3 = scanner.nextInt();
									    	 int money4 = Integer.parseInt(users[i][2]);
											 //再转账，取款，余额不足的条件判断
									    	 if(money4<money3) {
									    		 System.out.println("你的金额不足!");
									    	 }else {
										    	 money4 -= money3;
										    	 users[i][2] = Integer.toString(money4);
										    	 System.out.println("用户"+users[i][0]+"的余额为:"+users[i][2]);
									    	 }
									    	 break;
								    	//存钱
									    case 4:
									    	System.out.println("请输入存款金额:");
									    	 int money5 = scanner.nextInt();
									    	 int money6 = Integer.parseInt(users[i][2]);
									    	 money6 += money5;
									    	 users[i][2] = Integer.toString(money6);
									    	 System.out.println("用户"+users[i][0]+"的余额为:"+users[i][2]);
									    	 break;
									    //返回主界面
									    //退出普通用户模式
									    case 5:
									    	System.out.println("返回主界面");
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
			//退出
			//退出整个循环
			case 3:
				System.out.println("退出");
				if(shu==3) {
					b = false;
				}
			}
		}while(b);
		
	}
}
