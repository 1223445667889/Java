package MultithReading;

/**
 * 线程的通信 wait()与 notify()和  notifyAll()
 */
public class Communication {
    public static void main(String[] args){
        Communications c = new Communications();
        Thread thread = new Thread(c);
        thread.start();

//        for(int j = 0 ; j < 10; j++){
//            System.out.println("主线程");
//        }
    }

}
class Communications implements Runnable{
    int i=1;
    public void run(){
        while(true){
            synchronized (this){
                notify();//唤醒
                if(i<=100){
                    System.out.println(Thread.currentThread().getName()+":"+i++);
                }else{
                    break;
                }
                try {
                    wait();//阻塞
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}