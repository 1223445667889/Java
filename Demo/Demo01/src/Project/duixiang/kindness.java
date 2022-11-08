package Project.duixiang;

public class kindness {
    public static void main(String[] args) throws InterruptedException{
        int count=0;
        for(float i=2.5f;i>-2.0f;i-=0.12f){
            for(float j=-2.3f;j<2.3f;j+=0.041f){
                float a = i*i+j*j-4f;
                if((a*a*a-i*i*j*j*j)<-0.0f){
                    String str = "I LOVE YOU!";
                    int num = count%str.length();
                    System.err.print(str.charAt(num));
                    count++;
                }else{
                    System.out.print(" ");
                }
            }
            System.err.println();
            Thread.sleep(100);
        }
        System.out.println("如果好好爱一个人");
        System.out.println("谁不想呆在一个人身边一年又一年呢");
    }
}
