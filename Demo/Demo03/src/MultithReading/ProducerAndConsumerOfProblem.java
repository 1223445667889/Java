package MultithReading;

import java.util.function.Consumer;

/**
 * 生产者和消费者问题: 生产者(Productor)将产品交给店员(Clerk)，而消费者(Customer)从店员处取走产品，
 *                 店员一次只能持有固定数量的产品(比如:20），如果生产者试图生产更多的产品，
 *                 店员会叫生产者停一下，如果店中有空位放产品了再通知生产者继续生产；
 *                 如果店中没有产品了，店员会告诉消费者等一下，如果店中有产品了再通知消费者来取走产品。
 */
public class ProducerAndConsumerOfProblem {
    public static void main(String[] args){
        Clerk clerk = new Clerk();
        Producer p1 = new Producer(clerk);
        Consumers c1 = new Consumers(clerk);
        Consumers c2 = new Consumers(clerk);
        p1.setName("生产者1");
        p1.setName("消费者1");
        p1.start();
        c1.start();
        c2.start();
    }
}

/**
 * 店员
 */
class Clerk{
    private int producterCount = 0;
    //喊生产者生产
    public synchronized void produceProduct(){
        if(producterCount < 20){
            producterCount++;
            System.out.println(Thread.currentThread().getName()+":请开始生产"+producterCount+"个产品");
            notify();
        }else{
            //等待
            try{
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //喊消费者消费
    public synchronized void consumerProduct(){
        if(producterCount>0){
            System.out.println(Thread.currentThread().getName()+":请开始消费"+producterCount+"个产品");
            producterCount--;
            notify();
        }else{
            try{
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/**
 * 生产者  生产产品
 */
class Producer extends Thread{
    private Clerk clerk;

    public Producer(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+":开始生产产品...");
        while(true){
            try{
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.produceProduct();
        }
    }
}

/**
 * 消费者  开始消费
 */
class Consumers extends Thread{
    private Clerk clerk;

    public Consumers(Clerk clerk) {
    }

    public void Consumers(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+":请开始消费产品...");
        while(true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.consumerProduct();
        }
    }
}
