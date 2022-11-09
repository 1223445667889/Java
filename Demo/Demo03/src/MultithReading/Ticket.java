package MultithReading;

/**
 * 火车站买票
 */
public class Ticket {
    public static void main(String[] args){
        //实例化站台对象
        Station station1 = new Station();
        Station station2 = new Station();
        Station station3 = new Station();

        //站台各自工作
        station1.start();
        station2.start();
        station3.start();
    }
}
class  Station extends  Thread{
    static volatile  int p = 20;
    static Object object = new Object();
    public void run(){
        while(p>0){
            synchronized (object){
                if(p>0){
                    System.out.println("卖出了第"+p+"张票");
                    p -= 1;
                }
            }
            synchronized (this){
                if(p==0){
                    System.out.println("票卖完了");
                }
            }
            try{
                Thread.sleep(100);
            }catch(Exception e){

            }
        }
    }
}