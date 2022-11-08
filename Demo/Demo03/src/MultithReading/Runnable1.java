package MultithReading;

/**
 * 多线程中的Runnable
 * 定义MyRunnable类实现Runnable接口
 * 实现run()方法，编写线程执行体
 * 创建线程对象，调用start()方法启动线程
 */
public class Runnable1 {
    public static void main(String[] args){
        MyRunnable myRunnable = new MyRunnable();
        MyRunnable1 myRunnable1 = new MyRunnable1();
        Thread thread = new Thread(myRunnable);
        Thread thread1 = new Thread(myRunnable1);
        thread1.run();
        thread.start();
        for(int i=0;i<10;i++) {
            System.out.println("我是主线程");
        }
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("我是子线程");
        }
    }
}

class MyRunnable1 implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("我是子线程1");
        }
    }
}