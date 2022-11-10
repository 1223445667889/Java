package WINSOCK.DUP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
    public static void main(String[] args)throws IOException {
        //创建接收端的Socket的对象(DatagramSocket)
        DatagramSocket ds = new DatagramSocket(10086);

        //创建一个数据包，用于接收数据
        byte[] byt = new byte[1024];
        DatagramPacket dp = new DatagramPacket(byt,byt.length);

        //调用DatagramSocket对象的方法接收数据
        ds.receive(dp);

        //解析数据包，并把数据在控制台上显示
        System.out.println("数据是："+new String(dp.getData(),0,dp.getLength()));

        //关闭接收端，释放资源
        ds.close();
    }
}
