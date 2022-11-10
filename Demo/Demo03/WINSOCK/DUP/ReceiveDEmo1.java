package WINSOCK.DUP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDEmo1 {
    public static void main(String[] args)throws IOException {
        System.out.println("接收方启动...");
        DatagramSocket ds = new DatagramSocket(9999);//同一台机器操作时端口名不要冲突
        byte[] byt = new byte[1024*60];
        DatagramPacket dp = new DatagramPacket(byt,0,byt.length);
        ds.receive(dp);//阻塞式
        byte[] datas = dp.getData();
        int len = dp.getLength();
        System.out.println(new String(datas,0,len));
        ds.close();
    }
}
