package MultithReading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Lock 获取锁
 * Lock格式：Lock lock = ...;
 *          lock.lock();
 *          try{
 *              //处理任务
 *          }catch(Exception e){
 *              //捕捉异常
 *          }finally{
 *              lock.unlock();
 *          }
 */
public class Lock1 {
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
class OutputData1{
    public void output(Thread thread, Lock lock){
        lock.lock();
        try{
            System.out.println(thread.getName()+"得到的锁");
            Thread.sleep(100);//是效果更为明显
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(thread.getName()+"释放锁");
            lock.unlock();
        }
    }
}