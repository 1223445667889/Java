package WINSOCK.DUP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;

public class SendDemo1 {
    public static void main(String[] args)throws IOException {
        System.out.println("发送方启动中....");
        //使用DatagramSocket指定端口，创建发送端
        DatagramSocket client = new DatagramSocket(8888);

        //准备数据，一定要转成字节数组
        String data = "Java YYDS!";

        //封装成DatagramSocket包裹，需要走指定目的地(IP+port)
        byte[] datas = data.getBytes();
        DatagramPacket packet = new DatagramPacket(datas,0,datas.length,new InetSocketAddress("localhost",9999));

        //发送包裹void send(DatagramPacket p)
        client.send(packet);

        //释放资源
        client.close();
    }
}
