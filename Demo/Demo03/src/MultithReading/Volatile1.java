package MultithReading;


/**
 * volatile: 1.当一个共享变量被volatile修饰时，它就具备了“可见性”，即这个变量被一个线程修改时，
 *             这个改变会立即被其他线程知道。就是你在这个线程修改了这个变量，另外的线程会立刻知道，也改变。
 *           2.当一个共享变量被volatile修饰时，会禁止“指令重排序”。
 *           3.使用volatile关键字会强制将变量的修改的值立即写至主内存；
 *           4.使用volatile关键字，当线程对某个变量（这个变量定义为V1）修改时，
 *             会强制将所有用到变量V1的线程对应的缓存中V1的缓存行置为无效。
 *             由于线程的V1缓存行无效，所以在运行时线程会读取主存中V1变量的值。
 *             所以到最后线程读取到的就是V1最新的值.
 *
 */
public class Volatile1 {
    public static void main(String[] args){
        AddClass addClass = new AddClass();
        new Thread(){
            public void run(){
                for(int i=0;i<100;i++){
                    addClass.add();
                    System.out.println(Thread.currentThread().getName()+":"+addClass.sum);
                }
            }
        }.start();

        new Thread(){
            public void run(){
                for(int j=0;j<100;j++){
                    addClass.add();
                    System.out.println(Thread.currentThread().getName()+":"+addClass.sum);
                }
            }
        }.start();
    }
}
class AddClass{
    public volatile  int sum = 0;
    public void add(){
        sum++;
    }
}