package MultithReading;

/**
 * 龟兔赛跑
 * 1 自定义一个boolean方法 决出胜利者
 * 2 将逻辑代码放入 线程体run方法中
 * 3 开启乌龟、兔子两条线程
 */
public class TortoiseAndRabbitRace {
    public static void main(String[] args){
        Race race = new Race();
        new Thread(race,"兔子").start();
        new Thread(race,"乌龟").start();
    }
}

class Race implements Runnable{
    public int steps = 1000;
    public String winner;

    @Override
    public void run(){
        while(steps>0){
            if(Thread.currentThread().getName().equals("兔子")){
                try{
                    Thread.sleep(1);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            boolean flag = gameover(steps);
            if(flag){
                break;
            }else{
                //没到终点继续跑
                System.out.println(Thread.currentThread().getName()+"跑了"+steps-- +"步");
            }
        }
    }

    //决出胜利者
    public boolean gameover(int step){
        if(winner != null){
            //以产生胜利者
            return true;
        }

        if(step<=1){
            winner = Thread.currentThread().getName();
            System.out.println(winner+"赢了");
            return true;
        }
        return false;
    }
}




