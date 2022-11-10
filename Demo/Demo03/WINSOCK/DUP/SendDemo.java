package WINSOCK.DUP;

import java.io.IOException;
import java.net.*;

/**
 * 网络通信 UDP DataramSocket:用于发送或接收数据包的套接字
 *                          void send(DatagramPacket p)	从此套接字发送数据报包
 *                          void receive(DatagramPacket p)	从此套接字接收数据报包（阻塞式的接收）
 *            DataramPaket:数据包
 *                         （接收方） DatagramPacket(byte[] buf, int length)	构造一个 DatagramPacket用于接收长度的数据包 length
 *                         （发送方）DatagramPacket(byte[] buf, int offset, int length, InetAddress address, int port)
 *                          构造用于发送指定长度的数据报包到指定主机的指定端口号上
 *                          int getLength()	返回要发送的数据的长度或接收到的数据的长度
 *                          byte[] getData()	返回数据缓冲区
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        //创建发送端的socket对象（DatagramSocket）
        DatagramSocket ds = new DatagramSocket();

        //创建数据，并把数据打包
        byte[] bys = "Java YYDS!".getBytes();
        DatagramPacket dp = new DatagramPacket(bys,bys.length, InetAddress.getByName("127.0.0.1"), 10086);

        //调用DatagraSocket对象的方法发送数据
        ds.send(dp);

        //关闭发送端
        ds.close();
    }
}
