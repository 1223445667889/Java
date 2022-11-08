package Project.Recursion;

public class recursion {

    //递归地练习
    public static void main(String[] args){

        T t = new T();
        t.Test(5);

        F f = new F();
        int res = f.factorial(6);
        System.out.println("res="+res);

        A a = new A();
        int num = a.fibonacci(9);
        System.out.println("斐波那契数1123581321...n="+num);

        B b = new B();
        int cmb = b.peach(1);
        System.out.println("第一天的桃子为:"+cmb);

        int[][] map = new int[8][7];
        C c = new C();
        map = c.MiGong();
        c.findWay(map,1,1);
        System.out.println();
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[i].length;j++){
                System.out.print(map[i][j]+"  ");
            }
            System.out.println();
        }

        D d = new D();
        d.move(5,'A','B','C');


//        //几个皇后
//        int max = 8;
//        //保存皇后的位置
//        int[] array = new int[max];
//        //统计解法
//        int count =0;
//        E  e = new E();
//        e.check(8);
//        System.out.println("解法："+count);

    }
}

//递归调用
class T{
    public void Test(int n){
        if(n>2){
            Test(n-1);
        }
        System.out.println("n="+n);
    }

}

//阶乘
class F{
    public int factorial(int a){
        if(a==1){
            return 1;
        }else{
            return factorial(a-1)*a;
        }
    }
}

//斐波那契数
class A{
    public int fibonacci(int n){
        if(n>=1){
            if(n ==1 || n==2){
                return 1;
            }else{
                return  fibonacci(n-1)+fibonacci(n-2);
            }
        }else{
            System.out.println("要求输入的数为大于等于1的整数");
        }
        return 0;
    }
}

//猴子吃桃子
class B{
    public int peach(int day){
        if(day == 10){
            return 1;
        }else if(day>=1 && day<=9){
            return (peach(day +1)+1)*2;
        }else{
            System.out.println("day在1~10内");
            return 0;
        }
    }
}

//迷宫问题
class C{
    public int[][] MiGong(){
        //设定二维数组，规定数组元素：0表示可以走，1表示障碍物
        int[][] map = new int[8][7];
        //将 顶行和低行设为1
        for(int i=0;i<7;i++){
            map[0][i] = 1;
            map[7][i] = 1;
        }

        //将 最右行和最左行置1
        for(int i=0;i<map.length;i++){
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        map[5][3] = 1;
        map[5][4] = 1;
        map[5][5] = 1;


        //遍历
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[i].length;j++){
                System.out.print(map[i][j]+"  ");
            }
            System.out.println();
        }
        return map;
    }

    //1代表障碍物，2代表可以走，3表示走过，但不能再一次走，走不通
    //设置初始位置(1,1)
    //设置末始位置(5,6)
    //找路策略 上下左右一次寻找
    public boolean findWay(int[][] map,int i,int j){
        if(map[6][5] == 2){
            return true;
        }else{
            if(map[i][j] == 0){//为0可以走
                map[i][j] = 2;
                //判断上下左右是否能走
                if(findWay(map,i+1,j)){
                    return true;
                }else if(findWay(map,i,j+1)){
                    return true;
                }else if(findWay(map,i-1,j)){
                    return true;
                }else if(findWay(map,i,j-1)){
                    return true;
                }else{
                    map[i][j] = 3;//回溯，如果不通，会往回走，所以要标注3
                    return false;
                }
            }else{
                return false;
            }
        }
    }
}

//汉诺塔
class D{
    public void move(int num,char a,char b,char c){
        //如果只有一个盘 num = 1
        if(num==1){
            System.out.println(a+"->"+c);
        }else{
            //如果有多个盘，可以看成两个，最下面的和上面的所有盘(num-1)
            //先移动上面所有的盘到b，借助c
            move(num-1,a,c,b);
            //把最下面的这个盘 移动到c
            System.out.println(a+"->"+c);
            //再把b的苏哦优盘移动到c，借助a
            move(num-1,b,a,c);
        }
    }
}

////八皇后
//class E{
//    public void Queen{
//        int[] arr = new int[]{0,4,7,5,2,6,1,3};
//        int[][] queen = new int[8][8];
//
//        //初始化棋盘
//        for(int[] data:queen){
//            for(int item : data){
//                System.out.println("%4d",itme);
//            }
//            System.out.println();
//        }
//        for(int i=0;i<arr.length;i++){
//            queen[i][arr[i]] = 1;
//        }
//        System.out.println("=================");
//        for(int[] data:queen){
//            for(int item:data){
//                System.out.println("%4d",item);
//            }
//            System.out.println();
//        }
//    }
//
//    private boolean judge(int n){
//        for(int i=0;i<n;i++){
//            if(array[i] == array[n]){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public void check(int n){
//        if(n==max){
//            print();
//            return;
//        }
//        for(int i=0;i<max;i++){
//            array[n] = i;
//            if(judge(n)){
//                check(n+1);
//            }
//        }
//    }
//
//    private void print(){
//        count++;
//        for(int i=0;i<array.length;i++){
//            System.out.println(array[i]+" ");
//        }
//        System.out.println();
//    }
//}

