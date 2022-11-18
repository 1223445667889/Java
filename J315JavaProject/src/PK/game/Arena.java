package PK.game;

public class Arena {
	public static void main(String[] args) {
		//奥特曼的初始化
		Nature[] altmans = new Nature[5];
		altmans[0] = new Nature("迪迦",80,50,"极光波");
		altmans[1] = new Nature("艾斯",90,60,"斯派修姆光线");
		altmans[2] = new Nature("泰罗",100,70,"梅塔利姆光线 ");
		altmans[3] = new Nature("雷欧",100,70,"集束光线");
		altmans[4] = new Nature("佐菲",95,60,":M87光线");
		
		//怪兽的初始化
		Nature[] monsters = new Nature[5];
		monsters[0] = new Nature("雷德王",90,50,"甩尾");
		monsters[1] = new Nature("格莫拉",100,60,"雷射");
		monsters[2] = new Nature("杰顿",100,80,"等离子炮");
		monsters[3] = new Nature("格力扎",90,60,"火焰");
		monsters[4] = new Nature("莫格大蛇",70,40,"黑噬");
		
		int a =0 ,b=5,d=1;
		boolean c=true;
		
		do {
			
			//产生随机数的下标，在数组下标范围内
			int num =(int)(Math.random()*b);
			System.out.println("----------------------------1");
			System.out.println("第"+d+"局");
			System.out.println(altmans[num].getName()+"PK"+monsters[num].getName());
			//产生数值判断谁先出手
			int numbers = (int)(Math.random()*10);
			if(numbers>5) {
				System.out.println(altmans[num].getName()+"先出手");
				 a = 1;
			}else {
				System.out.println(monsters[num].getName()+"先出手");
				 a = 2;
			}
			//计算回合
	    	int r=1;
		    do{//每局的PK回合数，技能伤害进行循环，直至双方血量消失
		    	
		    	//随机增加伤害
				int number = (int)(Math.random()*10);			
				//每2回合发动一次技能,如果技能的MP值小于20，则技能不能发动
				if(r%2==0) {
					if(altmans[num].getMP()>20 && monsters[num].getMP()>20) {
						number+=10;	//发动技能，增加10点伤害				
						altmans[num].setMP(altmans[num].getMP()-20);
						monsters[num].setMP(monsters[num].getMP()-20);
					}
				}
				
				if(a==1) {//奥特曼先手
					monsters[num].setPH(monsters[num].getPH()-number);
			        altmans[num].setPH(altmans[num].getPH()-number);
			        
				}else if(a==2){//怪兽先手
				altmans[num].setPH(altmans[num].getPH()-number);
				monsters[num].setPH(monsters[num].getPH()-number);
				}
		        r++;
			}while(altmans[num].getPH()>0 && monsters[num].getPH()>0);
		    System.out.println("共打了"+r+"个回合");
		    
		    
	        System.out.println(altmans[num].getName()+"的血量为:"+altmans[num].getPH());
			System.out.println(monsters[num].getName()+"的血量为:"+monsters[num].getPH());
			
			//判断获胜方
			if(altmans[num].getPH()> monsters[num].getPH()) {
				System.out.println(altmans[num].getName()+"胜利");
			}else if(altmans[num].getPH()< monsters[num].getPH()){
				System.out.println(monsters[num].getName()+"胜利");
			}else if(altmans[num].getPH()== monsters[num].getPH()) {
				System.out.println("平局");
			}
		
			//如果奥特曼和怪兽数组已是最后一个，则结束循环，不需要在减数组
			if(altmans.length==1) {
				c = false;
				break;
			}
			
			//奥特曼数组减一
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
			
			//怪兽数组减一
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
			
			b--;//控制随机数下标在数组减一的范围内，否则数组的范围是4，随机数下标范围为5，会起冲突，出现报错
			d++;//计算局数
			System.out.println("-------------------------2");
		}while(c);
		
	}
}
