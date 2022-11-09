package MultithReading;

public class Synchronized1 {
    public static void main(String[] args)throws Exception{
        MyThread2 myThread2 = new MyThread2();
        Thread thread = new Thread(myThread2);
        Thread thread1 = new Thread(myThread2);
        thread.start();
        thread1.start();

    }

}
class OutputData {
    //    //1.
//    public void output(Thread thread){
//        for(int i=0;i<5;i++){
//            System.out.println(thread.getName()+":"+"输出"+i);
//        }
//    }
    //2.
//    public void output(Thread thread) {
//        //this就是当前对象
//        synchronized (this) {
//            for (int i = 0; i < 5; i++) {
//                System.out.println(thread.getName() + ":" + "输出" + i);
//            }
//        }
//    }
    //3.
    public void output(Thread thread){
        //this就是当前对象
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(thread.getName() + ":" + "输出" + i);
            }
        }
    }
}

class MyThread2 implements Runnable{
    OutputData inserData = new OutputData();

    public void run(){
        inserData.output(Thread.currentThread());
    }
}