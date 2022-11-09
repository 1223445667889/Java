package MultithReading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * TryLock 获取锁
 */
public class TryLock1 {
    public static void main(String[] args){
        Lock lock = new ReentrantLock();
        OutputData1 outputData1 = new OutputData1();
        new Thread(){
            public void run(){
                outputData1.output(Thread.currentThread(),lock);
            }
        }.start();

        new Thread(){
            public void run(){
                outputData1.output(Thread.currentThread(),lock);
            }
        }.start();
    }
}
class OutputData2{
    public void output(Thread thread, Lock lock){
        if(lock.tryLock()) {
            try {
                System.out.println(thread.getName() + "得到的锁");
                Thread.sleep(100);//是效果更为明显
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(thread.getName() + "释放锁");
                lock.unlock();
            }
        }else{
            System.out.println(thread.getName()+"获取锁失败");
        }
    }
}