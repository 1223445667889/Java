package WINSOCK.DUP.Practise;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * UDP接收数据：
 *          因为接收端不知道发送端什么时候停止发送，故采用死循环接受
 */
public class Receive1 {
    public static void main(String[] args) throws IOException {
        //创建接收端的Socket对象
        DatagramSocket ds = new DatagramSocket(12345);

        while(true){
            //创建一个数据包，用于接收数据
            byte[] byt = new byte[1024];
            DatagramPacket dp = new DatagramPacket(byt,byt.length);

            //调用DatagramSocket对象方法的接收数据
            ds.receive(dp);

            //解析数据包，并把数据在控制台显示
            //int getLength(); 返回要发送的数据的长度或接收到数据的长度
            System.out.println("接收到的数据是:"+new String(dp.getData(),0,dp.getLength()));

            ds.close();
        }

    }
}
