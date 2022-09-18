public class Java4 {
    public static void main(String[] args){
        double a = 81.29;
        int b = 2;
        double c = a + b;
        System.out.println("c:"+c);
        //整数
        byte b1 =Byte.MAX_VALUE;
        System.out.println(b1);
        short s1 =Short.MAX_VALUE;
        System.out.println(s1);
        int i1 =Integer.MAX_VALUE;
        System.out.println(i1);
        long l1 =Long.MAX_VALUE;
        System.out.println(l1);
        //小数
        float f = 3.1415926f;
        float f1 = Float.MAX_VALUE;
        System.out.println(f1);
        double d1 = Double.MAX_VALUE;
        System.out.println(d1);
        //字符  0-65535，没有负数的概念
        char c1 =Character.MAX_VALUE;
        char c2 =Character.MAX_VALUE;
        System.out.println((int)c1);
        System.out.println((int)c2);
        //布尔
        boolean booL1 = false;
        boolean booL2 = true;
        System.out.println(booL1);
        System.out.println(booL2);

    }
}
