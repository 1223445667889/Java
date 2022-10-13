package gongsi.xiangmu.raise;

public class FangdaoMen extends Door implements Lock{
    @Override
    public void open() {
        System.out.println("开门");

    }

    @Override
    public void close() {
        System.out.println("关门");

    }

    @Override
    public void lock() {
        System.out.println("左转三圈，上锁");
    }

    @Override
    public void unlock() {
        System.out.println("右转三圈，解锁");
    }
}
