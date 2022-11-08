package MultithReading;

/**
 * 多线程中的Thread
 * 自定义线程类继承Thread类
 * 重写run()方法，编写线程执行体
 * 创建线程对象，调用start()方法启动线程
 */
public class Threads {
    public static void main(String[] args){
        MyThread myThread = new MyThread();
        MyThread1 myThread1 = new MyThread1();
        myThread1.run();
        myThread.start();
        try{
            Thread.sleep(2);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        for(int i=0;i<10;i++){
            System.out.println("我是主线程");
        }
    }
}

class MyThread extends Thread{
    @Override
    public void run(){
        for(int i =0;i<10;i++){
            System.out.println("我是子线程");
        }
    }
}

class MyThread1 extends Thread{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("我是子线程1");
        }
    }
}
